public class ArrayProduct{

public static void main(String[] args){

int[] arr = {1,2,3,4};

int[] result = product(arr);

for (int a: result){
System.out.println(a);
}; 


}

public static int[] product(int[] arr){

len = arr.length;
if(len<2)
	return arr;

int[] fl = new int[len];
int[] bl = new int[len];

fl[0] = 1;
bl[len-1] = 1;

fp = arr[0];
bp = arr[len-1];

for(int i=1; i<len; i++){
fl[i] = fp;

fp = fp * arr[i];

}

for(int j=len-2; j>-1; j--){

bl[j] = bp;

bp = bp * arr[j]; 

}

int[] result = new int[len];

for(int i=0; i<len; i++){
result[i] = fl[i] * bl[i];
}

return result;
}

}