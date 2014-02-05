<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


			<h3>Detalhes do membro</h3>

<div class="row">
	<h4>Dados</h4>
</div>
<br />

<div class="row">
	<div class="two columns">
		<b>Nome:</b>
	</div>
	<div class="ten columns">${pessoa.nome}</div>
</div>
<div class="row">
	<div class="two columns">
		<b>Sobrenome:</b>
	</div>
	<div class="ten columns">${pessoa.sobrenome}</div>
</div>
<div class="row">
	<h4>Jogos</h4>
</div>
<br />

<c:forEach items="${pessoa.jogos}" var="jogo">
	
<div class="row">
	<div class="two columns">
		<b>Nome:</b>
	</div>
	<div class="ten columns">${jogo.nome}</div>
</div>

<div class="row">
	<div class="two columns">
		<b>Fabricante:</b>
	</div>
	<div class="ten columns">${jogo.fabricante.nome}</div>
</div>

<div class="row">
	<div class="two columns">
		<b>Descrição:</b>
	</div>
	<div class="ten columns">${jogo.descricao}</div>
</div>

<br /><br />

</c:forEach>

<div class="row">
	<h4>Consoles</h4>
</div>
<br />
<c:forEach items="${pessoa.consoles}" var="console">
<div class="row">
	<div class="two columns">
		<b>Nome:</b>
	</div>
	<div class="ten columns">${console.nome}</div>
</div>

<div class="row">
	<div class="two columns">
		<b>Versão:</b>
	</div>
	<div class="ten columns">${console.versao}</div>
</div>

<div class="row">
	<div class="two columns">
		<b>Fabricante:</b>
	</div>
	<div class="ten columns">${console.fabricante.nome}</div>
</div>

</c:forEach>




<h3></h3>
<p style="text-align: justify;">
	<a href="#"></a>
</p>
</div>