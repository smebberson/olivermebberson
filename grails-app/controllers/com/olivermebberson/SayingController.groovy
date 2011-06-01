package com.olivermebberson

class SayingController {
	def scaffold = true
	def all = {
		def sayings = Saying.findAllByStatus("published", [sort: "saidOn", order: "asc"]);
		
		return [sayings: sayings];
	}
}
