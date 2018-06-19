package com.brant.ninjagold;



import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	ArrayList<String> action = new ArrayList<String>(5);
	Integer gold=0;
	Integer count=0;
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/proccess")
	public String proccess(@RequestParam(value="income") String income, HttpSession session, RedirectAttributes flash) {
		if (count==0) {
			session.setAttribute("gold", "0");
		}
		count+=1;
		session.setAttribute("count", count);
		System.out.println(count.toString());
		
		java.util.Date date = new java.util.Date();
		if (income.equals("farm")) {
			int money=(int)(Math.random() * 10 + 10);
			gold+=money;
			session.setAttribute("gold", gold.toString());
			
			action.add( "You entered a farm and earned "+money+" gold "+date);
			
			
		}
		if (income.equals("cave")) {
			int money=(int)(Math.random() * 5 + 5);
			gold+=money;
			session.setAttribute("gold", gold.toString());
			action.add( "You entered a cave and earned "+money+" gold "+date);
			
		}
		if (income.equals("house")) {
			int money=(int)(Math.random() * 3 + 2);
			gold+=money;
			session.setAttribute("gold", gold.toString());
			action.add( "You entered a house and earned "+money+" gold "+date);			
		}
		if (income.equals("casino")) {
			int money=(int)(Math.random() * 100 - 50);
			gold+=money;
			session.setAttribute("gold", gold.toString());
			action.add( "You entered a casino and earned "+money+" gold "+date);			
		}
		session.setAttribute("action", action);
		return "redirect:/";
	}
}
