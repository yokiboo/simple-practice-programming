package com.dailyPractice;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 8, 6, 9, 7 };

		int target = 5;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i != j && arr[i] + arr[j] == target) {

					System.out.println("pair :" + i + "," + j);
				}

			}

		}
		
		twoSum(arr,target);

	}
	
public static void twoSum(int[] arr, int tar) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(arr[0],0);
		
		for(int i=1; i<arr.length; i++) {
			
			
			if(arr[map.getOrDefault(tar - arr[i], 0)] + arr[i] == tar){
				System.out.println("pair :" + i + "," + map.get(tar-arr[i]));
				break;
			}
			
			map.put(arr[i],i);
		}
		
	}
}
