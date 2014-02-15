package com.sf.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sf.bean.Mybean;

@Controller
@RequestMapping( value="/hello" )
public class HelloControler {
@Autowired
	Mybean mb ;
	@RequestMapping( value="/{id}", method=RequestMethod.GET )
	public @ResponseBody Object reverseIdJson(@PathVariable String id) {        
	  

		
		
		Map m=new HashMap<String,String >();
		
		m.put("hello", "yes");
		System.out.println(mb.getName());
		
		return m;
	}
}