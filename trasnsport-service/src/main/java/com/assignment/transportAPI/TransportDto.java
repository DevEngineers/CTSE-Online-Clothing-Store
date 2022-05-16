package com.assignment.transportAPI;



public class TransportDto {

	private long id;
	private String userid;
	private String name;
	private String address;
	private String city;
	private String postel_code;
	private String mobile_number;

	public TransportDto(long id, String userid, String name, String address, String city, String postel_code,
			String mobile_number) {
		super();
		this.id= id;
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postel_code = postel_code;
		this.mobile_number = mobile_number;
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

	public String getmobile_number() {
		return mobile_number;
	}

	public void setmobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	
}
