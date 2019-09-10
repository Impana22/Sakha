package com.Sakhaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/O")
public class Evenodd extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		//int y=(int)req.getAttribute("z");
		//out.println(y);
		int y=0;
		Cookie[] ck=req.getCookies();
		for(Cookie c:ck) 
		{
			if(c.getName().equals("add.z")) 
			{
				y=Integer.parseInt(c.getValue());
			}
		}
		if(y%2==0) 
		{
			out.println("Even Number");
		}
		else 
		{
			out.println("Odd Number");
		}
	}
	

}
