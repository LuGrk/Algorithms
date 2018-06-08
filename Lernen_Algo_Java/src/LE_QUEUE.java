
import java.util.LinkedList;
import java.util.Queue;

public class LE_QUEUE {
	
	public static void main(String[] args){
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("A");
		q.offer("B");
		q.offer("c");		
		
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}
}