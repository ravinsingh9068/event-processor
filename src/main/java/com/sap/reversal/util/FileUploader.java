package com.sap.reversal.util;

import java.io.File;

import javax.annotation.PostConstruct;

import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileUploader {

	@PostConstruct
	public void uploadDataFiles(){
		 JSONParser parser = new JSONParser();
	      try {
	    	  ObjectMapper objectMapper = new ObjectMapper();
	    	  ExampleClass example = objectMapper.readValue(new File("example.json"), ExampleClass.class);
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}

	
}
