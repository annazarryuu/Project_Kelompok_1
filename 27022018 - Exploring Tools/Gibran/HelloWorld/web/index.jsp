<%-- 
    Document   : index
    Created on : Feb 27, 2018, 12:04:21 PM
    Author     : Gibran
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println("<br/> Your IP address is " + request.getRemoteAddr());
            
            String userAgent = request.getHeader("user-agent");
            String browser = "unknown";
            
            out.print("<br/> and your browser is ");
            if (userAgent != null){
                if (userAgent.indexOf("MSIE") > -1){
                    browser = "MS Internet Explorer";
                }else if (userAgent.indexOf("Firefox") > -1){
                    browser = "Mozilla Firefox";
                }else if (userAgent.indexOf("Chrome") > -1){
                    browser = "Google Chrome";
                }else if (userAgent.indexOf("Safari") > -1){
                    browser = "Apple Safari";
                }
            }
            out.println(browser);
            out.println("<br/> <a href='ilham.jsp'>Connect to Ilham Gibran</a>");
        %>
    </body>
</html>
