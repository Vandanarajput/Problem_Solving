package Problem_Solving.ArrayQuestions;


// Problem 1: Find the minimum and maximum element in an array
public class Problem1 {
public static void main(String[] args) {
   int[] arr={1,22,3,48,5,6,7,8,9};
   int min=arr[0];
   int max=arr[0];
   for(int i=0;i<arr.length;i++){
       if(arr[i]<min){
              min=arr[i];
       }
       if(arr[i]>max){
        max=arr[i];
       }
   }
   System.out.println("Minimum element in the array is: "+min);
   System.out.println("Maximum element in the array is: "+max);

}
    
}