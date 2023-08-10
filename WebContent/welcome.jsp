<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="l"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="e"%>
<%-- <e:write name="helloForm" property="age"/> --%>
Bem vindo
<b:write name="helloForm" property="name" />


<table style="border: 1px solid black">
	<thead>
		<tr>
			<td>Nome</td>
			<td>Sobre nome</td>
			<td>Idade</td>
		</tr>
	</thead>
	<tbody>
		<l:iterate id="u" name="helloForm" property="list">
			<tr>
				<td><e:write name="u" property="name" /></td>
				<td><e:write name="u" property="lastName" /></td>
				<td><e:write name="u" property="age" /></td>
			</tr>
		</l:iterate>
	</tbody>
</table>