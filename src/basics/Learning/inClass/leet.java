package src.basics.Learning.inClass;

public class leet {
    public static void main(String[] args) {
        int[] digits={9,9,9,9};
        String bag="";
        for(int i=0;i<digits.length;i++){
            bag+=digits[i];
        }
        int ans=Integer.parseInt(bag)+1;
        String str=Integer.toString(ans);
        int []arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }


    }
}
