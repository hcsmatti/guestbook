package cz.equahatchery.guestbook.controller;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controls requests to view welcome page
 *
 * @author Michal Materna
 */
@Controller
public class WelcomeController {

    /**
     * Controls handShake
     * @param request  Http request
     * @param response Http Respons
     * @param model Data Model
     * @return welcome page
     * @throws Exception 
     */
    @RequestMapping("/welcome")
    public String handShake(HttpServletRequest request,
            HttpServletResponse response, ModelMap model) throws Exception {
        
        model.addAttribute("serverName", request.getServerName());
        model.addAttribute("time", Calendar.getInstance().getTime());
        
        return ("hello");

    }
}
