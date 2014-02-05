<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="art-layout-cell layout-item-0" style="width: 100%">
	<h1>Cadastro do Console</h1>
	<p>
		<sf:form modelAttribute="console" action="executarRegistroConsole">

			<label for="nome">Nome: </label>
			<sf:input id="nomeConsole" autocomplete="off" path="nome" class="four" />
			<br />
			<sf:errors path="nome" />
			<br />

			<label for="versao">Versão: </label>
			<sf:input id="versaoConsole" autocomplete="off" path="versao" class="four" />
			<br />
			<sf:errors path="versao" />
			<br />

			<label for="ram">Ram: </label>
			<sf:input id="ramConsole" autocomplete="off" path="ram" class="four" />
			<br />
			<sf:errors path="ram" />
			<br />

			<label for="cpu">CPU: </label>
			<sf:input id="cpuConsole" autocomplete="off" path="cpu" class="four" />
			<br />
			<sf:errors path="cpu" />
			<br />

			<label for="hd">HD:</label>
			<sf:input id="hdConsole" autocomplete="off" path="hd" class="four" />
			<br />
			<sf:errors path="hd" />
			<br />

			<sf:select id="fabricanteSelect" name="fabricanteId"
				path="fabricante.id">
				<option value="">Escolha um fabricante</option>
				<c:forEach var="fabricante" items="${fabricantes}">
					<sf:option value="${fabricante.id}">
						<c:out value="${fabricante.nome}" />
					</sf:option>
				</c:forEach>
			</sf:select>



			<br />
			<br />


			<input type="submit" value="Cadastrar" />

		</sf:form>

	</p>


	<br> <br>

	<h3></h3>
	<p style="text-align: justify;">
		<a href="#"></a>
	</p>
</div>