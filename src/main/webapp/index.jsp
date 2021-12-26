<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bus Ticket</title>
    <style>
        .container {
            direction: rtl;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .navbar {
            padding: 0.5rem;
            text-align: center;
            font-size: 0.8rem;

        }

        .navbar > * {
            background-color: darkslategray;
            padding: 0.5rem;
            border-radius: 0.5rem;
            text-decoration: none;
            color: white;
        }

        .navbar > *:hover {
            color: tomato;
        }

        .searchBox {
            justify-content: center;
            color: white;
            margin: 0.5rem;
            border-radius: 0.5rem;
            padding: 0.5rem;
            background-color: darkslategray;

        }

        .searchBox > form > a {
            text-align: center;
            color: black;
            padding: 0.2rem 0.5rem 0.4rem 0.5rem;
            border-radius: 0.2rem;
            text-decoration: none;
            background-color: white;
            margin-right: 1rem;
        }

        .searchBox > form > a:hover {
            background-color: cadetblue;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="navbar">
        <a href="">ورود</a>
        <a href="">ثبت نام</a>
    </div>
    <div class="searchBox">
        <form action="">
            مبدا : <input type="text" name="origin" placeholder="مبدا را تایپ نمایید">
            مقصد : <input type="text" name="destination" placeholder="مقصد را تایپ نمایید ">
            تاریخ : <input type="date" name="date">
            <input type="submit" value="جستجو" style="padding: 0.2rem 2rem;">
        </form>
    </div>

</div>

</body>
</html>