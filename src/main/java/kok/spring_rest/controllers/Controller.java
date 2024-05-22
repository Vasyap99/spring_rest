package kok.spring_rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



//import org.hibernate.*; //для сессий

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("")
    public String index(){
        return "{'1':1,'2':2}";
    }

}
