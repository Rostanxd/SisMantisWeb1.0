<%--
  Created by IntelliJ IDEA.
  User: Rostan
  Date: 11/02/2016
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="trxStyles.css"/>
    <title>Maestro Programas</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_prg_codigo = "";
        String syc_mod_codigo = "";
        String syc_prg_descripcion = "";
        String syc_prg_abreviatura = "";
        String syc_prg_tipo = "";
        String syc_prg_objeto = "";
        String syc_prg_programa = "";

        if(request.getParameter("syc_prg_codigo")!=null) syc_prg_codigo = request.getParameter("syc_prg_codigo");
        if(request.getParameter("syc_mod_codigo")!=null) syc_mod_codigo = request.getParameter("syc_mod_codigo");
        if(request.getParameter("syc_prg_descripcion")!=null) syc_prg_descripcion = request.getParameter("syc_prg_descripcion");
        if(request.getParameter("syc_prg_abreviatura")!=null) syc_prg_abreviatura = request.getParameter("syc_prg_abreviatura");
        if(request.getParameter("syc_prg_tipo")!=null) syc_prg_tipo = request.getParameter("syc_prg_tipo");
        if(request.getParameter("syc_prg_objeto")!=null) syc_prg_objeto = request.getParameter("syc_prg_objeto");
        if(request.getParameter("syc_prg_programa")!=null) syc_prg_programa = request.getParameter("syc_prg_programa");
    %>
    <h1>PROGRAMAS</h1>
    <form name="syc_form_programa" id="syc_form_programa" action="syc_form_programa" method="POST">
        <table>
            <tr>
                <td>Codigo Programa*:</td>
                <td><input type="text" name="syc_prg_codigo" id="syc_prg_codigo" value="<%=syc_prg_codigo%>"/></td>
            </tr>
            <tr>
                <td>Modulo*:</td>
                <td><input type="text" name="syc_mod_codigo" id="syc_mod_codigo" value="<%=syc_mod_codigo%>"/></td>
            </tr>
            <tr>
                <td>Descripcion:</td>
                <td><input type="text" name="syc_prg_descripcion" id="syc_prg_descripcion" value="<%=syc_prg_descripcion%>"/></td>
            </tr>
            <tr>
                <td>Abreviatura:</td>
                <td><input type="text" name="syc_prg_abreviatura" id="syc_prg_abreviatura" value="<%=syc_prg_abreviatura%>"/></td>
            </tr>
            <tr>
                <td>Tipo:</td>
                <td><input type="text" name="syc_prg_tipo" id="syc_prg_tipo" value="<%=syc_prg_tipo%>"/></td>
            </tr>
            <tr>
                <td>Objeto:</td>
                <td><input type="text" name="syc_prg_objeto" id="syc_prg_objeto" value="<%=syc_prg_objeto%>"/></td>
            </tr>
            <tr>
                <td>Programa:</td>
                <td><input type="text" name="syc_prg_programa" id="syc_prg_programa" value="<%=syc_prg_programa%>"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
