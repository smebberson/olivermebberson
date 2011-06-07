<article class="saying sixcol<g:if test="${ i == 1 }"> last</g:if>">
	<div>
	<h1>${ saying.title }</h1>
	<time datetime="${ saying.saidOn.format('dd/MM/yyyy') }"><g:formatDate format="dd/MM/yyyy" date="${ saying.saidOn }" /></time>
	<p>${ saying.description }</p>
	</div>
</article>