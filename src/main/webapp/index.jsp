<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>

    <body>

        <h1>Welcome To Struts 2!</h1>
        <h4>Enter your name so that we can customize a greeting just for you!</h4>
        <%-- We are using a form tag here so that you can pass the data from jsp to action (java) for use later. --%>
        <s:form action="hello">
            <s:textfield name="name" label="Your name"/>
            <s:submit/>
        </s:form>
<%--        <p><a href="<s:url action='hello'/>">Hello World</a></p>--%>
    </body>
</html>