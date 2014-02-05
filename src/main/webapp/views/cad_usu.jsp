<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="art-layout-cell layout-item-0" style="width: 100%">
	<h1>Cadastro de Usuário</h1>
	<p>
		<sf:form modelAttribute="pessoa" action="executarRegistroPessoa">

			<label for="nome">Nome: </label>
			<sf:input id="nomeUsuario" autocomplete="off" path="nome" class="four" />
			<sf:errors path="nome" />
			<br />
			<br />


			<label for="sobrenome">Sobrenome: </label>
			<sf:input id="sobrenomePessoa" autocomplete="off" path="sobrenome" class="four" />
			<sf:errors path="sobrenome" />
			<br />
			<br />


			<label for="login">Login: <sf:errors path="login"
					cssClass="erro" />
			</label>
			<sf:input id="loginPessoa" autocomplete="off" path="login" class="four" />
			<br />
			<br />


			<label for="senha">Senha: </label>
			<sf:password id="pwdPessoa" autocomplete="off" path="senha" class="four" />
			<sf:errors path="senha" />
			<br />
			<br />

			<br />
			<br />

			<input type="submit" value="Cadastrar" class="Cadastrar" />


		</sf:form>

	</p>


	<br> <br>

	<h3></h3>
	<p style="text-align: justify;">
		<a href="#"></a>
	</p>
</div>