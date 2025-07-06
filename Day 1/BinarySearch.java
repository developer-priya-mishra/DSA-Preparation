class BinarySearch{
    public static void main(String args[]){
        int arr[] = {12,32,33,43,2,4,1,65,790,43,5,6,3,0};
        int num = 100;
        boolean isFound=false;

        for(int i=0; i < arr.length ; i++){
            if(arr[i] == num){
                System.out.println("Number found at index "+i);
                isFound = true;
                break;
            }
        }

        if(isFound == false){
            System.out.println("Number not found ");
        }

    }
}