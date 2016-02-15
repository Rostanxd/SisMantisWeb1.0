<%--
  Created by IntelliJ IDEA.
  User: Bairon
  Date: 02/02/2016
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link rel="stylesheet" href="syc_main.css" type="text/css"/>
        <title>SisMantis ERP</title>
        <%--Codigo jQuery para las mejoras en el ambiente WEB--%>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            $(function() {
                $( "#accordion" ).accordion();
            });
        </script>
    </head>
    <body style="margin: 0%">
        <!--Header-->
        <div id="divHead">
            <div>
                <table style="float: left;">
                    <tr>
                        <td><img style="height: 25px; width: 25px; line-height: 30px" src="logo.jpg"/></td>
                        <td style="font-size: 18px; color: #0b3e6f; line-height: 30px">Sistema ERP Mantis 1.0</td>
                    </tr>
                </table>
            </div>
            <div id="divInput">
                <table>
                    <tr>
                        <td style="line-height: 30px">Inicio</td>
                    </tr>
                </table>
            </div>
        </div>
        <div id="divCentral">
            <div id="accordion">
                <h3>Sistemas y Configuracion</h3>
                <ol>
                    <li>Maestros</li>
                    <li>Transacciones</li>
                    <li>Procesos</li>
                    <li>Reportes</li>
                </ol>
                <h3>Inventarios y Servicios</h3>
                <ol>
                    <li>Maestros</li>
                    <li>Transacciones</li>
                    <li>Procesos</li>
                    <li>Reportes</li>
                </ol>
                <h3>Compras y Cuentas por Pagar</h3>
                <ol>
                    <li>Maestros</li>
                    <li>Transacciones</li>
                    <li>Procesos</li>
                    <li>Reportes</li>
                </ol>
                <h3>Nominas y Roles de Pago</h3>
                <ol>
                    <li>Maestros</li>
                    <li>Transacciones</li>
                    <li>Procesos</li>
                    <li>Reportes</li>
                </ol>
                <h3>Contabilidad</h3>
                <ol>
                    <li>Maestros</li>
                    <li>Transacciones</li>
                    <li>Procesos</li>
                    <li>Reportes</li>
                </ol>
            </div>
            <%--Div donde van a ser llamados los programas--%>
            <div id="main">
                <div id="tabs">
                    <ul>
                        <li><a href="#Inicio"><span>Inicio</span></a></li>
                    </ul>
                    <div id="Inicio">
                    </div>
                </div>
                <script>
                    $( "#tabs" ).tabs();
                </script>
            </div>
        </div>
    </body>
</html>
