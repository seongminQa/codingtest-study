import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] word = br.readLine().split("");
		boolean check = true;
		
		for(int i=0; i<word.length; i++) {
			if(!word[i].equals(word[(word.length-1)-i])) {
				check = false;
			}
		}
		
		if(check) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}