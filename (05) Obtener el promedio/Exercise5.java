public class Exercise5 {
    public void avg (double[] arr){
        double sum = 0;
        for(double it : arr){
            sum = sum + it;
        }
        System.out.println("Average is: "+(sum/arr.length));
    }
}