package com.example.demo.model.response;

import org.w3c.dom.stylesheets.LinkStyle;

import com.example.demo.model.Links;

public class ReservationResponse {

	private Long id;
	private Integer roomNumber;
	private Integer price;
	private Links links;
	
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public ReservationResponse() {

	}
	public ReservationResponse(Integer roomNumber, Integer price) {
		this.roomNumber = roomNumber;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
