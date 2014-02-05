<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<sec:authorize access="isAnonymous()">
	<div class="art-vmenublockheader">
		<h3 class="t">Login<br /><form action="<c:url value="/j_spring_security_check"/>" method="post">

		
			<input type="text" name="j_username"
				placeholder="Usu&aacute;rio" /> <input type="password"
				name="j_password" placeholder="Senha" /> <input type="submit"
				value="Entrar" class="tiny button success" />&nbsp;<br /> <a
				href="<c:url value='registroPessoa'/>">Registre-se</a>
		


	</form>
	</h3>
	</div>
	

</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<div class="art-vmenublockheader">
		<h3 class="t">Bem vindo(a) <sec:authentication property="principal" /> - <a
			href="<c:url value="/j_spring_security_logout"/>">Sair</a> </h3>
	</div>
	
</sec:authorize>
