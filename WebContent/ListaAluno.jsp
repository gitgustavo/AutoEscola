<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Aluno</title>
</head>
<body>
<f:view>
<center><h1>Lista de Alunos</h1></center>
<hr/>
<center>
<h:form>
<h:dataTable rendered="#{not empty AlunoMBean.alunos}" border="1" var="f" value="#{AlunoMBean.alunos}">
<h:column>
<f:facet name="header">
<h:outputText value="Nome"/>
</f:facet>
<h:outputText value="#{f.nome }" /> 
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="RG"/>
</f:facet>
<h:outputText value="#{f.rg }" /> 
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="CPF"/>
</f:facet>
<h:outputText value="#{f.cpf }" /> 
</h:column>
</h:dataTable>
</h:form>
</center>
</f:view>
</body>
</html>