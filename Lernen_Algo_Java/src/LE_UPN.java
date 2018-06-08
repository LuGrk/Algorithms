import java.util.Stack;
import java.math.*;

public class LE_UPN {
	public static void main(String[] args) {
		
		
		Stack st = new Stack();
		
		st.push(12);
		st.push(13);
		st.push("/");
		
		String operand = (String) st.pop();

		if(operand =="+"){
				
				st.push((int)st.pop() + (int)st.pop());
				
			}else if(operand=="-"){

				st.push((int)st.pop() - (int)st.pop());

			}else if(operand=="*"){
				st.push((int)st.pop() * (int)st.pop());

			}else if(operand=="/"){
				st.push((int)st.pop() / (int)st.pop());

		}
	
		System.out.println(st.push(st));
		
	}
}
