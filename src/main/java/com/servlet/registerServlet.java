package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.UserDAO;
import com.DB.DBConnect;
import com.entites.User;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	    
		User us=new User();
    	us.setuname(uname);
    	us.setEmail(email);
    	us.setPassword(password);
    	
    	UserDAO  dao=new UserDAO(DBConnect.DgetConnection());
    	boolean f=dao.userRegister(us);
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Registration Sucessfully...");
    		response.sendRedirect("register.jsp");
    		
    	}
    	}

}
