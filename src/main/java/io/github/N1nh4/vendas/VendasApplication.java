package io.github.N1nh4.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	@GetMapping("/hello/{name}")
	public String helloWord( @PathVariable String name) {
		return "Hello " + name + "!";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
