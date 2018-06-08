import java.util.Arrays;

public class LE_InsertionSort {

		public static int [] inSort(int [] sort){
			
			int temp = 0;
			int j = 0;
			
			for(int i=0;i<sort.length;i++){
				j=i;
				
				while((j>0)&&(sort[j-1]>sort[j])){
					temp = sort[j-1];
					sort[j-1] = sort[j];
					sort[j] = temp;
					j--;
				}
			}
			return sort;
		}

		public static void main (String[]args){
			int[] sorted={5,7,4,6,9,1,2};
			
			
			
			sorted = inSort(sorted);
			
			for(int i=0;i<sorted.length;i++){
				
				System.out.println(sorted[i]);
				
			}
			
			
		}

}


