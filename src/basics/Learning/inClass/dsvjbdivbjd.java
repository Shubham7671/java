package src.basics.Learning.inClass;

public class dsvjbdivbjd {
    public static void main(String[] args) {
        int mat[][]={{1,2},{3,4}};
        int r=2;
        int c=2;
        int arr[][]=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        int arr1[]=new int[row*col];


        if(row*col==r*c) {


            int b = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr1[b] = mat[i][j];
                    b++;
                }
            }

//        for(int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
            int a = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = arr1[a];
                    a++;
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }else{

        }
    }
}
