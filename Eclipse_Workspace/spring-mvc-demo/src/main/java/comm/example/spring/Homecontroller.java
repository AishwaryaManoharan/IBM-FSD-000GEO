package comm.example.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
	@RequestMapping("/")
	public String gohome()
	{
		return "main-menu";
	}

}