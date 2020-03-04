public class Exercise4 {
    public void maxNum (int[] arr){
        int val = arr[0];
        for(int it : arr){
            if(it > val){
                val = it;
            }
        }
        System.out.println("highest number: "+val);
    }
}