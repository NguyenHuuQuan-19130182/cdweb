package com.shoevn.shoe.Controller;

import com.shoevn.shoe.Beans.Account;
import com.shoevn.shoe.Dao.AccountDao;

import com.shoevn.shoe.Service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    AccountDao accountDao;

    @GetMapping("/login")
    public String loginForm() {
        return "Login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model,HttpServletRequest request) {
        Account account = accountService.findByUsername(username);
        if (account == null || !account.getPassword().equals(password)) {
            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
            return "Login";
        }
        request.getSession().setAttribute("user",account);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("account", new Account());
        return "register";
    }

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute Account account, Model model) {
        if (accountService.findByUsername(account.getUsername()) != null) {
            model.addAttribute("error", "Tài khoản đã tồn tại");
            return "register";
        }
        accountService.save(account);
        return "redirect:/login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }
}
