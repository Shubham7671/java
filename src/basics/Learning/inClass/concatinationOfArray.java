package src.basics.Learning.inClass;

public class concatinationOfArray {
    public static void main(String[] args) {
        int []arr={5,14,13,8,12};
        int i=0;
        int j=arr.length-1;
        String bag="";
        int sum=0;
        while(i<j){
            bag+=arr[i] ;
            bag+=arr[j];
            sum+=Integer.parseInt(bag);
            i++;
            j--;
            bag="";

        }
        if(arr.length%2!=0){
            int mid=(0+ arr.length/2);
            System.out.println(sum+arr[mid]);
        }else{
            System.out.println(sum);
        }


    }
}
