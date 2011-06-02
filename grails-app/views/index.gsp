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
					<article class="saying sixcol<g:if test="${ i == 2 }"> last</g:if>">
						<div>
						<h1>${ saying.title }</h1>
						<time>${ saying.saidOn }</time>
						<p>${ saying.description }</p>
						</div>
					</article>
					</g:each>
				
					<article class="saying sixcol">
						<div>
						<h1>Never again Daddy</h1>
						<time datetime="01-01-1970">01-01-1970</time>
						<p>This is the description of the saying ;)</p>
						</div>
					</article>
					
					<article class="saying sixcol last">
						<div>
						<h1>Never again Daddy</h1>
						<time datetime="01-01-1970">01-01-1970</time>
						<p>This is the description of the saying ;)</p>
						</div>
					</article>
				
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