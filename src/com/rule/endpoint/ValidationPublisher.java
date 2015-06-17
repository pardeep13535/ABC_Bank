package com.rule.endpoint;
 
import javax.xml.ws.Endpoint;

import com.rule.front.ValidationImpl;

 
//Endpoint publisher
public class ValidationPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new ValidationImpl());
    }
 
}