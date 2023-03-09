package main;

import controller.IDthread;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			IDthread idthread = new IDthread();
			idthread.start();
		}

	}
}
