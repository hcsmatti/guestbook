<%-- 
    Document   : fail
    Created on : 23.3.2013, 0:07:29
    Author     : HCS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fail</title>
    </head>
    <body>
        <h1>Fail</h1>
        <br/>
        Action ${action} failed.<br/>
        ${reason}<br/>
        <a href="${link}">${linkCaption}</a>
        
    </body>
</html>
