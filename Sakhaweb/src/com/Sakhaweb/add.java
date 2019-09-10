package com.Sakhaweb;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.servlet4preview.ServletContext;
@WebServlet("/rs")
public class add extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int z=num1+num2;
		//ServletContext context=(ServletContext) getServletContext();
		//HttpSession ssn=req.getSession();
		//ssn.setAttribute("z", z);
		//ssn.setMaxInactiveInterval(160);
		//context.setAttribute("z", z);
		Cookie cookie=new Cookie("z",String.valueOf(z));
		cookie.setMaxAge(60*60*24);
		res.addCookie(cookie);
		res.sendRedirect("O");
		
	}
}
