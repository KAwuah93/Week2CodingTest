package Week2CodingTest;

public class substring {
	public static void main(String[] args) {
		String test = "frog";
		String test2 = "totally";
		String test3 = "Sesquipedalophobia";
		
		subString(test, test.length(),0);
		subString(test2,test2.length(),0);
		subString(test3,test3.length(),0);
	}


	public static void subString(String check, int cluster,int top) {
		cluster -= 1;
		String head = "";
		String body = "";
		if(cluster ==0) return;
		if(top < check.length()) {
		for(int i = top; (i + cluster-1) < check.length(); i++ ) {
			head = ""+check.charAt(i);
			//second counter
			for(int k = i+1; (k+cluster-1) < check.length(); k++) {
				body = check.substring(k, k+cluster);
				System.out.println(head+body);
			}			
		}
		subString(check, cluster, top);
		}
		
	}
}
