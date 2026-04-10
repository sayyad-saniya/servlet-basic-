package hello;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
//		String rs="<button>click here this was"+ " Get REQUEST Http</button>";
//		resp.getWriter().write(rs);
		  
		
		RequestDispatcher dispacher  =req.getRequestDispatcher("login.html");
		dispacher.forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String rs="<button>click here this was"+"POST REQUEST Http</button>";
		resp.getWriter().write(rs);

	}
}

//    @Override
//    public void service(ServletRequest req, ServletResponse res)
//            throws ServletException, IOException {
//
//    	HttpServletRequest request= (HttpServletRequest)req;
//    	String method =request.getMethod();
//    	
//        System.out.println("login servlet called");
//    	
//    	String resp="";
//     if(method.equals("POST")) {
//    	 
//    	 resp="<button>this was"+" post request Http</button>";
//    	 
//     }else if(method.equals("GET")) {
//    	 
//    	 resp="<button>this was get request</button>";     }
//
//        PrintWriter writer = res.getWriter();
//        writer.write(resp);
//        writer.flush();
//        writer.close();
//    }
//}