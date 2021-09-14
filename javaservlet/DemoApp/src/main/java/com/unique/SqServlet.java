package com.unique;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;


public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k=0;
		Cookie cookies[]= req.getCookies();
		
		for(Cookie c: cookies) 
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		
		
		
		
	
		/*Httpsession
		 HttpSession session =req.getSession();
		
		
		int k = (int) session.getAttribute("k");
		*/
	//int k=Integer.parseInt(req.getParameter("k"));
		
	k=k*k;
		
	PrintWriter out =res.getWriter();
	
	out.println("Result is "+k);
	
	
		System.out.println("Sq is called");
	
	}
}
