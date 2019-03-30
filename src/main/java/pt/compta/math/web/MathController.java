package pt.compta.math.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //a class MathController vai ser vista como um entry point para um request da Web, also know as controller. Onde os metodos que tiverem a anotação @RequestMapping serao 'mappeados' aos request HTTP provinientes do cliente
public class MathController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET) //annotation that marks the method below to be mapped and executed when an HTTP GET request to “/” is received
	public String returnString(@RequestParam("who") String someName) {
		return "Hello " + someName;
	}

}
