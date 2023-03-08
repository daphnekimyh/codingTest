import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int answer = 1;
		
		for(int i=1; i<=N; i++) {
			answer *= i;
		}
		System.out.println(answer);
	}
}
