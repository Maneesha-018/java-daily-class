public class reverse {
    public static void main(String[] args) {
        // int a = 12345;
        // int sum = 0;
        // for(int i=1; i<=a;i++){
        //     int d = a%10;
        //     sum = sum*10+d;
        //     a = a/10;
        //     i=i-1;
        // }
        // System.out.println(sum);
        // int n =5;
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        int n = 12345;
        int r = 0;
        while (n!=0){
            int d = n%10;
            r = r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }
    
    
}
