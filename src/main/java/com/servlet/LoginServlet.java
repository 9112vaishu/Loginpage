package com.servlet;



import java.io.IOException;

import com.DAO.UserDAO;
import com.DB.DBConnect;
import com.entites.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    
	    UserDAO dao=new UserDAO(DBConnect.DgetConnection());
	    User user=dao.getlogin(email, password);
	    
	    if(user!=null)
	    {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("user-ob",user);
	    	response.sendRedirect("home.jsp");
	    	 
	    	HttpSession session2=request.getSession();
    		session2.setAttribute("logout-msg","logout Sucessfully...");
    		
//	    	response.sendRedirect("login.jsp");
	    }
	    else {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("error-msg", "somting went wrong..");
	    	response.sendRedirect("login.jsp");

	    }
	   
	}

}
