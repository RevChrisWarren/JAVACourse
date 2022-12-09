package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		// Get Lock for I
		lockForI.lock();
		i++;
		lockForI.unlock();

		// Release Lock for I
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		// GetLock for J
		lockForJ.lock();
		j++;
		lockForJ.unlock();
		// Release Lock for J
	}

	public int getJ() {
		return j;
	}

}
