package src.basics.Learning;

public class checkPrime {
    static boolean checkNumberIsPrime(int num){
        int count=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num=17;
        System.out.println(checkNumberIsPrime(num));

    }
}
