package com.cg.controller;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home(Model model,Principal p) {
		model.addAttribute("name",p.getName());
		return "index";
	}
	@Secured("ROLE_ADMIN")
	/*@RolesAllowed("ROLE_ADMIN")
	@PreAuthorize("hasRole('USER_ADMIN')")
	@PostAuthorize("hasRole('USER_ADMIN')")*/
	
	@RequestMapping("/admin/test")
	
	
	public String test() {
		return "test";
	}

}
