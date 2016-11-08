import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class contactServlet
 */
@WebServlet("/contactServlet")
public class contactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      Connection con = null;
	      PreparedStatement stmt=null;
		try {
			
			if (((request.getParameter("name") == null) || (request.getParameter("email") == null) || (request.getParameter("message") == null))) {
				response.sendRedirect("/Aloe_project/index.jsp");
			}

		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		    } catch (Exception e1) {
		      String errorMessages = "MySQL Driver error: <br>" + e1.getMessage();
		    }

		    try {
		      con = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306",
		          "root", "fl6npr4g27");
		    } catch (Exception e2) {
		      String errorMessages = "Could not establish connection with the Database Server: <br>"
		          + e2.getMessage();
		       con = null;
		    }
		    
		     try {
				stmt = (PreparedStatement) con.prepareStatement("insert into aloedb.contact (name, email, message) values (?, ?, ?)");
				stmt.setString(1, request.getParameter("name"));
				stmt.setString(2, request.getParameter("email"));
				stmt.setString(3, request.getParameter("message"));
				stmt.executeUpdate();
				stmt.close();
				con.close();
				// session
				HttpSession session = request.getSession(true);
				session.setAttribute("emailsend", "true");
				
				response.sendRedirect("/Aloe_project/index.jsp");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
