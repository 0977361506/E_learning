package com.vnpost.e_learning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/index")
  public String index() {
	  return "index";
  }
	@RequestMapping("/home/index")
	  public String index11() {
		  return "admin/GiaoDien/test";
	  }
	@RequestMapping("/admin/index")
	  public String indexadmin() {
		  return "user/Test/admin";
	  }
	
}
