package com.cg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class RestAppController {
	@RequestMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		String result="Welcome "+name;
		return result;
	}
	
	@RequestMapping("/data/{id}")
	public Data getData(@PathVariable("id") int id) {
		List<String> values=new ArrayList<String>();
		values.add("Spring");
		values.add("Java");
		values.add("Csharp");
		return new Data(id,values.get(id));
	}

}
