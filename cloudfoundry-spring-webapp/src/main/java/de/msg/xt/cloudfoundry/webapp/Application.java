package de.msg.xt.cloudfoundry.webapp;



import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {

	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World",HttpStatus.OK);
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
	
	
	
}
