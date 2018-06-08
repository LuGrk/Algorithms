
public class LE_Hash {

	public static int wert (char letter){
		int value = 0;
		
		
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i = 0;i<alpha.length;i++){
			if(alpha[i]==letter){
				value = i+1;
			}			
		}
		return value;
	}
		
	public static int horner(int[] wordArr,int base, int mod){
		
		int value = 0;
		
		for(int i = 0; i < wordArr.length;i++){
			
			value = value * base;
			
			value = value + wordArr[i];
			
			value = value % mod;
		}
		
		return value;
	}
	
	public static void main(String args[]){
		
		String word = "algorithmus";
		int base = 30;
		int mod = 97;
		
		
		word = word.toLowerCase();
		
		int [] wordArr = new int [word.length()];
		
		for(int i = 0; i < word.length();i++){
			
			char letter = word.charAt(i);
			
			wordArr[i] = wert(letter);
			
		}
		System.out.println(horner(wordArr,base,mod));
	}

	
}


