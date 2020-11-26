package com.epsilon.training.springboot.mvc.resource;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorResource implements ErrorController{
	
	@GetMapping("/error")
	public String customError() {
		return "The link you followed may be broken, or the page may have been removed.";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
