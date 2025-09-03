package hello.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        resp.getWriter().println("hello servlet!");
    }
}
