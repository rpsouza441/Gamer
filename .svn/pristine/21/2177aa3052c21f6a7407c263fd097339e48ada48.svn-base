<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<div class="art-layout-cell layout-item-0" style="width: 100%">
	<h1>Cadastro de Fabricante</h1>
	<p>
		<sf:form modelAttribute="fabricante" action="executarRegistroFab">

			<label for="nome">Nome: </label>
			<sf:input id="nomeFabricante" autocomplete="off" path="nome" class="four" />

			<br />
			<sf:errors path="nome" />
			<br />
			<label for="data">Data: </label>
			<sf:input id="dataFabricante" type="text"  path="data" class="date-picker" />
			

			<br />
			<sf:errors path="data" />
			<br />


			<input type="submit" value="Cadastrar" class="Cadastrar" />


		</sf:form>
<script>
$(function() {
    $('.date-picker').datepicker( {
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        dateFormat: 'dd MM yy',
        onClose: function(dateText, inst) { 
            var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
            var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
            $(this).datepicker('setDate', new Date(year, month, 1));
        }
    });
});
</script>
	</p>


	<br> <br>


</div>