package MainPackage;

/*
 * Ben Bovi, PS2
 * 
 * In order to save time and effort, I called methods within methods so
 * I wouldn't have to write what was pretty much the same method over 
 * and over. It might make the code look a bit more confusing, it does 
 * to me at least at quick glance, but it was much easier to write.
 * Ex: in isOdd() i just did "if (!isEven()) ..."
 * ... and within isPrime() i called isPrime(int) and used this.value as the parameter... 
 */

public class MyInteger {
	private int value;
	
	MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return (this.value);
	}

	public boolean isEven() {
		return(this.value%2==0);
	}
	
	//Just decided to call isEven to make it simpler to write
	public boolean isOdd(){
		return(!isEven());
	}
	
	//Again, this method calls static method isPrime to save time writing same thing out. 
	public boolean isPrime(){
		return(isPrime(this.value));
	}
	
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return (true);
		} 
		else {
			return (false);
		}
	}
	
	public static boolean isOdd(int num){
		return(!isEven(num));
	}
	
	//the sqrt+1 makes the code faster with larger numbers since
	//the LCD is always less than a number's square root, or is the square root, hence the +1
	public static boolean isPrime(int num){
		if (num<1){
			return(false);
		}
		else if (num==2){
			return(true);
		}
		for (int i = 2;i<(Math.sqrt(num)+1);i++){
			if (num%i == 0){
				return(false);
			}
		}
		return(true);
	}
	
	public static boolean isEven(MyInteger num){
		return(isEven(num.value));
	}
	
	public static boolean isOdd(MyInteger num){
		return(!isEven(num.value));
	}
	
	public static boolean isPrime(MyInteger num){
		return(isPrime(num.value));
	}
	
	public boolean equals(int num){
		if (num == this.value){
			return(true);
		}
		else{
			return(false);
		}
	}
	
	public boolean equals(MyInteger num){
		return(equals(num.value));
	}
	
	public static int parseInt(char[] alpha){
		String number = "";
		for (char a : alpha){
			number+=a;
		}
		int num = parseInt(number);
		return(num);
	}
	
	//I hope this is OK, unless you wanted me to write my own method?
	public static int parseInt(String alpha){
		return(Integer.parseInt(alpha));
	}
	
}
