package org.kevinjang.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" }, initParams={@WebInitParam(name="defaultUser", value="Kevin")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		String user = request.getParameter("user");
		HttpSession session = request.getSession();			
		ServletContext context = request.getServletContext();
		
		if (user != "" && user != null) {
			session.setAttribute("user", user);
			context.setAttribute("user", user);
		}
		
		writer.println("Request parameter is " + user);
		writer.println("Session parameter is " + (String) session.getAttribute("user"));
		writer.println("Context parameter is " + (String) context.getAttribute("user"));
		writer.println("Server init paramter is " + this.getServletConfig().getInitParameter("defaultName"));
	}

}
