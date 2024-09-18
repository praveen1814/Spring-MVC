package frent_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ComedyController {
	

		@RequestMapping("/comedy")
		public String showComedyMovie()
		{
			return "index";
		}
}
