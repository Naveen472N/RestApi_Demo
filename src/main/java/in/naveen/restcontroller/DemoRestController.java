package in.naveen.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	@GetMapping("/welcome")
	public String GetMsg() {
		String msg = "Welcome to Rest Api";
		return msg;
	}
	
	@GetMapping("/action")
	public ResponseEntity<String> getmessage(){
		String msg = "Good Evening";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet")
	public ResponseEntity<String> greetmsg() {
		System.out.println(DemoRestController.class.getName());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
