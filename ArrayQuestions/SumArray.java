package Problem_Solving.ArrayQuestions;
// find the sum and average of an array
public class SumArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        // find average of the array
        double average=sum/arr.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
