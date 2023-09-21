<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Confirmation</title>
</head>

<body>

    <h2>Welcome Struts User <s:property value="firstName" />!</h2>
    <h3>These are your user details!</h3>

    <s:label value="First Name:"/>
    <s:property value="firstName"/>
    <br/>

    <s:label value="Last Name:"/>
    <s:property value="lastName"/>
    <br/>

    <s:label value="Gender:"/>
    <s:property value="gender"/>
    <br/>

    <s:label value="Age:"/>
    <s:property value="age"/>
    <br/>

    <s:label value="Email:"/>
    <s:property value="email"/>
    <br/>

</body>
</html>
