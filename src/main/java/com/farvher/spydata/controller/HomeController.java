package com.farvher.spydata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	//TODO convertir boolean a un tipo wrapper
	private boolean activado;
	
	
	@GetMapping("/")
	@ResponseBody
	public String home () {
		return "Felicidades, este es el home de la aplicacion!!";
		
	}

}
