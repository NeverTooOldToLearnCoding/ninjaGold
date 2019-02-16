package com.codingdojo.ninjagold;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class HomeController {
	
    @RequestMapping("/")
    public String index(HttpSession session) {
    	
		if( session.getAttribute("activities") == null){
			session.setAttribute("activities", "");
			session.setAttribute("gold", 0);			
		}
        return "index.jsp";
    }
    
	@RequestMapping(value="/processgold", method=RequestMethod.POST)
	
    public String login(@RequestParam(value="building") String building,HttpSession session) {
	    	
			String currentDate = new SimpleDateFormat("dd/MM/yyyy HH:mm a").format(new Date());
			Random r = new Random();
			String activities = (String) session.getAttribute("activities");
			
			if ( building.equals("farm")) {
				Integer x = r.nextInt(21-10)+10;
				Integer gold = (Integer) session.getAttribute("gold");				
				gold = x+gold;
				session.setAttribute("gold", gold);

				session.setAttribute("activities", activities+"<p class = 'green'>Earned "+gold+" golds from the farm! (" + currentDate+ ")</p>");
				System.out.println(session.getAttribute("gold"));
			}
			if ( building.equals("cave")) {
				int x = r.nextInt(11-5)+5;
				Integer gold = (Integer) session.getAttribute("gold");				
				gold = x+gold;
				session.setAttribute("gold", gold);
				session.setAttribute("activities", activities+"<p class = 'green'>Earned "+gold+" golds from the farm! (" + currentDate+ ")</p>");
				System.out.println(session.getAttribute("gold"));
			}
			if ( building.equals("house")) {
				int x = r.nextInt(6-2)+2;
				Integer gold = (Integer) session.getAttribute("gold");				
				gold = x+gold;
				session.setAttribute("gold", gold);
				session.setAttribute("activities", activities+"<p class = 'green'>Earned "+gold+" golds from the farm! (" + currentDate+ ")</p>");
				System.out.println(session.getAttribute("gold"));
			}			
			if ( building.equals("casino")) {
				int z = r.nextInt(2-0)+0;
					if (z == 0) {
						Integer x = r.nextInt(51-0)+0;
						Integer gold = (Integer) session.getAttribute("gold");				
						gold = x+gold;
						session.setAttribute("gold", gold);
						session.setAttribute("activities", activities+"<p class = 'green'>Earned "+gold+" golds from the farm! (" + currentDate+ ")</p>");
						System.out.println(session.getAttribute("gold"));
					}
					if (z == 1) {
						Integer x = r.nextInt(51-0)+0;
						Integer gold = (Integer) session.getAttribute("gold");				
						gold = x-gold;
						session.setAttribute("gold", gold);
						session.setAttribute("activities", activities+"<p class = 'red'>Earned "+gold+" golds from the farm! (" + currentDate+ ")</p>");
						System.out.println(session.getAttribute("gold"));
				}
			}				
	    	return "redirect:/";
    }

}
