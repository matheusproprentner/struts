<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>


<h:form action="/hello">
	<h:text property="name"></h:text>
	<h:submit></h:submit>
	
	<hr>
	<h:errors/>
</h:form>>