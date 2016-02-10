<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 09/02/2016
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--// Codigo java para el formulario--%>
    <%
        // Captura de las variables del ambiente web
        String syc_emp_codigo = "";
        String syc_emp_ruc= "";
        String syc_emp_estado = "";
        String syc_emp_descripcion = "";
        String syc_emp_telefono = "";
        String syc_emp_telefono_alt = "";
        String syc_emp_direccion = "";
        String syc_emp_pagina_web = "";
        String syc_emp_email = "";
        String syc_emp_logo = "";
        String syc_emp_creacion_usr = "";
        String syc_emp_creacion_fec = "";
        String syc_emp_actualiza_usr = "";
        String syc_emp_actualiza_fec = "";

        if(request.getParameter("syc_emp_codigo")!=null) syc_emp_codigo = request.getParameter("syc_emp_codigo");
        if(request.getParameter("syc_emp_ruc")!=null) syc_emp_codigo = request.getParameter("syc_emp_ruc");
        if(request.getParameter("syc_emp_estado")!=null) syc_emp_codigo = request.getParameter("syc_emp_estado");
        if(request.getParameter("syc_emp_descripcion")!=null) syc_emp_codigo = request.getParameter("syc_emp_descripcion");
        if(request.getParameter("syc_emp_telefono")!=null) syc_emp_codigo = request.getParameter("syc_emp_telefono");
        if(request.getParameter("syc_emp_telefono_alt")!=null) syc_emp_codigo = request.getParameter("syc_emp_telefono_alt");
        if(request.getParameter("syc_emp_direccion")!=null) syc_emp_codigo = request.getParameter("syc_emp_direccion");
        if(request.getParameter("syc_emp_pagina_web")!=null) syc_emp_codigo = request.getParameter("syc_emp_pagina_web");
        if(request.getParameter("syc_emp_email")!=null) syc_emp_codigo = request.getParameter("syc_emp_email");
        if(request.getParameter("syc_emp_logo")!=null) syc_emp_codigo = request.getParameter("syc_emp_logo");
        if(request.getParameter("syc_emp_creacion_usr")!=null) syc_emp_codigo = request.getParameter("syc_emp_creacion_usr");
        if(request.getParameter("syc_emp_creacion_fec")!=null) syc_emp_codigo = request.getParameter("syc_emp_creacion_fec");
        if(request.getParameter("syc_emp_actualiza_usr")!=null) syc_emp_codigo = request.getParameter("syc_emp_actualiza_usr");
        if(request.getParameter("syc_emp_actualiza_fec")!=null) syc_emp_codigo = request.getParameter("syc_emp_actualiza_fec");
    %>
    <h1>EMPRESA</h1>
    <form name="syc_form_emp" id="syc_form_emp" action="syc_form_emp" method="POST">
        <table>
            <tr>
                <td>Codigo Empresa*:</td>
                <td><input type="text" name="syc_emp_codigo" id="syc_emp_codigo" value="<%=syc_emp_codigo%>"/></td>
            </tr>
            <tr>
                <td>RUC*:</td>
                <td><input type="text" name="syc_emp_ruc" id="syc_emp_ruc" value="<%=syc_emp_ruc%>"/></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="syc_emp_estado" id="syc_emp_estado" value="<%=syc_emp_estado%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Descripcion:</td>
                <td><input type="text" name="syc_emp_descripcion" id="syc_emp_descripcion" value="<%=syc_emp_descripcion%>"/></td>
            </tr>
            <tr>
                <td>Telefono:</td>
                <td><input type="text" name="syc_emp_telefono" id="syc_emp_telefono" value="<%=syc_emp_telefono%>"/></td>
            </tr>
            <tr>
                <td>Telefono Alt:</td>
                <td><input type="text" name="syc_emp_telefono_alt" id="syc_emp_telefono_alt" value="<%=syc_emp_telefono_alt%>"/></td>
            </tr>
            <tr>
                <td>Direccion:</td>
                <td><input type="text" name="syc_emp_direccion" id="syc_emp_direccion" value="<%=syc_emp_direccion%>"/></td>
            </tr>
            <tr>
                <td>Pagina WEB:</td>
                <td><input type="text" name="syc_emp_pagina_web" id="syc_emp_pagina_web" value="<%=syc_emp_pagina_web%>"/></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><input type="text" name="syc_emp_email" id="syc_emp_email" value="<%=syc_emp_email%>"/></td>
            </tr>
            <tr>
                <td>Logo:</td>
                <td><input type="text" name="syc_emp_logo" id="syc_emp_logo" value="<%=syc_emp_logo%>"/></td>
            </tr>
            <tr>
                <td>Creacion:</td>
                <td><input type="text" name="syc_emp_creacion_usr" id="syc_emp_creacion_usr" value="<%=syc_emp_creacion_usr%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Fecha:</td>
                <td><input type="text" name="syc_emp_creacion_fec" id="syc_emp_creacion_fec" value="<%=syc_emp_creacion_fec%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Actualiza:</td>
                <td><input type="text" name="syc_emp_actualiza_usr" id="syc_emp_actualiza_usr" value="<%=syc_emp_actualiza_usr%>" disabled="disabled"/></td>
            </tr>
            <tr>
                <td>Fecha:</td>
                <td><input type="text" name="syc_emp_actualiza_fec" id="syc_emp_actualiza_fec" value="<%=syc_emp_actualiza_fec%>" disabled="disabled"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
