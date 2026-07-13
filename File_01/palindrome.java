public class palindrome {
    public static void main(String[] args) {
        int num =2222;
		int temp=num,rev =0;
		while(temp>0) {
			int digit = temp%10;
			rev=rev*10+digit;
			temp/=10;
		}
		System.out.println(num==rev? "Palindrome":"Not a Palindrome");
    }
}
