import java.util.*;
class Triplet{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        if(arr[i]>max1){
            max3=max2;
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i]>max2){
            max3=max2;
            max2=arr[i];
        }
        else if(arr[i]>max3){
            max3=arr[i];
        }
        if(arr[i]<min1){
            min2=min1;
            min1=arr[i];
        }
        else if(arr[i]<min2){
            min2=arr[i];
        }
        }
        int pro1=max1*max2*max3;
        int pro2=min1*min2*max1;
        if(pro1>pro2){
            System.out.println(max1+" "+max2+" "+max3);
        }
        else{
            System.out.println(max1+" "+min2+" "+min1);
        }
    }
}