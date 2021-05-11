package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestMethod")
public class RequestMethod extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html> <head> <title> 요청 방식과 프로토콜 </title></head><body>");
		out.print("<p>request URI: "+req.getRequestURI()+"</p>");
		out.print("<p>Server Name: "+req.getServerName()+"</p>");
		out.print("<p>Server Port: "+req.getServerPort()+"</p>");
		out.print("<p>Client Addr: "+req.getRemoteAddr()+"</p>");
		out.print("<p>Client Host: "+req.getRemoteHost()+"</p>");
		out.print("<p>Client Port: "+req.getRemotePort()+"</p>");
		out.println("</body></html>");

	}
	
}
