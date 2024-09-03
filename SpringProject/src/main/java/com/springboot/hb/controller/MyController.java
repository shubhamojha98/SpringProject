package com.springboot.hb.controller;

import java.util.Optional;

import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.hb.Repo.EmployeeRepo;
import com.springboot.hb.model.Employee;
import com.springboot.hb.model.UserData;

@Controller
public class MyController {

	//employee work 18jan
	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping("/empform")
	public String empform()
	{
		return "empform";
	}
	
	@RequestMapping(value = "/empdata", method = RequestMethod.POST)
	public ModelAndView empData(Employee employee)
	{
	    ModelAndView mv=new ModelAndView("/wellcomehome");
	    Employee e=employeeRepo.save(employee);
	    
	    if (e!=null) {
	    	String msg="<font color=green>Record Added</font>";
			mv.addObject("msg",msg);			
		}
	    else {
	    	String msg="<font color=red>Record not Added</font>";
			mv.addObject("msg",msg);
		}
	    return mv;
	}
	
	
	//show All employee
	@GetMapping("/getemployee")
	public ModelAndView getAllEmployee() {
		
		ModelAndView mv=new ModelAndView("/showemployee");
		Iterable<Employee> list=employeeRepo.findAll();
		
		mv.addObject("list", list);
		return mv;		
	}
	
	//search Employee byId
	@RequestMapping(value = "/searchemployee" , method = RequestMethod.POST)
	public ModelAndView getSearchById(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("/wellcomehome");
		Optional<Employee> list=employeeRepo.findById(id);
		if (list.isPresent()) {
			Employee emp=list.get();
			mv.addObject("emp", emp);
			mv.addObject("msg", "<a href=showemp?emp="+id+">Record Found</a>");
		}else {
			mv.addObject("msg", "Record Not Found");
		}
		return mv;
	}
	
	//Show Employee By Id
	@GetMapping("/showemp")
	public ModelAndView showemp(@RequestParam int emp)
	{
		ModelAndView mv=new ModelAndView("/showemp");
		Optional<Employee> list=employeeRepo.findById(emp);
		Employee employee=list.get();
		mv.addObject("emp", employee);
		return mv;
	}
	
	
	@GetMapping("/")
	public String FirstDemo() { 
		return "wellcomehome";
	}
	
	@GetMapping("/home")
	public String home() { 
		return "home";
	}
	
	@GetMapping("/contactus")
	public String contactus() { 
		return "contactus";
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@RequestMapping("/userform")
	public String userform() {
		return "userform";
	}
	
	@RequestMapping(value="/userdata",method = RequestMethod.POST)
	public ModelAndView getUserData(UserData userdata) {
		ModelAndView mv=new ModelAndView("/userdetailes");
		mv.addObject("userdata",userdata);
		return mv;
	}
	
	
	@RequestMapping(value="/userdata",method = RequestMethod.GET)
	public ModelAndView getData(@RequestParam String user) {
		ModelAndView mv=new ModelAndView("/user");
		mv.addObject("user",user);
		return mv;
	}
	
	@GetMapping("/user/{uname}")
	public ModelAndView getuser(@PathVariable String uname) {
		ModelAndView mv=new ModelAndView("/user");
		mv.addObject("user",uname);
		return mv;
	}

}
