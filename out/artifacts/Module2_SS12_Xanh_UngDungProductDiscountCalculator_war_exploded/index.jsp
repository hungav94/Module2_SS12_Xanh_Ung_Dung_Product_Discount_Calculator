<%--
  Created by IntelliJ IDEA.
  User: An Viet Hung
  Date: 9/18/2019
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng product discount calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/discount" method="post">
    <table>
        <tbody>
        <tr>
            <td>Product Description:</td>
            <td>
                <input type="text" name="productDescription"/>
            </td>
        </tr>
        <tr>
            <td>List Price:</td>
            <td>
                <input type="text" name="listPrice"/>
            </td>
        </tr>
        <tr>
            <td>Discount Percent:</td>
            <td>
                <input type="text" name="discountPercent"/>(%)
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Calculator Discount"/>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
