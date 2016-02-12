<%--
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
            if(log == 1) document.location.href = "nmr_trabajadores.jsp";
            else $("#mensaje-ingreso").html("<h1>Acceso negado, Usuario o Clave incorrecta.</h1>")
          });
          return false;
        });
      });
    </script>
  </head>
  <body>
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
        <table border="0" id="tLogin">
          <tbody>
          <tr>
            <td>Usuario:</td>
            <td><input type="text" name="usuario" id="usuario" value="" size="10"/></td>
            <td rowspan="3" style="padding-left: 40px"><img id="lgnLogo" src="login.jpg"/></td>
          </tr>
          <tr>
            <td>Clave:</td>
            <td><input type="password" name="password" id="password" value="" size="10"/></td>
          </tr>
          <tr>
            <td colspan="2"><input  type="submit" value="Ingresar" name="Ingresar" id="Ingresar"/></td>
          </tr>
          </tbody>
        </table>
      </form>
      <br>
      <div id="mensaje-ingreso"></div>
    </div>
    <div id="Empresa">
      <img id="empLogo" src="empresaLogo.jpg"/>
    </div>
    <div id="divFooter">
      <h1 id="footer">Grupo Sin Nombre & Asociados.</h1>
    </div>
  </body>
</html>
