package src.basics.Learning;

public class numberPalindrome {
    static boolean checkPalindrome(int n){
        int temp=n;
        int rev=0;
        while(n!=0){
            int last=n%10;

            rev=(rev*10)+last;
            n=n/10;
        }
if(temp==rev){
    return true;
}else{
    return false;
}
    }
    public static void main(String[] args) {
        int num=1211;
        System.out.println(checkPalindrome(num));
    }
}
