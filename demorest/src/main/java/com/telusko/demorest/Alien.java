package com.telusko.demorest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import javax.json.stream.JsonParser;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

@XmlRootElement
public class Alien {
	
	private int cid;	
	private String cname;
	private String caddress1;
	private String caddress2;
	private String ctown;
	private String ccounty;
	private String ccountry;
	private String cpostcode;


public int getCid()
{
	return cid;
}
public void setCid(int id) {
	this.cid = id;
}
public String getCname() {
	return cname;
}
public void setCname(String name) {
	this.cname = name;
}
public String getCaddress1() {
	return caddress1;
}
public void setCaddress1(String address1) {
	this.caddress1 = address1;
}
public String getCaddress2() {
	return caddress2;
}
public void setCaddress2(String address2) {
	this.caddress2 = address2;
}
public String getCtown() {
	return ctown;
}
public void setCtown(String town) {
	this.ctown = town;
}
public String getCcounty() {
	return ccounty;
}
public void setCcounty(String county) {
	this.ccounty = county;
}
public String getCcountry() {
	return ccountry;
}
public void setCcountry(String country) {
	this.ccountry = country;
}
public String getCpostcode() {
	return cpostcode;
}
public void setCpostcode(String postcode) {
	this.cpostcode = postcode;
}



}
