package welcome_page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

		@RequestMapping("/homee")
		public String page(Model model)
		{
			String name="RRR";
			model.addAttribute("movieName",  name);
			model.addAttribute("two","RRR");
			return "homepage";
		}
		
		@RequestMapping("/processOrder")
		public String processOrder()
		{
			return "process-order";
		}
}
