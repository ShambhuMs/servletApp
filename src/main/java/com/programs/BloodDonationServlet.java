package com.programs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/bloodDonation", loadOnStartup = 1)
public class BloodDonationServlet extends HttpServlet {
    public BloodDonationServlet() {
        System.out.println("Running no-arg const in BloodDonationServlet...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String bloodGroup = req.getParameter("bloodGroup");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>bloodDonation</title>\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "  <style>\n" +
                "    .output p{\n" +
                "      position: relative;\n" +
                "      top: 100px;\n" +
                "      left: 200px;\n" +
                "      heght: 400px;\n" +
                "      width: 250px;\n" +
                "    }\n" +
                " .navbar-brand{\n" +
                "     position: relative;\n" +
                "      left: 100px;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <nav class=\"navbar navbar-dark bg-dark fixed-top\">\n" +
                "    <a class=\"navbar-brand\" href=\"TvRecharge.html\">Blood Donation Form</a>\n" +
                "</nav>\n" +
                "  <div class=\"output\">\n" +
                " <h2> \n" +
                " Your details.. \n" +
                "</h2>\n");
        printWriter.write("<p> <b>firstName: " + firstName + "\n" + " lastName: " + lastName + "\n bloodGroup: " + bloodGroup + " age: " + age + "\n gender: " + gender + "</b><p>\n");
        printWriter.write("<b> Your Application under Processing </b>");
        printWriter.write("  </div>\n" +
                "</body>\n" +
                "</html>");
    }
}
