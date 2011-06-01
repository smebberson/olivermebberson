package com.olivermebberson

class Saying {

	String title
	String description
	String status = "draft"
	String roles = "family-immediate"
	Date saidOn
	
    static constraints = {
		title (blank: false)
		description (blank: false, maxSize: 1000)
		saidOn (blank: false)
		status (inList: ["draft", "published"])
		roles (inList: ["public", "family-immediate", "family-extended", "friends"])
    }
}
