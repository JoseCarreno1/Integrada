/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets_WS;

import Paq_WS.WSRETORNARRESULTADO_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author PC-Jose
 */
@WebServlet(name = "Test", urlPatterns = {"/Test"})
public class Servlet_Consume_Operacion_WS extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS_RETORNAR_RESULTADO/WS_RETORNAR_RESULTADO.wsdl")
    private WSRETORNARRESULTADO_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Consume_WS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_Consume_WS at " + request.getContextPath() + "</h1>");
            
           
            out.println("<form method=get>");
            out.println("Valor Producto 1: <input type=text name=txtvalor_1 /></br>");
            out.println("Valor Producto 2: <input type=text name=txtvalor_2 /></br>");
            out.println("Procentaje Iva:<input type=text name=txtiva /></br>");
            out.println("<input type=submit />");
            out.println("</form>");
            double valor1 = Double.parseDouble(request.getParameter("txtvalor_1"));
            double valor2 = Double.parseDouble(request.getParameter("txtvalor_2"));
            int iva = Integer.parseInt(request.getParameter("txtiva"));
            double valor_sumado=valor1+valor2;
            //String valor = request.getParameter("txtvalor");
            out.println("<h3>"+calcularIva(valor_sumado, iva)+"</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String calcularIva(double valorProducto, int ivaProducto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Paq_WS.WSRETORNARRESULTADO port = service.getWSRETORNARRESULTADOPort();
        return port.calcularIva(valorProducto, ivaProducto);
    }

}
