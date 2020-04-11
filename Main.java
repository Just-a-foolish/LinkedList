import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lista list = new Lista();
		
		System.out.println("Informe a palavra:");
		String word = in.nextLine();
		list.readWord(word);
		Node n = new Node("a");
	}
}
