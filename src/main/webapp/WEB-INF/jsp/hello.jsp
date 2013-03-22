<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        Hello from ${serverName}, actual time is ${time}<br/>
        <br/>
        <form action="../showname/">
            <label>Type your name:</label>
            <input type="text" id="name" name="name" value="Pepa"/><br/>
            <input type="submit" value="Send"/>
        </form>
        <br/>
        <a href="../showname">Show me Guest Book</a>
    </body>
</html>
