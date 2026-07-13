 

class main{

public static void main(String[] args){

int[] arr = {9,3,6,7,10,8};

quickSort(0,arr.length-1,arr);

for(int i : arr){
System.out.println(i);
}

}

public static void quickSort(int l, int h, arr){

if (l < h){
	
	int par = partition(l, h, arr);
	
	quickSort(l,par-1,arr);
	quickSort(par+1,h,arr);
	
	}

}

public static int partition(int l, int h, int[] arr){

int par = arr[h];
int j=l;

for(int i=l; i<h; i++){
if(arr[i] <  par){
swap(i,j,arr);
j++;
}
}

swap(j,h,arr);

}

public void swap(int a, int b, int[] arr){

int temp = arr[a];
arr[a] = arr[b];
arr[b] = temp;
}

}