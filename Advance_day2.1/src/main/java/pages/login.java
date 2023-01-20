package pages;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import DAL.IUserManager;
import DAL.UserManager;
import pojo.User;

@WebServlet("/loginservlet")
public class login extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init method is execute");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println(email+"    "+password);
		
		try(PrintWriter pw = resp.getWriter()) { 
			resp.setContentType("text/html");
			IUserManager um = new UserManager();
			User user = um.authenticateUser(email, password);
			System.out.println("Authenticated User "+ user);
			if(user==null) {
				System.out.println("Invalid Login");
				pw.write("<h1>Invalid Login</h1>");
			}
			else {
				System.out.println("Valid Login");
				pw.write("<h1>Welcome "+user.getCustName()+"</h1>");
				pw.write("<h2>User Details : "+user+"</h2>");
				pw.write("<h2>Valid Login</h2>");
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		System.out.println("destroy method is execute");
		super.destroy();
	}

}
