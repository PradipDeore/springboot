package com.example.HelloUniverse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/getCapital")
    public String getCapital(@RequestParam String country, ModelMap model) {
        String[] countries = {"England", "France", "India", "Nepal", "USA", "Shrilanka"};
        String[] capitals = {"London", "Paris", "New Delhi", "Kathmandu", "Washington, D.C", "colombo"};

        String capital = "Unknown";
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                capital = capitals[i];
                break;
            }
        }
        model.put("capital", capital);
        return "capital";
    }
}
