package pt.compta.math.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.compta.tools.fourthmaven.MathUtils;


@RestController
public class MathController {

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String returnString(@RequestParam("op") String someName, @RequestParam("val1") String secondName, @RequestParam("val2") String thirdName) {
		return "Result:  " + MathUtils.sumOfTwoNumbers(Integer.parseInt(secondName), Integer.parseInt(thirdName));
	}

}
