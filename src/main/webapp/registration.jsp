<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>

    <body>
        <h1>User Registration Details</h1>

        <s:form action="registerAction">
            <s:textfield name="firstName" label="First Name" />
            <s:textfield name="lastName" label="Last Name" />
            <s:radio name="gender" list="{'Male', 'Female'}" label="Gender" />
            <s:textfield name="age" label="Age" />
            <s:textfield name="email" label="Email" />
            <s:submit value="Register User"/>
        </s:form>
    </body>
</html>
