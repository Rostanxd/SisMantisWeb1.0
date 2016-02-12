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
    <title>Maestro Formas Pago</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_emp_codigo = "";
        String nmr_fpg_codigo = "";
        String nmr_fpg_descripcion = "";
        String nmr_fpg_estado = "";
        String nmr_fpg_dias = "";
        String nmr_fpg_creacion_usr = "";
        String nmr_fpg_creacion_fec = "";
        String nmr_fpg_actualiza_usr = "";
        String nmr_fpg_actualiza_fec = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("nmr_fpg_codigo")!=null) nmr_fpg_codigo = request.getParameter("nmr_fpg_codigo");
        if(request.getParameter("nmr_fpg_descripcion")!=null) nmr_fpg_descripcion = request.getParameter("nmr_fpg_descripcion");
        if(request.getParameter("nmr_fpg_estado")!=null) nmr_fpg_estado = request.getParameter("nmr_fpg_estado");
        if(request.getParameter("nmr_fpg_dias")!=null) nmr_fpg_dias = request.getParameter("nmr_fpg_dias");
        if(request.getParameter("nmr_fpg_creacion_usr")!=null) nmr_fpg_creacion_usr = request.getParameter("nmr_fpg_creacion_usr");
        if(request.getParameter("nmr_fpg_creacion_fec")!=null) nmr_fpg_creacion_fec = request.getParameter("nmr_fpg_creacion_fec");
        if(request.getParameter("nmr_fpg_actualiza_usr")!=null) nmr_fpg_actualiza_usr = request.getParameter("nmr_fpg_actualiza_usr");
        if(request.getParameter("nmr_fpg_actualiza_fec")!=null) nmr_fpg_actualiza_fec = request.getParameter("nmr_fpg_actualiza_fec");
    %>
    <h1>FORMAS DE PAGO</h1>
    <form name="nmr_form_forma_pag" id="nmr_form_forma_pag" action="nmr_form_forma_pag" method="POST">
        <table>
            <tr>
                <td>Codigo Forma Pago*:</td>
                <td><input type="text" name="nmr_fpg_codigo" id="nmr_fpg_codigo" value="<%=nmr_fpg_codigo%>"/></td>
            </tr>
            <tr>
                <td>Decripcion:</td>
                <td><input type="text" name="nmr_fpg_descripcion" id="nmr_fpg_descripcion" value="<%=nmr_fpg_descripcion%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="nmr_fpg_estado" id="nmr_fpg_estado" value="<%=nmr_fpg_estado%>"/></td>
            </tr>
            <tr>
                <td>Dias:</td>
                <td><input type="text" name="nmr_fpg_dias" id="nmr_fpg_dias" value="<%=nmr_fpg_dias%>"/></td>
            </tr>
            <tr>
                <td colspan="3"><h3>Datos de Auditoria</h3></td>
            </tr>
            <tr>
                <td>Creacion:</td>
                <td><input type="text" name="nmr_fpg_creacion_usr" id="nmr_fpg_creacion_usr" value="<%=nmr_fpg_creacion_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_fpg_creacion_fec" id="nmr_fpg_creacion_fec" value="<%=nmr_fpg_creacion_fec%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Actualiza:</td>
                <td><input type="text" name="nmr_fpg_actualiza_usr" id="nmr_fpg_actualiza_usr" value="<%=nmr_fpg_actualiza_usr%>" disabled="disabled"/></td>
                <td><input type="text" name="nmr_fpg_actualiza_fec" id="nmr_fpg_actualiza_fec" value="<%=nmr_fpg_actualiza_fec%>" disabled="disabled"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
