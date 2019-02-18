package demo.springboot.aadhar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AadharController {
	
	@Autowired
	private AadharService aadharService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/aadhar")
	public List<Aadhar> getAllAadhar() {
		return aadharService.getAllAadhar();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/aadhar/{id}")
	public Aadhar getAadhar(@PathVariable String id) {
		return aadharService.getAadharById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/aadhar")
	public String getAadhar(@RequestBody Aadhar aadhar) {
		boolean isAadharAdded = aadharService.addAadhar(aadhar);
		return isAadharAdded ? "Added Successfully" : "Not Added Usefully";
	}

}
