class BubbleSort{
    public static void main(String args[]){
        int arr[] = {21,34,2,4,1,56,32};

        for(int i=0; i< arr.length - 1 ; i++){
            for(int j=0; j< arr.length - 1 -i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array are : ");
        for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i] + ",");
        }

    }
}