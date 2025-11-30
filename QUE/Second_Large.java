package QUE;

public class Second_Large {
    public static void main(String[] args) {
        
        int arr[] ={10,43,23,11,5,45};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println("1st largest element: "+max);
        int sec_max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != max && arr[i]>sec_max){
                sec_max=arr[i];
            }
        }System.out.println("second largest element: "+sec_max);
    }

}
