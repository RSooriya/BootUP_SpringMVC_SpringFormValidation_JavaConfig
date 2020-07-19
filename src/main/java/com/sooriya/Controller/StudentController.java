package com.sooriya.Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sooriya.Entity.Student;

@Controller
public class StudentController {
@InitBinder
public void initBinder(WebDataBinder binder)
{
	StringTrimmerEditor editor = new StringTrimmerEditor(true);
	binder.registerCustomEditor(String.class,editor);
}
@RequestMapping("/showForm")
public String showForm(Model model)
{
	model.addAttribute("student", new Student());
	return "showForm";
}
@RequestMapping("/processForm")
public String processForm(@Valid @ModelAttribute("student") Student theStudent,BindingResult result)
{
	System.out.println(theStudent.getName() +" " +theStudent.getAge());
	if(result.hasErrors())
	{
		return "showForm";
	}
	else
	return "successData";
}



}
