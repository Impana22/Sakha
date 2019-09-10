package com.SakhaG.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SakhaG.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet({ "/LoginController", "/lo" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginService Is=new LoginService();
		//if(username.equals("Impana")&&(password.equals("123"))){
		try {
			if(Is.validateLogin(username, password)) {
				HttpSession ssn=request.getSession();
				ssn.setAttribute("username", username);
				response.sendRedirect("welcome.jsp");
				}
			else {			
			response.sendRedirect("SakhaG.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
