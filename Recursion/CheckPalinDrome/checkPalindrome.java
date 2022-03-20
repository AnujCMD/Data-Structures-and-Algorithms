
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        int start = 0;
        int end = input.length() -1;
		return checkPd(input, start, end);
	}
    public static boolean checkPd(String s,int  st, int ed){
        if(s.length() ==0 || s.length() ==1){
            return true;
        }
        if(s.charAt(st) != s.charAt(ed)){
            return false;
        }
        else if(st< ed){
            return checkPd(s, st+1, ed-1);
        }
        return true;
    }
}
