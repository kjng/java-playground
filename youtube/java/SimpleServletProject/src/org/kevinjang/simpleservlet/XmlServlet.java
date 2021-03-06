package org.kevinjang.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		
		if (user != null) {
			out.println("GET: " + user + "!");			
		} else {
			out.println("GET: Hello there :)");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String fullName = request.getParameter("fullName");
		String profession = request.getParameter("profession");
		String locations[] = request.getParameterValues("location");
		
		if (user != null) {
			out.println("POST: " + fullName + "! " + user + ". Profession: " + profession + ". Locations: ");	
			for (String location : locations) {
				out.println(location);
			}
		} else {
			out.println("POST: Hello there :)");
		}
	}
	
}
