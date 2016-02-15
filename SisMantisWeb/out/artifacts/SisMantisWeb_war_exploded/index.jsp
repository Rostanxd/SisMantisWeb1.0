<%@ page import="dataBase.conexion" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.microsoft.sqlserver.jdbc.SQLServerDriver" %>
<%@ page import="dataBase.syc" %><%--
  Created by IntelliJ IDEA.
  User: Bairon
  Date: 02/02/2016
  Time: 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel=StyleSheet href="index.css" TYPE="text/css">
    <jsp:include page="encabezado.jsp"></jsp:include>
    <title>Acceso de Usuario</title>
    <script>
      $(document).ready(function(){
        $("#ValidarUsuario").submit(function(){
          $.post("sycValidaUsuario",$("#ValidarUsuario").serialize(), function(data){
            log = jQuery.trim(data);
            if(log == 1) document.location.href = "syc_main.jsp";
            else if(log == 2) $("#mensaje-ingreso").html("<h1>Error con la Base de Datos.</h1>");
            else $("#mensaje-ingreso").html("<h1>Acceso negado, Usuario o Clave incorrecta.</h1>");
          });
          return false;
        });
      });

      $(document).ready(function(){
        $("#syc_emp_codigo").click(function(){
          if($("#usuario").val() == ""){
            $("#mensaje-ingreso").html("<h1>Ingrese el Usuario.</h1>");
          }
          return false;
        });
      });

    </script>
  </head>
  <body>

  <%--Codigo Java para las variables de inicio--%>
  <%
    String syc_usu_codigo;
    String syc_emp_codigo;
    String syc_usu_clave;

    if(request.getParameter("usuario") != null) syc_usu_codigo = request.getParameter("usuario");
    if(request.getParameter("password") != null) syc_usu_clave = request.getParameter("password");
    if(request.getParameter("syc_emp_codigo") != null) syc_emp_codigo = request.getParameter("syc_emp_codigo");

  %>
  <script>
    $(document).ready(function(){
      $("#syc_emp_codigo").click(function(){
        <%
          syc_usu_codigo = request.getParameter("usuario");
        %>
        $("#mensaje-ingreso").html("<h1><%=request.getParameter("usuario")+"hola"%></h1>")
        return false;
      });
    });
  </script>

    <div id="header">
      <table>
        <tr>
          <td><img id="gsnLogo" src="logo.jpg"/></td>
          <td><h1 id="titEmp">  Sistema de Nomina y Roles de Pago</h1></td>
        </tr>
      </table>
    </div>
    <div id="center">
      <form name="ValidarUsuario" id="ValidarUsuario" action="ValidarUsuario" method="POST">
        <center><table border="0" id="tLogin">
          <tbody>
            <tr>
              <td>Usuario:</td>
              <td><input type="text" name="usuario" id="usuario" value="" size="10"/></td>
              <td rowspan="4" style="padding-left: 40px"><img id="lgnLogo" src="login.jpg"/></td>
            </tr>
            <tr>
              <td>Empresa:</td>
              <%--Codigo para verificar la version del JDBC en el GLASSFISH--%>
                <%--<%--%>
                  <%--SQLServerDriver drv = new SQLServerDriver();--%>
                  <%--String sql = "M:"+drv.getMajorVersion() + ". m: " + drv.getMinorVersion()+drv.toString()+drv.jdbcCompliant();--%>
                <%--%>--%>
              <%--<td><%=sql%></td>--%>
              <td><select name="syc_emp_codigo" id="syc_emp_codigo">
              <option value="0" selected>Seleccione la empresa... </option>
              <%
                conexion con = new conexion(); ;
                try{
                  con.conectar();
                  ResultSet rs = con.empresasUsr("");
                  while (rs.next()){
              %>
                <option value="<%=rs.getString("syc_emp_codigo")%>"><%=rs.getString("syc_emp_descripcion")%></option>
              <%
                  }
                }catch(Exception e){
                    %>
                  <%=e.toString()%>
                <%
                }finally{
                    con.desconectar();
                  }
              %>
              </select></td>
            </tr>
            <tr>
              <td>Clave:</td>
              <td><input type="password" name="password" id="password" value="" size="10"/></td>
            </tr>
            <tr>
              <td colspan="2"><input  type="submit" value="Ingresar" name="Ingresar" id="Ingresar"/></td>
            </tr>
          </tbody>
        </table></center>
      </form>
      <br>
      <div id="mensaje-ingreso"></div>
    </div>
    <div id="divFooter">
      <h1 id="footer">Grupo Sin Nombre & Asociados.</h1>
    </div>
  </body>
</html>
