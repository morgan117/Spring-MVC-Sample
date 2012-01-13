package xyz.sample.baremvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value="/")
		public String home() {

			System.out.println("Homecontroller:passing through");
			return "home2";
		}

	@RequestMapping(value="/userInput") 
		public String compare(@RequestParam("input1") String input1, Model model) {
			String output = "The number you have " + input1;
			model.addAttribute("output", output);
			return "compareResult";
		}	

}	


