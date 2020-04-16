public class Main {

	public static void main(String[] args) {
		//Criando a lista e adicionando a palavra
		Lista list = new Lista();
		list.addOnEnd("a");
		list.addOnEnd("r");
		list.addOnEnd("a");
		list.addOnEnd("r");
		list.addOnEnd("a");
		//True se a palavra for palindrome
		System.out.println(Palindrome.isPalindrome(list));
		System.out.println("********************");
		Lista list2 = new Lista();
		list2.addOnEnd("B");
		list2.addOnEnd("O");
		list2.addOnEnd("o");
		list2.addOnEnd("b");
		System.out.println(Palindrome.isPalindrome(list2));
		System.out.println("********************");
		Lista list3 = new Lista();
		list3.addOnEnd("b");
		list3.addOnEnd("i");
		list3.addOnEnd("r");
		list3.addOnEnd("d");
		System.out.println(Palindrome.isPalindrome(list3));
		
	}
}
