package Week2CodingTest;

class sortingArray {
    public static void main(String[] args) {
    	int[] y = {2,8,9,3,4,3,2,6,6,2,4,9,8};
    	
    	quickSort(y, 0, y.length-1);
    	System.out.println(y);
    	
    	//print out result of the modified array
    	for(int i = 0; i < y.length; i++) {
    		System.out.println(y[i]);
    	}
    }

    //TODO sauce
    static int partition(int[] arr, int start, int end) {
        
    	int pivot = end;
        int counter = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int t = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = t;

        return counter;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start)
            return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
}