import grails.util.Environment
import com.olivermebberson.Saying
import com.olivermebberson.Favourite

class BootStrap {

    def init = { servletContext ->
		
		switch (Environment.current) {
			
			case Environment.DEVELOPMENT:
				
			 	// Sayings
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying. I\'m going to write something fairly lengthy in here because I want to make sure it all wrapes nicely.',
					status: 'published',
					roles: 'public',
					saidOn: new Date("2010/12/1")
				).save(failOnError: true);
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying number 2',
					status: 'published',
					roles: 'public',
					saidOn: new Date("2011/5/31")
				).save(failOnError: true);
			
				// Favourites
				new Favourite(
					title: 'Peppa Pig',
					rank: 10
				).save(failOnError: true);
				// Favourites
				new Favourite(
					title: 'Octonauts',
					rank: 6
				).save(failOnError: true);
			
			break;
			
		}
		
    }
    def destroy = {
    }
}
