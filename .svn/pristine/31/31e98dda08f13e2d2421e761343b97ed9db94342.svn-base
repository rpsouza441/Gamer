<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<nav class="art-nav">
	<ul class="art-hmenu">
		<li><a href="<c:url value='/'/>">Index</a></li>
		<li><a href="<c:url value='registroPessoa'/>">Cadastro de
				Usuário</a></li>
		<li><a href="<c:url value='registroFabricante'/>">Cadastro de
				Fabricantes</a></li>
		<li><a href="<c:url value='registroConsole'/>">Cadastro de
				Consoles</a></li>
		<li><a href="<c:url value='registroJogo'/>">Cadastro de Jogos</a></li>
		<sec:authorize access="hasRole('ROLE_MEMBRO')">
			<li><a href="<c:url value='anexarJogosConsoles'/>">Seus
					Jogos</a></li>

			<li><a href="<c:url value='lista'/>">Lista</a></li>

		</sec:authorize>

	</ul>




</nav>

