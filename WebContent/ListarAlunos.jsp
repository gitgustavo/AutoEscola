<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Aluno</title>
</head>
<body>
	<f:view>
		<center>
			<h1>Lista de Alunos</h1>
		</center>
		<hr />
		<center>
			<h:form>
				<h:dataTable value="#{alunoMBean.alunos}" var="lista" border="1">
					<h:column>
						<h:outputText value="#{lista.nome}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.rg}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.cpf}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.dataNascimento}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.rua}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.numero}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.cep}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.bairro}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.cidade}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.estado}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.complemento}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.telefone1}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.telefone2}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.email}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.login}" />
						<br/>
					</h:column>
					<h:column>
						<h:outputText value="#{lista.senha}" />
						<br/>
					</h:column>
					<h:column>
						<h:form>
							<h:commandButton value="Editar" action="#{alunoMBean.actionEditarAluno}" >
							</h:commandButton>
						</h:form>
					</h:column>
				</h:dataTable>
			</h:form>
		</center>
	</f:view>
</body>
</html>