package frent_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActionController {
		
		@ResponseBody()
		@RequestMapping("/action")
		public String showActionMovie()
		{
			return "action movie shown..";
		}
}
