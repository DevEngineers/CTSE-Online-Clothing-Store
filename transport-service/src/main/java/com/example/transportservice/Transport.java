package com.example.transportservice;


public class Transport {

	private long id;
	

	private String userid;
	

	private String name;
	
	
	private String address;
	
	
	private String city;
	
	
	private String postel_code;
	

	private String mobileNumber;

	public Transport(long id, String userid, String name, String address, String city, String postel_code,
			String mobileNumber) {
		super();
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postel_code = postel_code;
		this.mobileNumber = mobileNumber;
	}

	public Transport() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getuserid() {
		return userid;
	}

	public void setuserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getpostel_code() {
		return postel_code;
	}

	public void setpostel_code(String postel_code) {
		this.postel_code = postel_code;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}

