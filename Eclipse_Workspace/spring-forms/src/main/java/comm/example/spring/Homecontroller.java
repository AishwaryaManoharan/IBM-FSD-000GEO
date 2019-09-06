package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {
	
	@GetMapping("/")
	public String gohome()
	{
		return "main-menu";
	}

}
