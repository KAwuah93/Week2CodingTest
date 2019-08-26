package Week2CodingTest;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class dupeArray {
	public static void main(String[] args) {
		//first test boyo
		int[][] test  = {
                {1, 3, 4, 4, 5}, 
                {12, 22, 31, 4, 5},
                {13, 23, 32, 4, 5},
                {14, 22, 3, 4, 5},
                {15, 21, 32, 4, 5}
              };
		//display function
		findDupe(test);
	}
	
	public static void findDupe(int[][] search){
		
		Map<Integer, ArrayList<int[]>> findingDupe = new Hashtable<>();
		
		//TODO Scan
		for(int i = 0; i < search.length; i++) {
			for(int k = 0; k < search[i].length; k++) {
				System.out.print(search[i][k] + " ");
				//check if it exists in the array list map
				if(findingDupe.containsKey(search[i][k])) {
					findingDupe.get(search[i][k]).add(new int[] {i,k});
				}else {
					findingDupe.put(search[i][k], new ArrayList<int[]>());
					findingDupe.get(search[i][k]).add(new int[] {i,k});
				}
				//if not then add
			}
			System.out.println(findingDupe.toString());
		}
		//finding and printing duplicates
		Set<Integer> keys = findingDupe.keySet();
		
		for(int key : keys) {
			if(findingDupe.get(key).size() > 1) {
				//iterate through and print
				for(int[] pair : findingDupe.get(key)) {
					System.out.println("Number " + key + " shows up " + pair[0] + "," + pair[1]);
				}
			}
		}
	}
}
