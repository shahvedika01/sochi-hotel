import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String checkInDate = request.getParameter("check-in");
        String checkOutDate = request.getParameter("check-out");
        
        // Process the booking data (e.g., save to database)
        // Note: You'll need to implement this part
        
        // Redirect back to the homepage or a confirmation page
        response.sendRedirect("index.html");
    }
}

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        
        // Process the contact form data (e.g., send email)
        // Note: You'll need to implement this part
        
        // Redirect back to the homepage or a thank you page
        response.sendRedirect("index.html");
    }
}
