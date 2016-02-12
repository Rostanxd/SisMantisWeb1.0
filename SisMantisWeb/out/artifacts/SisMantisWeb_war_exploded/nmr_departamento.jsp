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
    <title>Maestro Departamentos</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_emp_codigo = "";
        String nmr_dep_codigo = "";
        String nmr_dep_descripcion = "";
        String nmr_dep_estado = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("nmr_dep_codigo")!=null) nmr_dep_codigo = request.getParameter("nmr_dep_codigo");
        if(request.getParameter("nmr_dep_descripcion")!=null) nmr_dep_descripcion = request.getParameter("nmr_dep_descripcion");
        if(request.getParameter("nmr_dep_estado")!=null) nmr_dep_estado = request.getParameter("nmr_dep_estado");
    %>
    <h1>DEPARTAMENTO</h1>
    <form name="nmr_form_departamento" id="nmr_form_departamento" action="nmr_form_departamento" method="POST">
        <table>
            <tr>
                <td>Codigo Departamento*:</td>
                <td><input type="text" name="nmr_dep_codigo" id="nmr_dep_codigo" value="<%=nmr_dep_codigo%>"/></td>
            </tr>
            <tr>
                <td>Decripcion:</td>
                <td><input type="text" name="nmr_dep_descripcion" id="nmr_dep_descripcion" value="<%=nmr_dep_descripcion%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="nmr_dep_estado" id="nmr_dep_estado" value="<%=nmr_dep_estado%>"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
