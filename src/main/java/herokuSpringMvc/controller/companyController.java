package herokuSpringMvc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class companyController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		return "login";
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
