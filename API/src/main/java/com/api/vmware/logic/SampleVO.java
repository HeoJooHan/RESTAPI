package com.api.vmware.logic;

public class SampleVO {
	
	private String FirstName;
	private String LastName;
	private int no;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "SampleVO [FirstName=" + FirstName + ", LastName=" + LastName + ", no=" + no + "]";
	}
	
	
}
