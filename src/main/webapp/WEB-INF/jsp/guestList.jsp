<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="cz.equahatchery.guestbook.dao.entity.GuestEntity"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="cz.equahatchery.guestbook.dao.repository.*"%>
 
<jsp:useBean id="GuestRepository" type="cz.equahatchery.guestbook.dao.repository.GuestRepository" scope="request" />
 
 
<html>
    <head>
        <title>JPA Guestbook</title>
    </head>
 
    <body>
        <h2> GuestBook </h2>
        <form action="showGuestBook">
            <label>Type your name:</label>
            <input type="text" id="name" name="name"/><br/>
            <input type="submit" value="Add"/>
        </form>
        
        <hr><ol> 
        <% for (GuestEntity guest : GuestRepository.getAllGuests()) { %>
            <li> <%= guest %> </li>
        <% } %>
        </ol><hr>
       	
	</body>
</html>