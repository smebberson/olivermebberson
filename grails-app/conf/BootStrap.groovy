import grails.util.Environment
import com.olivermebberson.Saying

class BootStrap {

    def init = { servletContext ->
		
		switch (Environment.current) {
			
			case Environment.DEVELOPMENT:
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying',
					status: 'published',
					roles: 'public',
					saidOn: new Date("1/1/2010")
				).save(true);
				new Saying(
					title: 'Published and public',
					description: 'This is the description for the saying number 2',
					status: 'published',
					roles: 'public',
					saidOn: new Date("1/1/2011")
				).save(true);
			break;
			
		}
		
    }
    def destroy = {
    }
}
