package org.dark;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//令當前類自身成為一個controller
@RestController
public class SourceApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SourceApp.class).web(true).run(args);
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return "hello" + name;
	}
}
