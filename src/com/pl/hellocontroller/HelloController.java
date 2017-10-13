package com.pl.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

// WITHOUT ANNOTATION
//public class HelloController extends AbstractController{
//	
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		ModelAndView modelandview = new ModelAndView("HelloPage");
//		modelandview.addObject("welcomeMessage","Hi User, welcome to the first Spring MVC Application");
//		
//		return modelandview;
//	}
//	
//REMOVED FROM spring-dispatcher-servlet.xml
//<bean name="/welcome.html" class="com.pl.hellocontroller.HelloController"/>
//<bean id="HandlerMapping" class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
	
@Controller
@RequestMapping("/greet")
public class HelloController {
		
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Hello world, welcome to the first Spring MVC Application");
			
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Hi world, welcome to the first Spring MVC Application");
			
		return model;
	}
	
	
	
}




