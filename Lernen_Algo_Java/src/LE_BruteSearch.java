
public class LE_BruteSearch {
	
	public static void bruteSearch(String text, String word){
		for(int i = 0;i<text.length();i++){
			
			for(int j = 0; j<word.length();j++){
				if(text.charAt(i) == word.charAt(j)){
					System.out.println(text.charAt(i)+";"+word.charAt(j)+" ->Richtig!");
					i++;
				}else{

					System.out.println(text.charAt(i)+";"+word.charAt(j)+" ->Falsch!");
					break;
				}
			}
		}
	}

	public static void main(String []args){
		
		String text = "gegen gehen die gegend";
		String word = "gegend";
		
		bruteSearch(text,word);

	}
	
	

}
