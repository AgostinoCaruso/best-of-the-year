package org.lessons.java.best_of_the_year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Best of the Year by Agostino");
        return "home";
    }
}
