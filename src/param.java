
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class param
 */
@WebServlet("/param")
public class param extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String hobby[] = request.getParameterValues("hobby");
		String age = request.getParameter("age");
		String drink[] = request.getParameterValues("drink");
		String content = request.getParameter("content");

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

		if (id != null) {
			out.println(id + "님의 성별은 " + gender + "입니다.<br>");

		} else {
			out.println("입력한 성별이 없습니다.");
		}

	

		if (id != null) {
			out.print(id + "님의 취미는 ");
			for(int i =0; i<hobby.length; i++){
				
				out.print(hobby[i]);
	
				if(i != hobby.length-1){
					out.print(", ");
				}
			}
			out.println("입니다.<br>");
		} else {
			out.println("입력한 취미가 없습니다.");
		}

		if (id != null) {
			out.println(id + "님의 나이는 " + age + "입니다.<br>");

		} else {
			out.println("입력한 나이가 없습니다.");
		}
		if (id != null) {
			out.print(id + "님이 좋아하는 음료는");
			for(int i =0; i<drink.length; i++){
				
				out.print(drink[i]);
	
			
				if(i != drink.length-1){
					out.print(", ");	
					System.out.println(i);
					System.out.println(drink.length);
				}
			}
			out.println("입니다.<br>");

		} else {
			out.println("입력한 음료가 없습니다.");
		}

		if (id != null) {
			out.println(id + "님의 한마디 <br>" + content);
		} else {
			out.println("입력한 한마디가 없습니다.");
		}

	}

}
