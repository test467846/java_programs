package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.service.EmpServiceImpl;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmpServiceImpl empServiceimp;

	public EmployeeController(EmpServiceImpl empServiceimp) {
		super();
		this.empServiceimp = empServiceimp;
	}

	public EmployeeController() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee controller::0-arg constructor");
	}
	
	@GetMapping("/employee")
	public String getAllEmp(Model model) {
		 model.addAttribute("employees", empServiceimp.getEmployeeDetails());	
	    	return "employee";
		
	}

}
