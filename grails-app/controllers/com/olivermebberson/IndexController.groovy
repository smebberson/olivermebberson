package com.olivermebberson

import org.springframework.web.servlet.ModelAndView
import com.olivermebberson.Saying
import com.olivermebberson.Favourite

class IndexController {

    def index = {
	
		def sayings = Saying.list(max:2, sort:'saidOn', order:'desc');
		def favourites = Favourite.list(max: 10, sort:'rank', order:'asc');
		return new ModelAndView("/index", [sayings: sayings, favourites: favourites])
		
	}
	
}
