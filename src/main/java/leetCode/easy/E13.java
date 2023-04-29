package leetCode.easy;

public class E13 {

	public int romanToInt(String s) {
		int ans = 0, num, prev = 0;

	    for (int i = s.length() - 1; i >= 0; i--) {
	        num = charToInt(s.charAt(i));
	        if (num < prev) {
	            ans -= num;
	        } else {
	            ans += num;
	        }
	        prev = num;
	    }
	    return ans;
	}
	
	private int charToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		default :
			return 1000;
		}
	}

	public static void main(String[] args) {
		System.out.println( new E13().romanToInt("MCMXCIV"));
	}

}
