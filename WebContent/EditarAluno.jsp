<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edição de Aluno</title>
</head>
<body>
<f:view>
<h1>Edição de Aluno</h1>
<br/>
<br/>
 Nome: 
 <br/>
<h:inputText id="nome" value="#{alunoMBean.aluno.nome}"/>
<br/>
RG:
<br/>
<h:inputText id="rg" value="#{alunoMBean.aluno.rg}" />
 <br/>
 CPF: 
<br/>
<h:inputText id="cpf" value="#{alunoMBean.aluno.cpf}" />
 <br/>
 Data de Nascimento: 
<br/>
<h:inputText id="dataNascimento" value="#{alunoMBean.aluno.dataNascimento}"/>
 <br/>
 Rua: 
<br/>
<h:inputText id="rua" value="#{alunoMBean.aluno.rua}" />
 <br/>
 Numero: 
 <br/>
<h:inputText id="numero" value="#{alunoMBean.aluno.numero}" />
 <br/>
 CEP: 
<br/>
<h:inputText id="cep" value="#{alunoMBean.aluno.cep}" />
<br/>
 Bairro: 
 <br/>
<h:inputText id="bairro" value="#{alunoMBean.aluno.bairro}" />
 <br/> 
 Cidade: 
 <br/>
<h:inputText id="cidade" value="#{alunoMBean.aluno.cidade}" />
 <br/> 
 Estado: 
 <br/>
<h:inputText id="estado" value="#{alunoMBean.aluno.estado}"/>
 <br/>
 Complemento: 
 <br/>
<h:inputText id="complemento" value="#{alunoMBean.aluno.complemento}" />
 <br/> 
 Telefone1: 
 <br/>
<h:inputText id="telefone1" value="#{alunoMBean.aluno.telefone1}" /> - 
<br/> 
 Telefone2: 
 <br/>
<h:inputText id="telefone2" value="#{alunoMBean.aluno.telefone2}" />
  <br/> 
 Email: 
  <br/>
<h:inputText id="email" value="#{alunoMBean.aluno.email}" />
  <br/> 
 Login: 
  <br/>
<h:inputText id="login" value="#{alunoMBean.aluno.login}" />
  <br/> 
 Senha: 
  <br/>
<h:inputText id="senha" value="#{alunoMBean.aluno.senha}" />
  <br/> 
 Confirmar Senha: 
  <br/> 
<br/>

<h:commandButton value="Cadastrar" action="#{alunoMBean.actionEditarAluno}"/>
<h:commandButton value="Cancelar" action="#{aluno.inserir}"/>


</f:view>
</body>
</html>