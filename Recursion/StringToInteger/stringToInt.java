
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		int b = 0;
        if(input.length() ==1){
            b = input.charAt(0) -48;
            return b;
        }
        int a = input.charAt(0) -48;
        int power = input.length() -1;
        int res = (int)(a * Math.pow(10, input.length()-1)) +convertStringToInt(input.substring(1));
        return res;
	}
}
