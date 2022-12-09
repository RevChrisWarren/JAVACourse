package com.in28minutes.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";

		for (char character : str.toCharArray()) {

			occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();
//			LongAdder longAdder = occurrences.get(character);
//			if (longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occurrences.put(character, longAdder);
		}
		System.out.println(occurrences);
	}

}
