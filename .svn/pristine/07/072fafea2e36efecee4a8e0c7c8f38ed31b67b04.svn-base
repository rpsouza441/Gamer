<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="art-layout-cell layout-item-0" style="width: 100%">
	<h1>Cadastro de Usuário</h1>
	<p>
		<sf:form modelAttribute="pessoa" action="guardarAnexos">

			<sf:hidden path="id" />
			<sf:hidden path="nome" />
			<sf:hidden path="sobrenome" />
			<sf:hidden path="login" />
			<sf:hidden path="hashSenha" />


			<!--<c:forEach items="${jogos1}" var="jogo">
				<c:forEach items="${pessoa.jogos}" var="jogoPessoa">


					<c:choose>
						<c:when test="${jogoPessoa.id == jogo.id}">
							<sf:checkbox path="jogos" value="${jogo.id}" checked="checked" />
							<c:out value="${jogo.nome}" />
							<c:out value="${jogo.id}" />
							<c:out value="${jogoPessoa.id}" />
						</c:when>
						<c:otherwise >
							a<sf:checkbox path="jogos" value="${jogo.id}" />
							<c:out value="${jogo.nome}" />
							<c:out value="${jogo.id}" />
							<c:out value="${jogoPessoa.id}" />
						</c:otherwise>
					</c:choose>

					<br />
					<br />
				</c:forEach>

			</c:forEach>
			-->



			<c:forEach items="${jogos}" var="jogo">
				<c:set var="flagj" scope="page" value="false" />
				<c:forEach items="${pessoa.jogos}" var="jogoPessoa">
					<c:if test="${jogoPessoa.id == jogo.id}">
						<c:set var="flagj" value="true" />
					</c:if>

				</c:forEach>
				<c:choose>
					<c:when test="${flagj == true}">
						<sf:checkbox path="jogos" value="${jogo.id}" checked="checked" />
					</c:when>
					<c:otherwise>
						<sf:checkbox path="jogos" value="${jogo.id}" />
					</c:otherwise>
				</c:choose>
				<c:out value="${jogo.nome}" />

			</c:forEach>

			<br />
			<br />

			<c:forEach items="${consoles}" var="console">
				<c:set var="flagc" scope="page" value="false" />
				<c:forEach items="${pessoa.consoles}" var="consolePessoa">
					<c:if test="${consolePessoa.id == console.id}">
						<c:set var="flagc" value="true" />
					</c:if>

				</c:forEach>
				<c:choose>
					<c:when test="${flagc == true}">
						<sf:checkbox path="consoles" value="${console.id}"
							checked="checked" />
					</c:when>
					<c:otherwise>
						<sf:checkbox path="consoles" value="${console.id}" />
					</c:otherwise>
				</c:choose>
				<c:out value="${console.nome}" />

			</c:forEach>





			<input type="submit" value="Cadastrar" class="Cadastrar" />


		</sf:form>

	</p>


	<br> <br>

	<h3></h3>
	<p style="text-align: justify;">
		<a href="#"></a>
	</p>
</div>