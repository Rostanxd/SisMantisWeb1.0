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
    <title>Maestro Cargos</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_emp_codigo = "";
        String nmr_crg_codigo = "";
        String nmr_crg_descripcion = "";
        String nmr_crg_estado = "";
        String nmr_crg_creacion_usr = "";
        String nmr_crg_creacion_fec = "";
        String nmr_crg_actualiza_usr = "";
        String nmr_crg_actualiza_fec = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("nmr_crg_codigo")!=null) nmr_crg_codigo = request.getParameter("nmr_crg_codigo");
        if(request.getParameter("nmr_crg_descripcion")!=null) nmr_crg_descripcion = request.getParameter("nmr_crg_descripcion");
        if(request.getParameter("nmr_crg_estado")!=null) nmr_crg_estado = request.getParameter("nmr_crg_estado");
        if(request.getParameter("nmr_crg_creacion_usr")!=null) nmr_crg_creacion_usr = request.getParameter("nmr_crg_creacion_usr");
        if(request.getParameter("nmr_crg_creacion_fec")!=null) nmr_crg_creacion_fec = request.getParameter("nmr_crg_creacion_fec");
        if(request.getParameter("nmr_crg_actualiza_usr")!=null) nmr_crg_actualiza_usr = request.getParameter("nmr_crg_actualiza_usr");
        if(request.getParameter("nmr_crg_actualiza_fec")!=null) nmr_crg_actualiza_fec = request.getParameter("nmr_crg_actualiza_fec");
    %>
    <h1>PROGRAMAS</h1>
    <form name="nmr_form_cargos" id="nmr_form_cargos" action="nmr_form_cargos" method="POST">
        <table>
            <tr>
                <td>Codigo Cargo*:</td>
                <td><input type="text" name="nmr_crg_codigo" id="nmr_crg_codigo" value="<%=nmr_crg_codigo%>"/></td>
            </tr>
            <tr>
                <td>Decripcion:</td>
                <td><input type="text" name="nmr_crg_descripcion" id="nmr_crg_descripcion" value="<%=nmr_crg_descripcion%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="nmr_crg_estado" id="nmr_crg_estado" value="<%=nmr_crg_estado%>"/></td>
            </tr>
            <tr>
                <td colspan="3"><h3>Datos de Auditoria</h3></td>
            </tr>
            <tr>
                <td>Creacion:</td>
                <td><input type="text" name="nmr_crg_creacion_usr" id="nmr_crg_creacion_usr" value="<%=nmr_crg_creacion_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_crg_creacion_fec" id="nmr_crg_creacion_fec" value="<%=nmr_crg_creacion_fec%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Actualiza:</td>
                <td><input type="text" name="nmr_crg_actualiza_usr" id="nmr_crg_actualiza_usr" value="<%=nmr_crg_actualiza_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_crg_actualiza_fec" id="nmr_crg_actualiza_fec" value="<%=nmr_crg_actualiza_fec%>" disabled="disabled"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
