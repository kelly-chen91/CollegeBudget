

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = null;
		String s="";
//		String p = request.getParameter("t2");
//		String u = request.getParameter("t3");
//		pw.println("<h1> Hello, " + s + ". </h1><p> You are currently in " + p + ". You are currently attending " + u + ".</p>");
		
		try {
			pw = response.getWriter();
			s = request.getParameter("t1");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
		
		
		pw.println("<h1> Hello," + s + ". </h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
//	protected void redirectrToSeawolf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.sendRedirect("Seawolf.html");  
//	}

}
