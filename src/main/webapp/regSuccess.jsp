<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2021/9/27
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
  <s:head theme="xhtml"/> <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<!-- 数据标签 property -->
<s:property value="loginUser.name"/>
<!-- 控制标签 if/else -->
<s:if test="%{loginUser.sex == \"1\"}">
  <s:text name="先生，"/>
</s:if>
<s:else>
  <s:text name="女士，"/>
</s:else>
您注册成功了！<br>
您的生日为：<s:text name="loginUser.birthday"/>
<!-- 数据标签 set -->
<s:set name="user" value="loginUser" scope="session"/>
</body>
</html>
