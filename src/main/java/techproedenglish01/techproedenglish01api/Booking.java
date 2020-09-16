package techproedenglish01.techproedenglish01api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

		/*
		 POJO Classes have 1)private variables 2)getter() and setter() 3)Constructor with all parameters
					       4)Constructor without parameter 5)toString()  
		 */

public class Booking {
	
	@SerializedName("firstname")
	@Expose
	private String firstname;
	@SerializedName("lastname")
	@Expose
	private String lastname;
	@SerializedName("totalprice")
	@Expose
	private Integer totalprice;
	@SerializedName("depositpaid")
	@Expose
	private Boolean depositpaid;
	@SerializedName("bookingdates")
	@Expose
	private Bookingdates bookingdates;
	@SerializedName("additionalneeds")
	@Expose
	private String additionalneeds;
	
	public String getFirstname() {
	return firstname;
	}
	public void setFirstname(String firstname) {
	this.firstname = firstname;
	}
	public String getLastname() {
	return lastname;
	}
	public void setLastname(String lastname) {
	this.lastname = lastname;
	}
	public Integer getTotalprice() {
	return totalprice;
	}
	public void setTotalprice(Integer totalprice) {
	this.totalprice = totalprice;
	}
	public Boolean getDepositpaid() {
	return depositpaid;
	}
	public void setDepositpaid(Boolean depositpaid) {
	this.depositpaid = depositpaid;
	}
	public Bookingdates getBookingdates() {
	return bookingdates;
	}
	public void setBookingdates(Bookingdates bookingdates) {
	this.bookingdates = bookingdates;
	}
	public String getAdditionalneeds() {
	return additionalneeds;
	}
	public void setAdditionalneeds(String additionalneeds) {
	this.additionalneeds = additionalneeds;
	}
	public Booking(String firstname, String lastname, Integer totalprice, Boolean depositpaid,
			Bookingdates bookingdates, String additionalneeds) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.bookingdates = bookingdates;
		this.additionalneeds = additionalneeds;
	}
	public Booking() {

	}
	@Override
	public String toString() {
		return "Booking [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
				+ ", depositpaid=" + depositpaid + ", bookingdates=" + bookingdates + ", additionalneeds="
				+ additionalneeds + "]";
	}

}
