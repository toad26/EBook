package com.bookst.Controllers;

import com.bookst.Entities.Role;
import com.bookst.Entities.User;
import com.bookst.Entities.UserRole;
import com.bookst.Repositories.RoleRepository;
import com.bookst.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
    RoleRepository roleRepository;


//    @Autowired
//    JavaMailSender mailSender;

//    @Autowired
//    MailConstructor mailConstructor;

    @Autowired
    private UserSecurityService userSecurityService;

    @Autowired
    private UserPaymentService userPaymentService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private UserShippingService userShippingService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/")
    public String index()
    {
        return "login";

    }

    @RequestMapping("/home")
    public String login()
    {
        return "home";

    }


    @GetMapping("/registration")
    public String registrationG(Model model) {

        model.addAttribute("path", "/users/create");

        return "registration";
    }



    @PostMapping("/registration")
    public String create(@Valid @ModelAttribute User u, BindingResult bd, Model model) {

        if (bd.hasErrors()) {
            model.addAttribute("user", u);
            model.addAttribute("path", "/registration");
            return "login/registration";
        }

        Role role = roleRepository.findByname("ROLE_ADMIN");

        Set<UserRole> userRoles = new HashSet<UserRole>();
        userRoles.add(new UserRole(u, role));


        userService.save(u);
        model.addAttribute("user", u);

        return "redirect:/";
    }

}
