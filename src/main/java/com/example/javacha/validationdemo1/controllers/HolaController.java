package com.example.javacha.validationdemo1.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.javacha.validationdemo1.annotations.Contexto;

@Controller
public class HolaController {
	
	@Autowired
	Map<String, String> datos;
	
	@GetMapping("/hola")
	public String hola (@RequestParam(name="name", required=false, defaultValue="World") @Valid @Contexto String name, Model model) {
        model.addAttribute("name", name);
        return "hola";      
	}
}
