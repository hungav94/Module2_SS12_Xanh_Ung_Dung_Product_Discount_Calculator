import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float productDescription = Float.parseFloat(request.getParameter("productDescription"));
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float discountAmount = discountPercent / 100;
        float discountPrice = listPrice - listPrice * discountAmount;

        PrintWriter writer = response.getWriter();

        writer.print("<html>");
        writer.print("<h1>Product Discount Calculator</h1>");
        writer.print("<table><tbody><tr><td>Product Description:</td><td>" + productDescription + "</td></tr>");
        writer.print("<tr><td>Price:</td><td>$" + listPrice + "</td></tr>");
        writer.print("<tr><td>Discount Percent:</td><td>" + discountPercent + "%</td></tr>");
        writer.print("<tr><td>Discount Amount:</td><td>$" + discountAmount + "</td></tr>");
        writer.print("<tr><td>Discount Price:</td><td>$" + discountPrice + "</td></tr>");

        writer.print("</tbody></table></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
