class LargestElementArray{
    public static void main(String args[]){
        int arr[]= {2,32,13,24,12,3,1,5,4};
        int largestElement=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }

        System.out.print("Largest element of array is " + largestElement);
    }
}