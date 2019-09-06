package comm.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDAO {
	
	@Autowired
	Jtemplate jtemplate;

	public StudentDAO(Jtemplate jtemplate) {
		super();
		this.jtemplate = jtemplate;
	}

	public StudentDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jtemplate getJtemplate() {
		return jtemplate;
	}

	public void setJtemplate(Jtemplate jtemplate) {
		this.jtemplate = jtemplate;
	}
	

}
