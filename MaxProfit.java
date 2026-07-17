public class MaxProfit {

public static void main(String[] args){

}

public static int maxProfit(int[] arr){

if(arr.length < 1)
	return -1;

int min = arr[0];
int diff = 0;

for(i=1; i<arr.length; i++){

diff = Integer.max(diff, arr[i]-min);

min = Integer.min(min, arr[i]);

}

return diff;

}

}