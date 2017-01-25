package controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

import jpa.NewEmployee;
import jpa.TestNewEmployee;

	@Controller
	public class EmployeeController {
		
		

		@RequestMapping(value="/emp",method=RequestMethod.GET)
		public ModelAndView usetInit()
		{
			 NewEmployee e = new NewEmployee();    
		      
			
			return new ModelAndView("emp","command",e);
		}
		
		@RequestMapping(value="/success",method=RequestMethod.POST)
		public String view(@ModelAttribute("SpringWeb")NewEmployee e,ModelMap model)
		{
			
			
			String name=e.getName();
			String qualification=e.getQualification();
			
			model.addAttribute("name",name);
			model.addAttribute("qualification",qualification);
			
			
			TestNewEmployee.createEmployee(name, qualification);
			
			return "Detail";
			
		}
		
		
	}

