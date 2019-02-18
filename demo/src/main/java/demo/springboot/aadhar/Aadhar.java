package demo.springboot.aadhar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {

	@Id
	private String aadharId;
	private String address;
	private int phone;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public Aadhar(String address, int phone, String aadharId) {
		super();
		this.address = address;
		this.phone = phone;
		this.aadharId = aadharId;
	}
	
	public Aadhar()
	{
		
	}
}
