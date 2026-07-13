public class armstrong {
    public static void main(String[] args) {
        int num = 153;
		int temp = num;
		int arm=0;
		while(temp>0) {
			int digit = temp%10;
			arm += digit *digit*digit;
			temp/=10;
		}
		System.out.println(num==arm? "Armstrong":"Not An Armstrong");
    }
}
