package cn.com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.test.model.TestModel;
import cn.com.test.service.ITestService;

@Controller
@RequestMapping("test")
public class Test {
	@Autowired
	private ITestService testService;

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld(Model model) {
		TestModel testModel = testService.findOne(1);
		model.addAttribute("test", testModel.getTest_message());
		return "test";
	}

	@RequestMapping(value = "java/java", method = RequestMethod.GET)
	@ResponseBody
	public String js() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^asldfkjasldfkj^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		return "alert('test')";
	}
}
