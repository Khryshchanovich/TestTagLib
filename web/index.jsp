<%--
  Created by IntelliJ IDEA.
  User: klinster
  Date: 28.05.2017
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/myTagLib.tld" prefix="mytag"%>
<html>
  <head>
    <title>My tag in work</title>
  </head>
  <body>
    <h1>Date Format</h1>
    <mytag:today formatdate="MM, dd, yyyy"/>
    <hr>
    <h1>Text repeat</h1>
    <mytag:textrepeat repeatCount="5">
      <p>Тут могла быть ваша реклама!</p>
    </mytag:textrepeat>
    <hr>
    <h1>Text in registr</h1>
    <mytag:text registr="Upper">
      <p>Текст в выбранном регистре.</p>
    </mytag:text>
  </body>
</html>
