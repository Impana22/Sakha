package com.Sakhaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.ServletContext;

/**
 * Servlet implementation class Odd
 */
@WebServlet("/Odd")
public class Odd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession ssn=request.getSession();
		ServletContext context=(ServletContext) getServletContext();
		int sum=(int)(context.getAttribute("z"));
		PrintWriter out=response.getWriter();
		if(sum%2==0) {
			out.println("Even");
		}
		else {
			out.println("Odd");
		}
		//out.print("<br><br><br><a href='clear'> clear all </a>");
		
	}

}
