package service;

public class NumberServiceImpl implements NumberSerivce {

	@Override
	public int sumOf(int x, int y) {
		int sum = 0;
		do {
			sum += x;
			x++;
		} while(y >= x);
		
		return sum;
	}

}
