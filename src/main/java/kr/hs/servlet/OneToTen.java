package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OneToTen")
public class OneToTen extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html> <head> <title> 1부터 10까지 더하기 </title></head><body>");
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
		}
		out.println("<p>"+sum+"</p></body></html>");
	}
	
}
