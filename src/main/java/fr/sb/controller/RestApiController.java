package fr.sb.controller;

import fr.sb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class RestApiController {

	private static final Logger logger = Logger.getLogger(RestApiController.class.getName());

	@Autowired
	MyService myService;

	@RequestMapping("/")
	String home() {
		logger.info("rest /");
		return myService.sayHello();
	}




}
