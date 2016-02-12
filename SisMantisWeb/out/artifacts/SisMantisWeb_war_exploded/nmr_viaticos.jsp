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
        String nmr_via_codigo = "";
        String nmr_via_descripcion = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("nmr_via_codigo")!=null) nmr_via_codigo = request.getParameter("nmr_via_codigo");
        if(request.getParameter("nmr_via_descripcion")!=null) nmr_via_descripcion = request.getParameter("nmr_via_descripcion");
    %>
    <h1>VIATICOS</h1>
    <form name="nmr_form_viaticos" id="nmr_form_viaticos" action="nmr_form_viaticos" method="POST">
        <table>
            <tr>
                <td>Codigo Viatico*:</td>
                <td><input type="text" name="nmr_via_codigo" id="nmr_via_codigo" value="<%=nmr_via_codigo%>"/></td>
            </tr>
            <tr>
                <td>Decripcion:</td>
                <td><input type="text" name="nmr_via_descripcion" id="nmr_via_descripcion" value="<%=nmr_via_descripcion%>"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
