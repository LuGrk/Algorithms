public class LE_Sort {

	public static int [] sort(int[]unsorted){
		for(int j = 0;j<unsorted.length;j++){
			
			for(int i=1;i<unsorted.length;i++){
				
				if(unsorted[i-1]>unsorted[i]){
					int help = 0;
					help = unsorted[i-1];
					unsorted[i-1] = unsorted[i];
					unsorted[i] = help;
				}
			}
		}
		return unsorted;
	}
	
	public static void main(String []args){
		
		int [] test = {5,3,1,4,2};
		int[] result = new int [test.length];
		
		result = sort(test);
		
		
		for(int i = 0; i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	
}
