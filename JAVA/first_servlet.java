/* import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/first_servlet")
public class first_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    public first_servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter aaa = response.getWriter();
		aaa.write("Hello Lock down!, now bye lock down");
		aaa.write("<h5>Hello how do you do?</h5>");
		aaa.write("<div style='font-family:verdana;color:red;background-color:yellow'>Dinesh Jee</div>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}
 */