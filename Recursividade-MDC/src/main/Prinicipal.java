package main;

import controller.MDCController;

public class Prinicipal {
	
	public static void main(String args[]) {
		MDCController mdc = new MDCController();
		int n = mdc.MDC(10, 6);
		System.out.println(n);
	}
	
}
