package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class inputServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result;
		resp.setContentType("text/html;charset=utp-8" );
		int a = Integer.parseInt(req.getParameter("num"));
		if(a%2==0) {
			result="¦��";
		}else result="Ȧ��";
		req.setAttribute("model", result);
		//request ������ model�̶� ������ ����� result �����ϱ�
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		//fowarding �ϱ�
		dispatcher.forward(req, resp);
	}
}
