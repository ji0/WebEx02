

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pwd");
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();

			if (id != null) {
				out.println("<h1>환영합니다, " + id + "님!</h1><br>");

			} else {
				out.println("입력한 id가 없습니다.");
			}

			if (id != null) {
				out.println(id + "님의 password는 " + pw + "입니다.<br>");

			} else {
				out.println("입력한 pw가 없습니다.");
			}

	}

}
