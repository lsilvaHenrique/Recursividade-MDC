package controller;

public class MDCController {
	
	public int MDC (int a, int b) {
		if (b == 0) {
			return a;
		}
		return MDC(b, a % b);
	}
}
