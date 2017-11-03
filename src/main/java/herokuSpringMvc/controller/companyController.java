package herokuSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class companyController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		return "test";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome()
	{
		return "welcome";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}

}
