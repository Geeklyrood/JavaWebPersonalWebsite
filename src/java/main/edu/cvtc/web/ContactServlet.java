package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<link rel='stylesheet' type='text/css' href='Assets/styles.css'>"
				+ "\n\t\t<title>Contact Me</title>\t\n</head>\n\t<body>\n\t\t<header>\n\t\t\t<h1>Keenan Rood</h1>\n\t\t\t<ul>\n\t\t\t\t"
				+ "<li><a href='/PersonalWebsite/HomeServlet'>Home</a></li>\n\t\t\t\t<li><a href='/PersonalWebsite/AboutServlet'>About"
				+ "</a></li>\n\t\t\t\t<li class='active'><a href='/PersonalWebsite/ContactServlet'>Contact</a></li>\n\t\t\t</ul>\n\t\t"
				+ "</header>\n\t\t<div id='home'>\n\t\t\t<h2>Contact Me</h2>\n\t\t\t<form>\n\t\t\t\t<fieldset>\n\t\t\t\t\t<legend>"
				+ "Your Information:</legend>\n\t\t\t\t\t<label>Name:\n\t\t\t\t\t\t<input type='text' name='name' size='30' maxlength='100'>"
				+ "\n\t\t\t\t\t</label>\n\t\t\t\t\t<br/>\n\t\t\t\t<label>Email:\n\t\t\t\t\t<input type='email' name='email' size='30'"
				+ " maxlenght='100'\nt\t\t\t\t\t</label>\n\t\t\t\t<br/>\n\t\t\t</fieldset>\n\t\t\t\t\t<legend>Your Message:</legend>"
				+ "\n\t\t\t\t\t<label>Message:\n\t\t\t\t\t<br/>\n\t\t\t\t\t<textarea rows='4' cols='40'></textarea>\n\t\t\t\t</label>\n\t"
				+ "\t\t</fieldset>\n\t\t\t<br/>\n\t\t\t<input type='submit' value='Submit Message'/>\n\t\t\t<br/>\n\t\t\t<hr/>\n\t\t\t<footer>"
				+ "\n\t\t\t\t<small>&copy; Keenan Rood 2016</small>\n\t\t\t</footer>\n\t\t</div>\n\t</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
