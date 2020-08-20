package unit02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/actionTagServlet")
public class actionTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public actionTagServlet() {
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     processRequest(request,response);
	
	}

	 private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 request.setCharacterEncoding("UTF-8");
		 
		 String userID = request.getParameter("userID");
			String userPwd = request.getParameter("userPwd");
			String loginCheck = request.getParameter("loginCheck");
			
			if (loginCheck.equals("user")) {
			response.setContentType("te"
					+ "xt/html;charset=UTF-8");
			response.getWriter()
			.append("<jsp:forward page='09_userMain.jsp'>")
			.append("<jsp:param value='<%=URLEncoder.encode(\"Àü°í°´\", \"UTF-8\")")
			.append("'\r\n" + 
					"			name=\"userName\" />")
			.append("</jsp:forward>");
		
			
			}
					}
			
			
			
	 
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
