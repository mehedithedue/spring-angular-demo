package com.example.demo.restcontroller;

import java.time.LocalDate;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.request.ReservationRequest;
import com.example.demo.model.response.ReservationResponse;

@RestController
public class ReservationResource {

	@RequestMapping(path = "room/reservation/v1", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResource > getAvailableRooms(
			@RequestParam(value = "checkin")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkin,
			@RequestParam(value = "checkout")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkout){
		
		return new ResponseEntity<>(new ReservationResource(), HttpStatus.OK);	
	}
	
	@RequestMapping(path="room/reservation/v1", method = RequestMethod.POST, produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> createReservation(@RequestBody ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
	}

	
	@RequestMapping(path="room/reservation/v1", method = RequestMethod.PUT, produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> updateReservation(@RequestBody ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
	}
	

	@RequestMapping(path="room/reservation/v1/{reservationId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteReservation(@PathVariable long reservationId){
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
