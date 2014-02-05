<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title><tiles:getAsString name="titulo" /></title>

<meta name="viewport"
	content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

<!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<!--[if lte IE 7]><link rel="stylesheet" href="style.ie7.css" media="screen" /><![endif]-->
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Arvo|PT+Sans&amp;subset=latin">
<link rel="stylesheet"
	href="<c:url value="/recursos/css/style.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/recursos/css/style.responsive.css"/>" />


<script type="text/javascript"
	src="<c:url value="/recursos/js/jquery.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/recursos/js/script.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/recursos/js/script.responsive.js"/>"></script>




<style>.art-content .art-postcontent-0 .layout-item-0 { padding: 20px;  }
.ie7 .art-post .art-layout-cell {border:none !important; padding:0 !important; }
.ie6 .art-post .art-layout-cell {border:none !important; padding:0 !important; }

</style>
</head>
<body>

	<div id="art-main">
						<tiles:insertAttribute name="cabecalho" />
		
		
							<tiles:insertAttribute name="links" />
							
	<div class="art-sheet clearfix">
			<div class="art-layout-wrapper">
				<div class="art-content-layout">
					<div class="art-content-layout-row">
						<div class="art-layout-cell art-content">
							<div class="art-vmenublock clearfix">
								<tiles:insertAttribute name="login" />
							</div>
							<article class="art-post art-article">

								<div class="art-postcontent art-postcontent-0 clearfix">
									<div class="art-content-layout">
										<div class="art-content-layout-row">



											<tiles:insertAttribute name="conteudo" />




										</div>
									</div>
								</div>



							</article>
						</div>
					</div>
				</div>
			</div>
		</div>
		<footer class="art-footer">

			<tiles:insertAttribute name="rodape" />

		</footer>

	</div>


</body>
</html>