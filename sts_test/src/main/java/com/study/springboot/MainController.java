package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	 @RequestMapping("/")
	 public @ResponseBody  String root() {
		 return "Hi...";
	 }
	 
	 @RequestMapping("/test")
	 public @ResponseBody  String test() {
		 return "Hi.test..";
	 }
}
