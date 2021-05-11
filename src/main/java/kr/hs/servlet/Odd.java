package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/odd")
public class Odd extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html> <head> <title> È¦Â¦ ÆÇº°±â </title></head><body>");
		int a = 3;
		if(a%2==0) {
			out.print("<p>Â¦¼ö</p></body></html>");
		}else {
			out.print("<p>È¦¼ö</p></body></html>");
		}
	}
	
	
}
