<html>
	<head>
		<title>Welcome to olivermebberson.com</title>
		<meta name="layout" content="olivermebberson" />
		
	</head>
	<body>
		
		<div class="container">
		
			<div class="row">
			
			<article class="eightcol">
			
				<section class="sayings">
				
					<hgroup class="row">
						<h1>Sayings</h1>
						<h2>View more</h2>
					</hgroup>
					
					<g:each in="${ sayings }" var="saying" status="i">
					<article class="saying sixcol<g:if test="${ i == 1 }"> last</g:if>">
						<div>
						<h1>${ saying.title }</h1>
						<time datetime="${ saying.saidOn.format('dd/MM/yyyy') }"><g:formatDate format="dd/MM/yyyy" date="${ saying.saidOn }" /></time>
						<p>${ saying.description }</p>
						</div>
					</article>
					</g:each>
				
				</section>
					
			</article>
			
			<aside class="fourcol last">
			
				<section>
				
					<h1>My favourite things</h1>
					
					<nav>
						<li>The Octonauts</li>
						<li>Peppa Pig</li>
					</nav>
					
				</section>
			
			</aside>
		
			</div>
		
		</div>
		
	</body>
</html>