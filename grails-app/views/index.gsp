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
					<g:render template="sayingSnippet" model="[saying:saying,i:i]" />
					</g:each>
				
				</section>
					
			</article>
			
			<aside class="fourcol last">
			
				<section>
				
					<h1>My favourite things</h1>
					
					<nav>
						<g:each in="${ favourites }" var="favourite">
							<li>${ favourite.title }</li>
						</g:each>
					</nav>
					
				</section>
			
			</aside>
		
			</div>
		
		</div>
		
	</body>
</html>