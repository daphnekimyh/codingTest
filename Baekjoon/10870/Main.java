import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if(N == 0) {
			System.out.println(0);
			return;
		}
		
		int[] arr = new int[N+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=N; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		System.out.println(arr[N]);
	}
}