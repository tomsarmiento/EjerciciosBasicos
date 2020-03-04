public class Exercise7 {
    public void oddArr (int[] arr, int y){
        int sum = 0;
        for(int item : arr){
            if(item > y){
                sum = sum + 1;
            }                
        }
        System.out.println(sum);
    }
}