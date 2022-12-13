package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("SC up");
	}

	public void down() {
		System.out.println("SC down");
	}

	public void left() {
		System.out.println("SC fire");
	}

	public void right() {
		System.out.println("SC run");
	}

}
