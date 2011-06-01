class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/scaffold"(view:"/scaffold")
		"/"(view:"/index")
		"500"(view:'/error')
	}
}
