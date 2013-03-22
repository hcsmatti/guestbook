package cz.equahatchery.guestbook.controller;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for work with records in guestbook
 *
 * @author Michal Materna
 */
@Controller
public class GuestBookController {

    /**
     * Controls name typed in form on hello page
     * @param request
     * @param response
     * @param model
     * @return view with typed name in welcome page
     * @throws Exception 
     */
    @RequestMapping("/showname")
    public String handShake(HttpServletRequest request,
            HttpServletResponse response, ModelMap model) throws Exception {

        model.addAttribute("name", request.getParameter("name"));

        return ("guestList");
    }
}
