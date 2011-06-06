import grails.util.Environment
import com.olivermebberson.Saying

class BootStrap {

    def init = { servletContext ->
		
		switch (Environment.current) {
			
			case Environment.DEVELOPMENT:
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying. I\'m going to write something fairly lengthy in here because I want to make sure it all wrapes nicely.',
					status: 'published',
					roles: 'public',
					saidOn: new Date("2010/12/1")
				).save(true);
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying number 2',
					status: 'published',
					roles: 'public',
					saidOn: new Date("2011/5/31")
				).save(true);
			break;
			
		}
		
    }
    def destroy = {
    }
}
