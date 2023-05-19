package com.shoevn.shoe.Controller;

import com.shoevn.shoe.Beans.Cart;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.Service.CategoryService;
import com.shoevn.shoe.Service.ProductService;
import com.shoevn.shoe.Service.SizeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ProductController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SizeService sizeService;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        List<Category> menuItems = categoryService.getAllCategory();
        modelMap.put("products", productService.getAllProduct());
        modelMap.put("menuItems", menuItems);
        return "index";
    }

    @GetMapping(value = "/categories/{categoryID}/products")
    public String productByCategory(ModelMap modelMap, @PathVariable("categoryID") long categoryID) {
        List<Category> menuItems = categoryService.getAllCategory();
        List<Product> listProduct = productService.getListByCategory(categoryID);
        long totalProducts = productService.getTotalProductByCategory(categoryID);
        modelMap.put("menuItems", menuItems);
        modelMap.put("listProduct", listProduct);
        modelMap.addAttribute("totalProducts", totalProducts);
        return "product";
    }

    @GetMapping(value = "/parent/{parentID}/products")
    public String productByParentID(ModelMap modelMap, @PathVariable("parentID") long parentID) {
        List<Category> menuItems = categoryService.getAllCategory();
        List<Product> listProducts = productService.getLstProductParentId(parentID);
        long totalProducts = productService.getTotalProduct(parentID);
        modelMap.put("menuItems", menuItems);
        modelMap.put("listProduct", listProducts);
        modelMap.addAttribute("totalProducts", totalProducts);
        return "product";
    }

    @GetMapping("/products/{productId}/info-product")
    public String info(ModelMap modelMap, @PathVariable("productId") long productId) {
        List<Category> menuItems = categoryService.getAllCategory();
        modelMap.put("products", productService.getAllProductID(productId));
        modelMap.put("menuItems", menuItems);
        modelMap.put("sizes", sizeService.getAllSizeById(productId));
        return "infoproduct";
    }

    @PostMapping("/sort")
    public String sortProducts(@RequestParam("sortType") String sortType, Model model) {
        List<Product> products = productService.sortProducts(sortType);
        List<Category> menuItems = categoryService.getAllCategory();
        model.addAttribute("listProduct", products);
        model.addAttribute("menuItems", menuItems);
        System.out.println(products);
        return "product";
    }

    @GetMapping("cart")
    public String viewCart(ModelMap model, HttpSession session) {
        List<Category> menuItems = categoryService.getAllCategory();
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        model.put("menuItems", menuItems);
        model.addAttribute("cart", cart);

        return "cart";
    }

//    @RequestMapping(value = "add/{productId}/size/{sizeId}", method = RequestMethod.GET)
//    public String viewAdd(ModelMap mm, HttpSession session, @PathVariable("productId") long productId,@PathVariable("sizeId") long sizeId) {
//        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
//        List<Category> menuItems = categoryService.getAllCategory();
//        if (cartItems == null) {
//            cartItems = new HashMap<>();
//        }
//        Product product = productService.getAllProductID(productId);
//        Size size = sizeService.getSizeById(sizeId);
//        if (product != null) {
//            if (cartItems.containsKey(productId)) {
//                Cart item = cartItems.get(productId);
//                item.setProduct(product);
//                item.setQuantity(item.getQuantity() + 1);
//                cartItems.put(productId, item);
//
//            } else {
//                Cart item = new Cart();
//                item.setProduct(product);
//                item.setQuantity(1);
//                cartItems.put(productId, item);
//                cartItems.put(sizeId,item);
//            }
//        }
//        mm.put("menuItems", menuItems);
//        session.setAttribute("myCartItems", cartItems);
//        session.setAttribute("myCartTotal", totalPrice(cartItems));
//        session.setAttribute("myCartNum", cartItems.size());
//        return "cart";
//    }

    @GetMapping(value = "add/{productId}/size")
    public String viewAdd(ModelMap mm, HttpSession session,@PathVariable("productId") long productId) {
        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        List<Category> menuItems = categoryService.getAllCategory();
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        Product product = productService.getAllProductID(productId);

        if (product != null) {
            if (cartItems.containsKey(productId) ) {
                Cart item = cartItems.get(productId);
                item.setProduct(product);
                item.setQuantity(item.getQuantity()+1);
                item.setSize(item.getSize());
                cartItems.put(productId, item);

            } else {
                Cart item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                item.setSize(item.getSize());
                cartItems.put(productId, item);
            }
        }
        mm.put("menuItems", menuItems);
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        session.setAttribute("myCartNum", cartItems.size());
        return "cart";
    }

    @RequestMapping(value = "remove/{productId}", method = RequestMethod.GET)
    public String viewRemove(ModelMap mm, HttpSession session, @PathVariable("productId") long productId) {
        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        List<Category> menuItems = categoryService.getAllCategory();
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
        }
        mm.put("menuItems", menuItems);
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        session.setAttribute("myCartNum", cartItems.size());
        return "cart";
    }

    public double totalPrice(HashMap<Long, Cart> cartItems) {
        int count = 0;
        for (Map.Entry<Long, Cart> list : cartItems.entrySet()) {
            count += list.getValue().getProduct().getPrice() * list.getValue().getQuantity();
        }
        return count;
    }

    @GetMapping("/product/search")
    public String search(ModelMap modelMap,@RequestParam String key){
        List<Category> menuItems = categoryService.getAllCategory();
        List<Product> searchResults = productService.search(key);

        modelMap.put("menuItems", menuItems);
        modelMap.put("listProduct",searchResults);
        return "product";
    }
}
