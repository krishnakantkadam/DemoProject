package vts.dao;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginOprationDao")
public class LoginOprationDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginOprationDao() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setCharacterEncoding("utf8");
	        response.setContentType("application/json"); 
	        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/mypage.jsp");
	        RequetsDispatcherObj.forward(request, response);
	}

}
