package algoritma;

public class Main {

	public static void main(String[] args) {
		String strl = "sevdiğim o güzel kız ";
		int number ;
		number =strl.length();
		String aa;
		aa = strl.substring(1,14);
		strl = strl.replace("i","+");
		System.out.println("string : " + strl  );
		System.out.println("string uzunluğu : " + number);
		System.out.println("aa : "+ aa);
			

	}

}
