import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] peice = {1, 1, 2, 2, 2, 8};
		int[] result = new int[peice.length];
		
		String[] a = br.readLine().split(" ");
		
		for(int i=0; i<peice.length; i++) {
			int confirm = Integer.parseInt(a[i]);
			result[i] = peice[i] - confirm;
			System.out.print(result[i] + " ");
		}
	}
}