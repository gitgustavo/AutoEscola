<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Aluno</title>
</head>
<body>
<f:view>
<h:form>
<center><h2> Cadastro de Aluno </h2></center>
<br>
<center>
<table>
<tr>
<td align="right">Nome:</td>
<td>
<h:inputText id="nome" value="#{alunoMBean.aluno.nome}" size="100" maxlength="100"/>
</td>
</tr>
<tr>
<td align="right">RG:</td>
<td>
<h:inputText id="rg" value="#{alunoMBean.aluno.rg}" size="10" maxlength="10"/>
</td>
</tr>
<tr>
<td align="right">CPF:</td>
<td>
<h:inputText id="cpf" value="#{alunoMBean.aluno.cpf}" size="11" maxlength="11"/>
</td>
</tr>
<tr>
<td align="right">Data de Nascimento:</td>
<td>
<h:inputText id="dataNascimento" value="#{alunoMBean.aluno.dataNascimento}"/>
</td>
</tr>
<tr>
<td align="right">Rua:</td>
<td>
<h:inputText id="rua" value="#{alunoMBean.aluno.rua}" size="100" maxlength="200"/>
</td>
</tr>
<tr>
<td align="right">Numero:</td>
<td>
<h:inputText id="numero" value="#{alunoMBean.aluno.numero}" maxlength="10"/>
</td>
</tr>
<tr>
<td align="right">CEP:</td>
<td>
<h:inputText id="cep" value="#{alunoMBean.aluno.cep}" size="12" maxlength="12"/>
</td>
</tr>
<tr>
<td align="right">Bairro:</td>
<td>
<h:inputText id="bairro" value="#{alunoMBean.aluno.bairro}" maxlength="50"/>
</td>
</tr>
<tr>
<td align="right">Cidade:</td>
<td>
<h:inputText id="cidade" value="#{alunoMBean.aluno.cidade}" maxlength="100"/>
</td>
</tr>
<tr>
<td align="right">Estado:</td>
<td>
<h:inputText id="estado" value="#{alunoMBean.aluno.estado}" maxlength="50"/>
</td>
</tr>
<tr>
<td align="right">Complemento:</td>
<td>
<h:inputText id="complemento" value="#{alunoMBean.aluno.complemento}" size="100" maxlength="200"/>
</td>
</tr>
<tr>
<td align="right">Telefones:</td>
<td>
<h:inputText id="telefone1" value="#{alunoMBean.aluno.telefone1}" maxlength="45" /> - 
<h:inputText id="telefone2" value="#{alunoMBean.aluno.telefone2}" maxlength="45" />
</td>
</tr>
<tr>
<td align="right">Email:</td>
<td>
<h:inputText id="email" value="#{alunoMBean.aluno.email}" maxlength="45" />
</td>
</tr>
<tr>
<td align="right">Login:</td>
<td>
<h:inputText id="login" value="#{alunoMBean.aluno.login}" maxlength="45" />
</td>
</tr>
<tr>
<td align="right">Senha:</td>
<td>
<h:inputText id="senha" value="#{alunoMBean.aluno.senha}" maxlength="45" />
</td>
</tr>
<tr>
<td align="right">Confirmar Senha:</td>
<td>
</td>
</tr>
</table>
</center>

<br/>
<center>
<h:commandButton value="Cadastrar" action="#{alunoMBean.actionCadastroAluno}"/>
<h:commandButton value="Cancelar" action="#{aluno.inserir}"/>
</center>
</h:form>
</f:view>
</body>
</html>