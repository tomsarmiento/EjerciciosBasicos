public class Exercise2 {
    public void printSum    (){
        int sum = 0;
        for(int i=0; i<=255; i++){
            sum = sum + i;
            System.out.println("Nuevo numero: "+i+", "+"Suma: "+sum);
        }
    }
}