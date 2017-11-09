package herokuSpringMvc.controller;

import java.io.IOException;

import javax.servlet.annotation.WebFilter;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange;

@WebFilter("/*")
public class companyFilter extends Filter {

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doFilter(HttpExchange arg0, Chain arg1) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("filter used");
	}

}
