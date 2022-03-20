
public class solution {
	public static int noOfDigit(int n){
        if(n%10==n){
            return 1;
        }
        return noOfDigit(n/10) + 1;
    }
	public static int sumOfDigits(int input){
		// Write your code here
		int digits = noOfDigit(input);
        //System.out.println(digits);
        //return digits;
        if(digits == 1){
            return input;
        }
        return sumOfDigits(input/10) + input%10;
	}
}
