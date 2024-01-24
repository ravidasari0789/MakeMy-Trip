package com.makemytrip;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.makemytrip.binding.Tickect;
import com.makemytrip.service.MakeMyTripService;

@SpringBootApplication
public class MakeMyTripApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MakeMyTripApplication.class, args);
		
		/*
		 * MakeMyTripService bean = run.getBean(MakeMyTripService.class); List<Tickect>
		 * allTickest = bean.getAllTickest(); allTickest.forEach(System.out::println);
		 */
	}

}
