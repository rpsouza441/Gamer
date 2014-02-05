<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="art-layout-cell layout-item-0" style="width: 100%">
	<h1>Cadastro de Jogos</h1>
	<p>
		<sf:form modelAttribute="jogo" action="executarRegistroJogo">

			<label for="nome">Nome: </label>
			<sf:input id="nomeJogo" autocomplete="off" path="nome" class="four" />

			<br />
			<sf:errors path="nome" />
			<br />

			<label for="descricao">Descrição: </label>
			<sf:textarea id="descricaoJogo" autocomplete="off" rows="5" cols="30" path="descricao"
				class="four" />

			<br />
			<sf:errors path="descricao" />
			<br />


			<sf:select path="fabricante" id="fabricante">
				<sf:option value="NONE" label="Escolha um fabricante" />
				<sf:options items="${fabricantes}" itemValue="id" itemLabel="nome" />
			</sf:select>

			<br />
			<br />


			<c:forEach items="${consoles}" var="console">
				<sf:checkbox path="consoles" value="${console.id}" />
				<c:out value="${console.nome}" />
			</c:forEach>

			<br />
			<br />

			<!--<c:forEach items="${consoles}" var="consoles" >
				<input type="checkbox" 	value="${consoles.id}"  /> ${consoles.nome}
        
   			</c:forEach>

			-->



			<input type="submit" value="Cadastrar" class="tiny button success" />

		</sf:form>

	</p>
</div>