package Day1;

public class SecondLargestSolution {
    public static int getSecondLargest(int[] arr) {
        int largest =-1;
        int secondLargest = -1;
        for(int i:arr){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest=i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int res = getSecondLargest(arr);
        if(res==-1){
            System.out.print("Second largest not found in an Array");
        }else{
            System.out.println("Second largset is :"+res);
        }
    }
}
