package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("pass");
		String hobby[] = req.getParameterValues("hobby");
		out.print("<html> <head> <title> Login </title></head><body>");
		out.print("<p>ID: "+id+"</p>");
		out.print("<p>PW: "+password+"</p>");
		out.print("<p>�̸�: "+req.getParameter("name")+"</p>");
		out.print("<p>���: ");
		for(int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]+"&nbsp;");
		}
		out.print("</p>");
		out.print("<p>����: "+req.getParameter("gender")+"</p>");
		out.print("<p>����: "+req.getParameter("job")+"</p>");
		out.print("<p>�� ��: "+req.getParameter("t")+"</p>");

		out.print("</body></html>");
		
	}	
}
