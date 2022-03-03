<%--
  Created by IntelliJ IDEA.
  User: TOAN NGUYEN
  Date: 3/3/2022
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Calculator</title>
    <style>

      form label {
        display: inline-block;
        width: 140px;
      }
      form input, form select {
        width: 160px;
      }
    </style>
  </head>
  <body>
   <h1>Simple Calculator</h1>
   <form action="/calculate" method="post">
     <fieldset>
       <legend><h3>Calculator</h3></legend>
       <label for="firstOperand">First operand</label>
       <input type="number" name="firstOperand" id="firstOperand">
       <br>

       <label for="operator">Operator</label>
       <select id="operator" name="operator">
         <option value="addition">Addition</option>
         <option value="subtraction">Subtraction</option>
         <option value="division">Division</option>
         <option value="multiplication">Multiplication</option>
       </select>
       <br>

       <label for="secondOperand">Second operand</label>
       <input type="number" name="secondOperand" id="secondOperand">
       <br>
       <button>Calculate</button>
     </fieldset>
   </form>
  </body>
</html>
