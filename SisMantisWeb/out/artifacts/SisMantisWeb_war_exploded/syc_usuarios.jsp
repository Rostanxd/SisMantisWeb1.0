<%--
  Created by IntelliJ IDEA.
  User: Rostan
  Date: 11/02/2016
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="trxStyles.css"/>
    <title>Maestro Usuarios</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_usu_codigo = "";
        String syc_usu_clave = "";
        String syc_usu_apellidos = "";
        String syc_usu_nombres = "";
        String syc_usu_estado = "";
        String syc_usu_tipo = "";
        String syc_usu_email = "";
        String syc_usu_creacion_usr = "";
        String syc_usu_creacion_fec = "";
        String syc_usu_actualiza_usr = "";
        String syc_usu_actualiza_fec = "";

        if(request.getParameter("syc_usu_codigo")!=null) syc_usu_codigo = request.getParameter("syc_usu_codigo");
        if(request.getParameter("syc_usu_clave")!=null) syc_usu_clave = request.getParameter("syc_usu_clave");
        if(request.getParameter("syc_usu_apellidos")!=null) syc_usu_apellidos = request.getParameter("syc_usu_apellidos");
        if(request.getParameter("syc_usu_nombres")!=null) syc_usu_nombres = request.getParameter("syc_usu_nombres");
        if(request.getParameter("syc_usu_estado")!=null) syc_usu_estado = request.getParameter("syc_usu_estado");
        if(request.getParameter("syc_usu_tipo")!=null) syc_usu_tipo = request.getParameter("syc_usu_tipo");
        if(request.getParameter("syc_usu_email")!=null) syc_usu_email = request.getParameter("syc_usu_email");
        if(request.getParameter("syc_usu_creacion_usr")!=null) syc_usu_creacion_usr = request.getParameter("syc_usu_creacion_usr");
        if(request.getParameter("syc_usu_creacion_fec")!=null) syc_usu_creacion_fec = request.getParameter("syc_usu_creacion_fec");
        if(request.getParameter("syc_usu_actualiza_usr")!=null) syc_usu_actualiza_usr = request.getParameter("syc_usu_actualiza_usr");
        if(request.getParameter("syc_usu_actualiza_fec")!=null) syc_usu_actualiza_fec = request.getParameter("syc_usu_actualiza_fec");
    %>
    <h1>USUARIOS</h1>
    <form name="syc_form_usuario" id="syc_form_usuario" action="syc_form_usuario" method="POST">
        <table>
            <tr>
                <td>Codigo Usuario*:</td>
                <td><input type="text" name="syc_usu_codigo" id="syc_usu_codigo" value="<%=syc_usu_codigo%>"/></td>
            </tr>
            <tr>
                <td>Clave*:</td>
                <td><input type="text" name="syc_usu_calve" id="syc_usu_clave" value="<%=syc_usu_clave%>"/></td>
            </tr>
            <tr>
                <td>Confirmacion clave:</td>
                <td><input type="text" name="confirmacion" id="confirmacion" value="<%=syc_usu_clave%>"/></td>
            </tr>
            <tr>
                <td>Apellidos:</td>
                <td><input type="text" name="syc_usu_apellidos" id="syc_usu_apellidos" value="<%=syc_usu_apellidos%>"/></td>
            </tr>
            <tr>
                <td>Nombres:</td>
                <td><input type="text" name="syc_usu_nombres" id="syc_usu_nombres" value="<%=syc_usu_nombres%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="syc_usu_estado" id="syc_usu_estado" value="<%=syc_usu_estado%>"/></td>
            </tr>
            <tr>
                <td>Tipo:</td>
                <td><input type="text" name="syc_usu_tipo" id="syc_usu_tipo" value="<%=syc_usu_tipo%>"/></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><input type="text" name="syc_usu_email" id="syc_usu_email" value="<%=syc_usu_email%>"/></td>
            </tr>
            <tr>
                <td colspan="3"><h3>Datos de Auditoria</h3></td>
            </tr>
            <tr>
                <td>Creacion:</td>
                <td><input type="text" name="syc_usu_creacion_usr" id="syc_usu_creacion_usr" value="<%=syc_usu_creacion_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="syc_usu_creacion_fec" id="syc_usu_creacion_fec" value="<%=syc_usu_creacion_fec%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Actualiza:</td>
                <td><input type="text" name="syc_usu_actualiza_usr" id="syc_usu_actualiza_usr" value="<%=syc_usu_actualiza_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="syc_usu_actualiza_usr" id="syc_usu_actualiza_fec" value="<%=syc_usu_actualiza_fec%>" disabled="disabled"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
