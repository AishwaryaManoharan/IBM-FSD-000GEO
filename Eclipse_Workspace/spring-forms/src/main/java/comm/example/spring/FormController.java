package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class FormController {
	
	@GetMapping("/showForm")
	public String frontController(Model theModel)
	{
		Student student=new Student();
		theModel.addAttribute("student",student);
		return "StudentForm";
	}
	
	@PostMapping("/processForm")
	public String processpage(@ModelAttribute("student") Student theStudent,Model theModel)
	{
		theModel.addAttribute("tempStudent",theStudent);
		System.out.println("theStudent: " + theStudent.getFirstName()
		+ " " + theStudent.getLastName());
		return "processForm";
	}
}
