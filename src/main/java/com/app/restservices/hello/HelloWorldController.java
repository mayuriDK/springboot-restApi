package com.app.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// url- /helloworld

	// 1.type @RequestMapping(method= RequestMethod.GET, path="/helloworld")
	// 2.type
	
	  @GetMapping("/helloworld") 
	  public String HelloWorld() { return "Hello World";
	  
	  }
	 
	@GetMapping("/helloworld-user")
	public UserDetails helloWorldUserDetails() {
		return new UserDetails("Mayuri","Kate","Pune");
		
	}
	
	

}
