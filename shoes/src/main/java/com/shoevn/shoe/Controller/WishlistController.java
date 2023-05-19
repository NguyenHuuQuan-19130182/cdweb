package com.shoevn.shoe.Controller;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Wishlist;
import com.shoevn.shoe.Service.CategoryService;
import com.shoevn.shoe.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class WishlistController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    private List<Wishlist> wishlists = new ArrayList<>();

    @GetMapping("/wishlist")
    public String viewToWishlist(ModelMap modelMap) {
        List<Category> menuItems = categoryService.getAllCategory();
        modelMap.put("menuItems", menuItems);
        return "wishlist";
    }

    @GetMapping("/wishlist/{productId}/add")
    public String addToWishlist(ModelMap modelMap, @PathVariable("productId") long productId) {
        List<Category> menuItems = categoryService.getAllCategory();
        // Lấy thông tin sản phẩm từ cơ sở dữ liệu
        Product product = productService.getAllProductID(productId);
        // Tạo một đối tượng WishlistItem từ thông tin sản phẩ
        Wishlist item = new Wishlist();
        item.setId(product.getId());
        item.setImg(product.getImg());
        item.setName(product.getName());
        item.setPrice(product.getPrice());
        item.setSellPrice(product.getSellPrice());

        wishlists.add(item);

        modelMap.put("menuItems", menuItems);
        modelMap.put("wishlist", wishlists);
        return "wishlist";
    }

    @GetMapping("/wishlist/{productId}/remove")
    public String removeToWishlist(ModelMap modelMap, @PathVariable("productId") long productId) {
        List<Category> menuItems = categoryService.getAllCategory();
        Product product = productService.getAllProductID(productId);

        // Tìm kiếm sản phẩm trong danh sách Wishlist theo id
        Optional<Wishlist> item = wishlists.stream().filter(items -> items.getId() == productId).findFirst();
        // Nếu sản phẩm tồn tại trong danh sách, xóa nó khỏi danh sách
        item.ifPresent(wishlists::remove);

        modelMap.put("menuItems", menuItems);
        modelMap.put("wishlist", wishlists);
        return "wishlist";
    }
}
