package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", value = "/calculate")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        PrintWriter printWriter = response.getWriter();

        printWriter.write("<html>");
        double result;

        try {
            switch (operator){
                case "addition":{
                    result = firstOperand + secondOperand;
                    break;
                }
                case "subtraction":
                    result = firstOperand - secondOperand;
                    break;
                case "multiplication":
                    result = firstOperand * secondOperand;
                    break;
                case "division":
                    result = firstOperand / secondOperand;
                    break;
                default:
                    result = 0;
                    break;
            }
            printWriter.println("Result: " + result);
        }

        catch (Exception e){
            printWriter.println("Exception");
        }
        printWriter.write("</html>");
    }
}
