package revisao;
import java.util.*;
public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		
		System.out.println("digite um numero");
		n=in.nextInt();
		
		if(n<0) {
			System.out.println("negativo");
		}else {
			System.out.println("positivo");
		}
		in.close();
	}

}
