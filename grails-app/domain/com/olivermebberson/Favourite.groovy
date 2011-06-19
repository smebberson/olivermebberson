package com.olivermebberson

class Favourite {

	String title
	String description
	String link
	Integer rank = 5
	
    static constraints = {
		title (blank: false)
		description (nullable: true, maxSize: 1000)
		link (nullable: true)
    }
	
}
