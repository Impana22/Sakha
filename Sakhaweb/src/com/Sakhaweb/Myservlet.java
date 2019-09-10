package com.Sakhaweb;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.jasper.tagplugins.jstl.core.Out;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/reg")
public class Myservlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String name=req.getParameter("username");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		String [] langs=req.getParameterValues("lang");
		PrintWriter out=res.getWriter();
		out.println("Hello "+name);
		out.println("Email "+email);
		out.println("Languages");
		for(String lang:langs) {
			out.println(lang);
		
		}
	}
}
