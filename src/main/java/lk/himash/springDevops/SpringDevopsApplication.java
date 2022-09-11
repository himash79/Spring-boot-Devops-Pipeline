package lk.himash.springDevops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDevopsApplication {

	private final Logger log = LoggerFactory.getLogger(SpringDevopsApplication.class);

	@GetMapping("/getMessage")
	public String getMessage() {
		log.info("Application Execute Successfully...!");
		return "Respone Message Getting Successfully.....!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevopsApplication.class, args);
	}

}
