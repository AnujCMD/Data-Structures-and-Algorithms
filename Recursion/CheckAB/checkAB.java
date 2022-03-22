public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        
		return check(input);
        
	}
    public static boolean check(String s){
        String substr;
        if(s.length() == 1){
            if(s.charAt(0)== 'b'){
                return false;
            }
            else  return true;
        }
        if(s.length() ==0){
            return true;
        }
        if(s.charAt(0) == 'b'){
            return false;
        }
    	if (s.length() >= 3 && s.substring(0,3).equals("abb"))
        {
            return checkAB(s.substring(3));
        }
        else
        {
            return checkAB(s.substring(1));
        }
    }
}
