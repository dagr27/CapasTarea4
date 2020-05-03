package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;

@Controller
public class MainController {
	@RequestMapping("/Producto")
	public ModelAndView producto(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Producto());
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			mav.addObject("code", product.getCodigo());
			mav.addObject("name", product.getNombre());
			mav.setViewName("resultado");
		}
		
		return mav;
	}
	
}
