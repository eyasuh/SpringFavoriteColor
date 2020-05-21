package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class HomeController {
	Random rand = new Random();


	@GetMapping("/form")
	public String loadForm(Model model){
		int randNum = rand.nextInt(2);
		model.addAttribute("randNum", randNum);
		model.addAttribute("question", new Question());
		return "form";
	}

	@PostMapping("/form")
	public String processForm(@Valid Question question, BindingResult result) {
		if (result.hasErrors())
			return "form";
		else
			return "displayForm";
	}
}
