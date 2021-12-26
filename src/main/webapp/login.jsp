<%--
  Created by IntelliJ IDEA.
  User: Neva-L
  Date: 12/25/2021
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        .container{
            display: flex;
            direction: rtl;
            width: fit-content;
            margin: 0  auto;
            border-radius: 0.5rem;
            background-color: darkslategray;
            padding: 0.5rem;
            align-items: center;
        }
        .container>form>*{
            display: flex;
            flex-direction: column;
            margin: 0.5rem;
        }

    </style>
</head>
<body>
<div class="container">
    <form action="">
        <h3 style="text-align: center; color: white;">ورود </h3>
        <input type="text" name="username" placeholder=" نام کاربری">
        <input type="text" name="password" placeholder="کلمه عبور ">
        <input type="submit" value="ورود" >
    </form>
</div>

</body>
</html>
