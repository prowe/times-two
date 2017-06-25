package com.sourceallies.timestwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimesTwoController {

	@RequestMapping(
		path="/", 
		method=RequestMethod.POST)
	public @ResponseBody int DoCalculation(@RequestBody String input) {
		return 0;
	}
}
