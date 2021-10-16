<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:actionerror/>

<s:form action="login" method="post">
    <s:textfield name="loginUser.account" key="login.account.lable"/>
    <s:password name="loginUser.password" key="login.password.lable"/>
    <s:submit key="login.submit.button"/>
</s:form>

</body>
</html>