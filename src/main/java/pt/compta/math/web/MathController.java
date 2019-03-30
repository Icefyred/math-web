package pt.compta.math.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.compta.tools.fourthmaven.MathUtils;


@RestController
public class MathController {

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String calculate(@RequestParam("op") String typeOfOperator, @RequestParam("val1") String firstNumberValue, @RequestParam("val2") String secondNumberValue) {
		
		String resultFromOperation = "";
		
		if(typeOfOperator.equals("subtract")) {
			resultFromOperation += MathUtils.subtractOfTwoNumbers(Integer.parseInt(firstNumberValue), Integer.parseInt(secondNumberValue));
		}
		else if(typeOfOperator.equals("sum")) {
			resultFromOperation += MathUtils.sumOfTwoNumbers(Integer.parseInt(firstNumberValue), Integer.parseInt(secondNumberValue));
		}
		return "Result:  " + resultFromOperation;
	}

}
