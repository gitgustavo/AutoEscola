<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Veiculo</title>
</head>
<body>
<f:view>
<h:form>
<center><h2> Cadastrar Aluno </h2></center>
<br>
<center>
<table>
<tr>
<td align="right">Placa:</td>
<td>
<h:inputText id="placa" value="#{veiculo.placa}" maxlength="10"/>
</td>
</tr>
<tr>
<td align="right">Tipo:</td>
<td>
<h:inputText id="tipo" value="#{veiculo.tipo}" maxlength="45"/>
</td>
</tr>
<tr>
<td align="right">Cor:</td>
<td>
<h:inputText id="cor" value="#{veiculo.cor}" maxlength="45"/>
</td>
</tr>
<tr>
<td align="right">Descrição do Veiculo:</td>
<td>
<h:inputText id="descricao" value="#{veiculoMBean.descricao}" maxlength="100"/>
</td>
</tr>
</table>
</center>
<br/>
<center>
<h:commandButton value="Adicionar" action="#{veiculoMBean.adicionar}"/>
</center>
<hr/>
<center> Lista de Veículos 
<table border="1">
<tr> 
<td> Placa </td>
<td> Tipo </td>
<td> Cor </td>
<td> Descrição </td>
</tr>
</table>
</center>
<hr/>
<center>
<h:commandButton value="<< Voltar" action="#{history.back(-1)}"/>
<h:commandButton value="Cancelar" action="#{aluno.inserir}"/>
<h:commandButton value="Cadastrar" action="#{veiculoMBean.cadastrar}"/>
</center>
</h:form>
</f:view>
</body>
</html>