package cz.equahatchery.guestbook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringEscapeUtils;
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
     *
     * @param request Http request
     * @param response Http Respons
     * @param model Data Model
     * @return view with typed name in welcome page
     * @throws Exception
     */
    @RequestMapping("/showname")
    public String addGuest(HttpServletRequest request,
            HttpServletResponse response, ModelMap model) throws Exception {

        final String name = request.getParameter("name");

        if (name == null || name.equals("") || name.equalsIgnoreCase("null")) {
            model.addAttribute("action", "show your name");
            model.addAttribute("reason", "You did not type your name!");
            model.addAttribute("link", "./welcome");
            model.addAttribute("linkCaption", "Take me to home page!");
            return "fail";
        } else {
            model.addAttribute("name", StringEscapeUtils.escapeHtml(name));
            return ("guestList");
        }
    }
}
