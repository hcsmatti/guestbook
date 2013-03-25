package cz.equahatchery.guestbook.controller;

import cz.equahatchery.guestbook.dao.entity.GuestEntity;
import cz.equahatchery.guestbook.dao.repository.GuestRepository;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for work with records in guestbook
 *
 * @author Michal Materna
 */
@Controller
public class GuestBookController {

    @Inject
    private GuestRepository repository;

    /**
     * Controls incoming from hello page and take care about guests signs
     *
     * @param request Http request
     * @return view with guests List
     */
    @RequestMapping("**/showGuestBook")
    public ModelAndView guestbook(HttpServletRequest request) {
        
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        final GuestEntity guest = new GuestEntity();
        if (name != null) {
            final SimpleDateFormat df = new SimpleDateFormat("HH:mm dd.MM.YYYY");
        
            guest.setName(name);
            guest.setTime(df.format(Calendar.getInstance().getTime()).toString());

            repository.save(guest);
        }
        // Prepare the result view (guestList.jsp):
        return new ModelAndView("guestList", "GuestRepository", repository);
    }
}
