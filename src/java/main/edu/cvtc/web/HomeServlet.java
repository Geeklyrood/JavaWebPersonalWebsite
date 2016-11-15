package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
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
				+ "<li class='active'><a href='/PersonalWebsite/HomeServlet'>Home</a></li>\n\t\t\t\t<li><a href='/PersonalWebsite/AboutServlet'>"
				+ "About</a></li>\n\t\t\t\t<li><a href='/PersonalWebsite/ContactServlet'>Contact</a></li>\n\t\t\t</ul>\n\t\t</header>\n\t\t<div "
				+ "id='home'>\n\t\t\t<h2>Web Developer, 3D Animator, Mobile Application Developer</h2>\n\t\t\t<p>This website is designed for you "
				+ "to get to know me! I will include previous projects that you can take a look at, a blog about me and how you can contact me! "
				+ "Have an idea for a website but don't know where to start? I am your guy! I will help you create the site of your dreams, or "
				+ "even the mobile application of your dreams. Send me an email and lets get started!</p>\n\t\t\t<p>The languages I know include "
				+ "but are not limited to: Swift, Objective C, Java, HTML, CSS, JavaScript, Progress, MySQL and VB.NET</p>\n\t\t\t<img id='swift' "
				+ "src='Assets/swift.png'>\n\t\t</div>\n\t\t<hr/>\n\t\t<footer>\n\t\t\t<small>&copy; Keenan Rood 2016</small>\n\t\t</footer>\n\t"
				+ "</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
