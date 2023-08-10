<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>


<h:form action="/hello">
	<h:text property="name">Login</h:text>
	<h:text property="password">Senha</h:text>
	<h:submit></h:submit>
	<hr>
	<h:errors/>
</h:form>