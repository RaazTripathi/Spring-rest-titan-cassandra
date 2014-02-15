package com.sf.bean;

import org.springframework.stereotype.Component;


@Component
public class Mybean 
{
String name ="ram";
String desig="eng";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
}
