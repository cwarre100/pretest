package prob2;
import java.lang.Str

public class Prob2 {

	public static void main(String[] args) {
		

	}
	
	public static int countVowelSequences(String str) {
		int strLen = str.length();
		
		char prevChar;
		boolean prevCharIsVowel;
		
		int vowelCount = 0;
		for (int i = 0; i < strLen - 1; i++) {
			if (!prevChar) {
				prevChar = str[i];
				prevCharIsVowel = checkVowel(prevChar);
				continue;
			}
			
			if (!prevCharIsVowel) {
				prevChar = str[i];
				prevCharIsVowel = checkVowel(prevChar);
				continue;
			}
			
			if (checkVowel(str[i])) {
				vowelCount++;
				prevChar = str[i];
				prevCharIsVowel = checkVowel(prevChar);
				continue;
			}
			
		}
	}
	
	private static boolean checkVowel(char c) {
		if (c,toLower() == "a" || c.toLower() = "e" || c.toLower() = "i" || c.toLower() = "o" || c.toLower() = "u") {
			return true;
		}
		return false;
	}
	
	

}
