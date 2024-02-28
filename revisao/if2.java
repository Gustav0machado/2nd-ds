package revisao;
import java.util.*;
public class if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		
		System.out.println("digite um numero");
		n=in.nextInt();
		
		if(n%2==0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		in.close();
	}

}
