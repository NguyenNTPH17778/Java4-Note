package PresentationLayer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BussinessLayer.Entities.Admin;
import BussinessLayer.ServiceBUS.ServiceDAO_Admin;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	ServiceDAO_Admin svDao_Admin;

    public AdminServlet() {
    	super();
    	svDao_Admin = new ServiceDAO_Admin();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/views/admin/login.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			Admin ad = svDao_Admin.loginAdmin(email, pass);
//			if(ad == null) {
//				response.sendRedirect("/form_Admin.jsp");
//			}
//			else {
//				response.sendRedirect("/form_Admin.jsp");
//			}
//			System.out.println( ad.getDiaChi());
			request.getRequestDispatcher("/views/admin/login.jsp").forward(request, response);
	
		} catch (Exception e) {
		}
	
	}

}
