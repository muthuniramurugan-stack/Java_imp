import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isprime = true;
		if(num<=1) {
			isprime=false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		}
		System.out.println(isprime? "Prime":"Not A PrimeNumber");
    }
}
