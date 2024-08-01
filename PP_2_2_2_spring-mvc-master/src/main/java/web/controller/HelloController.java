package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

	@GetMapping("/")
	public String printWelcome(ModelMap model) {
		List<String> messages = List.of("Hello!", "I'm Spring MVC application", "5.2.0 version by sep'19");
		model.addAttribute("messages", messages);
		return "index";  // Предполагается, что есть файл index.html в /WEB-INF/pages/
	}
}
