
public class Palindrome {

	public static boolean isPalindrome(Lista list) {
		String word = "";
		for (int i = 0; i < list.length(); i++) {
			word = word.concat((String) list.get(i));
		}
		word = word.toLowerCase();
		int forward = 0;
		int backward = list.length() - 1;
		while (backward > forward) {
			char forwardChar = word.charAt(forward++);
			char backwardChar = word.charAt(backward--);
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}

}
