
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input%10 == input){
            if(input==0){
                return 1;
            }
            else return 0;
        }
    int ans = countZerosRec(input/10);
        int rec = (input%10==0) ? 1:0;
        return ans+rec;
	}
}
