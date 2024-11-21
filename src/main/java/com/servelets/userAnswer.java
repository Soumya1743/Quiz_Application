package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.FactoryProvider;
import com.user.Answer;
import com.user.User;

/**
 * Servlet implementation class userAnswer
 */

public class userAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object fname;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userAnswer() {
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
		
		String fname = (String) request.getAttribute("fname");
		response.getWriter().println("Received user input: " + response);
		
		String password = request.getParameter("password");

		User u = new User();

		u.setFname(fname);
		u.setPassword(password);
		
		System.out.println(fname);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1 style='text-align:center', 'background-color: red'>" + "Hello" + " " + fname + "</h1>");
		out.print("<center><a href='start.jsp'>Start Quiz</a></center>");
		
		
		int score=0;
		
//		String c="", b="", p="";
//		c=request.getParameter("answer1");
//		b=request.getParameter("answer2");
//		p=request.getParameter("answer3");
//		
//		out.print("<h1 style='text-align:center', 'background-color: red'>" + "Hello" + " " + fname + "</h1>");
//		
//		if(c.equals("js")) {
//			System.out.println("Your First answer is correct!");
//			score++;
//		}
//		else {
//			System.out.println("The correct answer for the first question is JAMES GOSLING SIR!");
//		}
//		
//		if(b.equals("oak")) {
//			System.out.println("Your Second answer is correct!");
//			score++;
//		}
//		else {
//			System.out.println("The correct answer for the first question is OAK!");
//		}
//		
//		if(p.equals("oak")) {
//			System.out.println("Your Third answer is correct!");
//			score++;
//		}
//		else {
//			System.out.println("The correct answer for the first question is OAK!");
//		}
//		
//		
//		
//		if(score==3) {
//			out.print("<h1>Congratulations!!!!</h1>");
//		}
//		else {
//			out.print("<h1>You have Scored "+score+" points!!!!</h1>");
//		}
		
		FactoryProvider fp = new FactoryProvider();
		Session s = FactoryProvider.getFactory().openSession();
		Transaction ts = s.beginTransaction();

		s.save(u);
		ts.commit();
		s.close();
	}

}
