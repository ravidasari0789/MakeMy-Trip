package com.makemytrip.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.makemytrip.binding.Passanger;
import com.makemytrip.binding.Tickect;

@Service
public class MakeMyTripService {

	
	       public List<Tickect> getAllTickest(){
	    	   
	    	   String url="http://localhost:8787/tockets";
	    	   
	    	   RestTemplate rt=new RestTemplate();
	    	   
	    	   ResponseEntity<Tickect[]> forEntity = rt.getForEntity(url, Tickect[].class);
	    	   Tickect[] body = forEntity.getBody();
	    	   List<Tickect> asList = Arrays.asList(body);
			return asList;
	       }
	       
	       public Tickect bookMyTickect(Passanger p) {
				String url = "http://localhost:8787/ticket";
				RestTemplate rt = new RestTemplate();
				ResponseEntity<Tickect> postForEntity = rt.postForEntity(url, p, Tickect.class);
				Tickect body = postForEntity.getBody();
				return body;
	       }
}
