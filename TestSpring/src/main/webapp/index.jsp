<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Hello World!</h1>
        <form action="${pageContext.request.contextPath}/service/myservlet" method="post" >
            <p>Name     
                <input type="text" name="name" /></p>
            <p>id       
                <input type="text" name="id" /></p>
            <p>mobile    
                <input type="text" name="mobile" /></p>
            <p>Address        
                <input type="text" name="address" /></p>

            <p>Submit button.
                <input type="submit" name="submit" value="submit" /></p>

        </form>

        <h2>---Request Scope Date----</h2>
        <h2>${requestscopedate}</h2>
        <h2>---Session Scope Date----</h2>
        <h2>${sessionscopedate}</h2>

    </body>
</html>
