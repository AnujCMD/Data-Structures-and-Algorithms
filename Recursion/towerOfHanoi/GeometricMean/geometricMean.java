
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0){
            return 1;
        }
        double ans = findGeometricSum(k-1) + 1/(Math.pow(2,k));
    	return ans;
	}
}
