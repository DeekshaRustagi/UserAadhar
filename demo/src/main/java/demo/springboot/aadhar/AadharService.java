package demo.springboot.aadhar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class AadharService {
	
	@Autowired
	private AadharRepository aadharRepository;

public List<Aadhar> getAllAadhar() {
		
		//List<User> users = new ArrayList<>();
		
		return (List<Aadhar>) aadharRepository.findAll();
		
	}
	
	public Aadhar getAadharById(String aadharId) {
		return aadharRepository.findById(aadharId).get();
	}
	
	public boolean addAadhar(Aadhar aadhar) {
		if(aadhar != null) {
			aadharRepository.save(aadhar);
			return true;
		}
		return false;
	}
}
