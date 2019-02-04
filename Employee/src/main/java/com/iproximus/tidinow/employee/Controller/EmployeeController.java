package com.iproximus.tidinow.employee.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




import com.iproximus.tidinow.employee.Repository.EmployeeRepository;
import com.iproximus.tidinow.employee.model.Employee;



@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "home.jsp";
	}
	
}
