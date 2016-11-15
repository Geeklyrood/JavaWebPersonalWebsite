package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<link rel='stylesheet' type='text/css' href='Assets/styles.css'>"
				+ "\n\t\t<title>Contact Me</title>\n\t</head>\n\t<body>\n\t\t<header>\n\t\t<h1>Keenan Rood</h1>\n\t\t<ul>\n\t\t\t<li>"
				+ "<a href='/PersonalWebsite/HomeServlet'>Home</a></li>\n\t\t\t<li class='active'><a href='/PersonalWebsite/AboutServlet'>"
				+ "About</a></li>\n\t\t\t<li><a href='/PersonalWebsite/ContactServlet'>Contact</a></li>\n\t\t</ul>\n\t\t</header>\n\t\t"
				+ "<div id='about'>\n\t\t\t<h2>A Little Bit About Me</h2>\n\t\t\t<p id='first'>I am a Web, Software and Game Developer. "
				+ "I grew up in a small town in the center of Wisconsin and soon moved west to Eau Claire for school and work. I studied "
				+ "in Eau Claire for 2 years to get my Associates Degree's in Mobile Development and Software Development. I have loved "
				+ "computers since I was little but strangely enough I did not start as a Computer Major in college. I was originally "
				+ "a Musical Theater Major, and I loved every minute of it but decided to pursue something a little more financially wise. "
				+ "I spend most of my time developing Websites and games however always find the time to sit down and play some Dungeons and "
				+ "Dragons, any Board Games or even sometimes Video Games.</p>\n\t\t\t<p id='second'>If you want to know more about me feel "
				+ "free to follow me on Twitter @Geeklyrood or email me at Kmrood1@gmail.com. I look forward to talking with you about anything "
				+ "geeky!</p>\n\t\t\t<img src='Assets/background.jpg' alt='My computer setup'>\n\t\t</div>\n\t\t<hr/>\n\t\t<footer>\n\t\t\t<small>"
				+ "&copy; Keenan Rood 2016</small>\n\t\t</footer>\n\t</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
