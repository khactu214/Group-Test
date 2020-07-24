package com.example.demotest.controller;

import com.example.demotest.da.UserLogin;
import com.example.demotest.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@WebServlet(name = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);


        if (UserLogin.checkUser(username,password) == true){
            HttpSession httpSession = request.getSession(false);
            httpSession.setAttribute("Khanh",user);
            response.sendRedirect("product-list");

        }else {
            response.sendRedirect("login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
