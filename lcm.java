public class lcm {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = a;
        int y = b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int lcm = (x*y)/a;
        System.out.println(lcm);
    }
}
