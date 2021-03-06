package com.src.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Admin;
import com.src.model.Employee;
import com.src.service.EmployeeService;

@Controller
public class UserController {
	private static final Logger logger = Logger
			.getLogger(UserController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/newUser")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		
		return new ModelAndView("redirect:/newUser");
	}
	
	@RequestMapping(value = "/loginuser")
	public ModelAndView adminLogin(ModelAndView model) throws IOException {
		Employee employee = new Employee();		
		model.addObject("employee", employee);		
		model.setViewName("loginuser");
		return model;
	}
	@RequestMapping(value = "/registeruser")
	public ModelAndView adminLogin(@ModelAttribute("employee")Employee ad,ModelAndView model) throws IOException {
		
		boolean b=employeeService.userValidate(ad);
		
		if(b)
		{
		model.setViewName("usersuccess");
		}
		else
		{
			model.setViewName("loginuser");
		}
		return model;
	}
	
	
	
	
	
	
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}

}

