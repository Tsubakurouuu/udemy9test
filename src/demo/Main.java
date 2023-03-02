package demo;

import service.NumberServiceImpl;

public class Main {

	public static void main(String[] args) {
		NumberServiceImpl service = new NumberServiceImpl();
		System.out.println(service.sumOf(3,5));
	}

}
