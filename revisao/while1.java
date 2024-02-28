package revisao;
import java.util.*;
public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		Scanner in = new Scanner(System.in);
		while(n!=2002) {
			
			System.out.println("digite a senha");
			n=in.nextInt();
			
			if(n == 2002) {
				System.out.println("senha correta");
				}
			else {
					System.out.println("senha incorreta");
					System.out.println(" ");
				}
			
		}
		in.close();
	}

}
