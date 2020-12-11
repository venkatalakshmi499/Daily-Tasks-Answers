package com.src;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table( name="Customer1")
public class Customer {
	@Id
private int cid;
	@Column(name="custname")
private String cname;
	@Column(name="custaddress")
private String cadd;
private String emailid;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}