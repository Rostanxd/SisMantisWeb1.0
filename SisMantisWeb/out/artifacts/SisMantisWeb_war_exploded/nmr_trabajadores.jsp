<%--
  Created by IntelliJ IDEA.
  User: Rostan
  Date: 11/02/2016
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="trxStyles.css"/>
    <title>Maestro Trabajadores</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_emp_codigo = "";
        String nmr_trj_codigo = "";
        String nmr_trj_ruc = "";
        String nmr_trj_nombre = "";
        String nmr_trj_apellido = "";
        String nmr_trj_edad = "";
        String nmr_trj_estado = "";
        String nmr_trj_direccion = "";
        String nmr_trj_telefono = "";
        String nmr_trj_creacion_usr = "";
        String nmr_trj_creacion_fec = "";
        String nmr_trj_actualiza_usr = "";
        String nmr_trj_actualiza_fec = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("nmr_trj_codigo")!=null) nmr_trj_codigo = request.getParameter("nmr_trj_codigo");
        if(request.getParameter("nmr_trj_ruc")!=null) nmr_trj_ruc = request.getParameter("nmr_trj_ruc");
        if(request.getParameter("nmr_trj_nombre")!=null) nmr_trj_nombre = request.getParameter("nmr_trj_nombre");
        if(request.getParameter("nmr_trj_apellido")!=null) nmr_trj_apellido = request.getParameter("nmr_trj_apellido");
        if(request.getParameter("nmr_trj_edad")!=null) nmr_trj_edad = request.getParameter("nmr_trj_edad");
        if(request.getParameter("nmr_trj_estado")!=null) nmr_trj_estado = request.getParameter("nmr_trj_estado");
        if(request.getParameter("nmr_trj_direccion")!=null) nmr_trj_direccion = request.getParameter("nmr_trj_direccion");
        if(request.getParameter("nmr_trj_telefono")!=null) nmr_trj_telefono = request.getParameter("nmr_trj_telefono");
        if(request.getParameter("nmr_trj_creacion_usr")!=null) nmr_trj_creacion_usr = request.getParameter("nmr_trj_creacion_usr");
        if(request.getParameter("nmr_trj_creacion_fec")!=null) nmr_trj_creacion_fec = request.getParameter("nmr_trj_creacion_fec");
        if(request.getParameter("nmr_trj_actualiza_usr")!=null) nmr_trj_actualiza_usr = request.getParameter("nmr_trj_actualiza_usr");
        if(request.getParameter("nmr_trj_actualiza_fec")!=null) nmr_trj_actualiza_fec = request.getParameter("nmr_trj_actualiza_fec");
    %>
    <h1>TRABAJADORES</h1>
    <form name="nmr_form_trabajadores" id="nmr_form_trabajadores" action="nmr_form_trabajadores" method="POST">
        <table>
            <tr>
                <td>Codigo Trabajador*:</td>
                <td><input type="text" name="nmr_trj_codigo" id="nmr_trj_codigo" value="<%=nmr_trj_codigo%>"/></td>
            </tr>
            <tr>
                <td>RUC:</td>
                <td><input type="text" name="nmr_trj_ruc" id="nmr_trj_ruc" value="<%=nmr_trj_ruc%>"/></td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nmr_trj_nombre" id="nmr_trj_nombre" value="<%=nmr_trj_nombre%>"/></td>
            </tr>
            <tr>
                <td>Apellido:</td>
                <td><input type="text" name="nmr_trj_apellido" id="nmr_trj_apellido" value="<%=nmr_trj_apellido%>"/></td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td><input type="text" name="nmr_trj_edad" id="nmr_trj_edad" value="<%=nmr_trj_edad%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="nmr_trj_estado" id="nmr_trj_estado" value="<%=nmr_trj_estado%>"/></td>
            </tr>
            <tr>
                <td>Direccion:</td>
                <td><input type="text" name="nmr_trj_direccion" id="nmr_trj_direccion" value="<%=nmr_trj_direccion%>"/></td>
            </tr>
            <tr>
                <td>Telefono:</td>
                <td><input type="text" name="nmr_trj_telefono" id="nmr_trj_telefono" value="<%=nmr_trj_telefono%>"/></td>
            </tr>
            <tr>
                <td colspan="3"><h3>Datos de Auditoria</h3></td>
            </tr>
            <tr>
                <td>Creacion:</td>
                <td><input type="text" name="nmr_trj_creacion_usr" id="nmr_trj_creacion_usr" value="<%=nmr_trj_creacion_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_trj_creacion_fec" id="nmr_trj_creacion_fec" value="<%=nmr_trj_creacion_fec%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Actualiza:</td>
                <td><input type="text" name="nmr_trj_actualiza_usr" id="nmr_trj_actualiza_usr" value="<%=nmr_trj_actualiza_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_trj_actualiza_fec" id="nmr_trj_actualiza_fec" value="<%=nmr_trj_actualiza_fec%>" disabled="disabled"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
