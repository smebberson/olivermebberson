class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/scaffold"(view:"/scaffold")
		"/"(controller:"index")
		"500"(view:'/error')
	}
}
