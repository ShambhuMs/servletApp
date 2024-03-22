package com.programs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

//@WebServlet(urlPatterns = "/tvRecharge",loadOnStartup = 1)
public class TvRechargeServlet extends HttpServlet {
    public TvRechargeServlet() {
        System.out.println("Running no-arg const in TvRechargeServlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId=req.getParameter("customerId");
        String vendorName=req.getParameter("vendorName");
        String rechargeAmount=req.getParameter("rechargeAmount");
        String type=req.getParameter("type");

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        long convertId=Long.parseLong(customerId);
        int convertRechargeAmount=Integer.parseInt(rechargeAmount);
        writer.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Response</title>\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "  <style>\n" +
                "    .output p{\n" +
                "      position: relative;\n" +
                "      top: 100px;\n" +
                "      left: 200px;\n" +
                "      heght: 400px;\n" +
                "      width: 200px;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <nav class=\"navbar navbar-dark bg-dark fixed-top\">\n" +
                "    <a class=\"navbar-brand\" href=\"TvRecharge.html\">TvRecharge Form</a>\n" +
                "</nav>\n" +
                "  <div class=\"output\">\n");
                writer.println("<p> <b>Customer ID: " +convertId +"\n"+" vendorName: "+vendorName+"\n rechargeAmount: "+convertRechargeAmount+" type: " +type+"</b><p>\n" );
        writer.write("<b> Your Application under Processing </b>");
        writer.write("  </div>\n" +
                "</body>\n" +
                "</html>");


    }
}
