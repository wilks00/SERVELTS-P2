/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "Ejercicio4", urlPatterns = {"/Ejercicio4"})
public class Ejercicio4 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         
         
         try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>☠☠ SWQC-P2 ☠☠</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SERVELET EJERCICIO Nª 4 ☠ </h1>");
            out.println("<h1>Dados </h1>");
            out.println("<form action='' method='post'>");
            out.println("</form>");
            out.println("<img src='img/foto1.jpg' id=''>");
            out.println("</body>");
            out.println("</html>");
         }finally{
             out.close();
         }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
        // int d2 = Integer.parseInt(request.getParameter(name));
         double d1;
         double d2;
         int r;
                  try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio4 </h1>");
            out.println("<h3>Primer Dado</h3>");
            d1= Math.random()*6+1;
            int dd1 = (int)d1;
            out.println(""+dd1);
            out.println("<br><br>");
            out.println("<h3>Segundo Dado</h3>");
            d2= Math.random()*6+1;
            int dd2 = (int)d2;
            out.println(""+dd2);
            r=dd1+dd2;
            if(r==7){
                out.println("<h2>Ganaste!!!</h2>");
                out.println("Resultado="+r);
            }else{
                if(r==11){
                    out.println("<h2>Ganaste!!!</h2>");
                    out.println("Resultado="+r);
                }else{
                    out.println("<h2>Vuelve a Intentarlo! para sacar 11 o 7</h2>");
                }
            }
            
            out.println("</body>");
            out.println("</html>");
         }finally{
             out.close();
         }
    }

}
