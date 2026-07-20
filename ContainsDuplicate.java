
import java.util.Map;
import java.util.HashMap;

public class ContainsDuplicate{

public static void main(String[] args){

boolean result = false;

int[] arr = {1,2,3,1};
Map<Integer,Boolean> map = new HashMap<>();
for (int i : arr){

boolean val = map.getOrDefault(i, false);
if(val)
	result = true;
	
map.put(i,true);

}

System.out.print(result);

}

}