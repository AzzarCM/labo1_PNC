package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String user = "azzar99";
		String pass = "camote99"; 
		// TODO those are my LoL account credentials :V
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("user");
		String password = request.getParameter("pass");
		
		if(user.equals(usuario)){
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"ACCESO CONCEDIDO" + "</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>" + "ACCESO DENEGADO" + "</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}

}
