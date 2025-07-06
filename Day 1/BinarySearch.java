class BinarySearch{
    public static void main(String args[]){
        int arr[] = {1,2,34,54,67,77,88,102,213};
        int num=100;
        int i = 0;
        int j=arr.length - 1;
        boolean isFound=false;

        while(j>=i){
            int mid = (i+j)/2;
            if(arr[mid] == num){
                System.out.println("Item found a index " + mid);
                isFound=true;
                break;
            }else if(arr[mid] >  num){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }

        if(isFound == false){
            System.out.println("Item not found");
        }

    }
}