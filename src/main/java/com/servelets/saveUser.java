package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.FactoryProvider;
import com.user.User;

/**
 * Servlet implementation class saveUser
 */


public class saveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public saveUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String password = request.getParameter("password");

		User u = new User();

		u.setFname(fname);
		u.setPassword(password);
		
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1 style='text-align:center', 'background-color: red'>" + "Hello" + " " + fname + "</h1>");
		out.print("<center><a href='start.jsp'>Start Quiz</a></center>");
	
		
		
		

//		String alphabets = "^[a-zA-Z]*$";
//		String pswrd2 = "^[[a-zA-Z][0-9]]*$";
//		if(fname.matches(alphabets)) {
//			
//			if(password.matches(pswrd2)) {
//				out.print("<h1 style='text-align:center', 'background-color: red'>" + "Hello" + " " + fname + "</h1>");
//				out.print("<center><h2>You are Successfully Registered</h2><center>");
//				out.print("<center><a href='index.jsp'>Go back</a></center>");
//			}
//			else {
//				out.print("<h2>Wrong Password<h2>");
//			}
//		}
		
		
		
		
		FactoryProvider fp = new FactoryProvider();
		Session s = FactoryProvider.getFactory().openSession();
		Transaction ts = s.beginTransaction();

		s.save(u);
		ts.commit();
		s.close();
		
		request.setAttribute("fname", fname);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/saveUser");
		dispatcher.forward(request, response);

	}

}
