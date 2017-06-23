

<%-- 
    Document   : student
    Created on : 30 Aug, 2016, 2:28:45 PM
    Author     : mohitm@bdcvit.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Okay</h1>
         <form action="${pagecontext.request.contextpath}/myservlet" method="post" >
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
    </body>
</html>
