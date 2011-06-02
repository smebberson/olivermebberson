package com.olivermebberson

import org.springframework.web.servlet.ModelAndView
import com.olivermebberson.Saying

class IndexController {

    def index = {
	
		def sayings = Saying.list(max:2, sort:'saidOn', order:'desc');
		return new ModelAndView("/index", [sayings: sayings])
		
	}
	
}
