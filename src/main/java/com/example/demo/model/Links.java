package com.example.demo.model;

import org.hibernate.engine.spi.SelfDirtinessTracker;

public class Links {

	private Self self;

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}
}
