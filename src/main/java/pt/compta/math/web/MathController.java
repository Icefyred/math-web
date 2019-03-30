package pt.compta.math.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.compta.tools.fourthmaven.MathUtils;

@RestController
public class MathController {

	@RequestMapping(value = "/math/sum", method = RequestMethod.GET)
	public String calculateSum(@RequestParam("val1") String firstNumberValue,
			@RequestParam("val2") String secondNumberValue) {

		String resultFromOperation = "";

		resultFromOperation += MathUtils.sumOfTwoNumbers(Integer.parseInt(firstNumberValue),
				Integer.parseInt(secondNumberValue));
		return "Result:  " + resultFromOperation;
	}

	@RequestMapping(value = "/math/subtract", method = RequestMethod.GET)
	public String calculateSubtract(@RequestParam("val1") String firstNumberValue,
			@RequestParam("val2") String secondNumberValue) {

		String resultFromOperation = "";

		resultFromOperation += MathUtils.subtractOfTwoNumbers(Integer.parseInt(firstNumberValue),
				Integer.parseInt(secondNumberValue));

		return "Result:  " + resultFromOperation;
	}

}
