package de.msg.xt.cloudfoundry.webapp;



import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.msg.xt.cloudfoundry.webapp.domain.product.Product;
import de.msg.xt.cloudfoundry.webapp.domain.product.ProductRepository;

@RestController
@RequestMapping("/products")
public class Application {

	@Value("${version}")
	private String message;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@RequestMapping(value="/version", method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void create() {
		productRepository.save(new Product("Moritz" + new Random().nextInt()));
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Iterable<Product>> getAll() {		
		return new ResponseEntity<Iterable<Product>>(productRepository.findAll(), HttpStatus.OK);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
	
	
	
}
