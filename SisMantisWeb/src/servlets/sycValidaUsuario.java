package servlets;

import dataBase.conexion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by Bairon on 02/02/2016.
 */
@WebServlet(value = "/sycValidaUsuario")
public class sycValidaUsuario extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Conexion a la Bd
        try {
            conexion con = new conexion();
            con.conectar();

            String codUsuario = request.getParameter("usuario");
            String pass = request.getParameter("password");
            boolean log = con.verificaUsuario(codUsuario, pass);

            out.println(log == true ? "1":"0");

            con.desconectar();

        }catch(Exception e){
            System.out.println(e.toString());
            out.println("2");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
