package src.basics.Learning;

public class numberPalindrome {
    static int checkPalindrome(int n){
        int rev=0;
        while(n!=0){
            int last=n%10;

            rev=(rev*10)+last;
            n=n/10;
        }
return rev;
    }
    public static void main(String[] args) {
        int num=12145;
        System.out.println(checkPalindrome(num));
    }
}
