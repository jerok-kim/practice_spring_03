import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.resp")
public class MyServletResponse extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // http://localhost:8080/hello.resp
        resp.addHeader("jerok-kim", "programmer");
        resp.addHeader("Set-Cookie", "password=4321");
        // resp.addHeader("Content-Type", "application/x-www-form-urlencoded");
        // resp.addHeader("Content-Type", "text/plain");
        resp.addHeader("Content-Type", "text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>username=jerok&email=jerok.kim@gmail.com</h1>");
    }

}
