public class MaximumSubArray {
	
	
	public static void main(String[] args){
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] ar1 = {1};
		int[] neL = {-2,-1,-3,-6};
		
		System.out.println(maxSubArr(arr));
		System.out.println(maxSubArr(ar1));
		System.out.println(maxSubArr(neL));
		
	}
	
	public static int maxSubArr(int[] arr){
		
		if(arr.length == 1)
			return arr[0];
		
		int max = arr[0];
		int maxSoFar = arr[0];
		
		for(int i=1; i<arr.length; i++){
			
			max = Integer.max(arr[i], arr[i]+max);
			
			maxSoFar = Integer.max(max, maxSoFar);
		}
		
		return maxSoFar;
		
	}
}