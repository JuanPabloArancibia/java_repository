package emailapp;

public class arreglo {
    static int[] myArray = {13,2,4,35,1};

    public static void main (String args[]) {
        // Your code here
        int mayor = 0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] > mayor){
                mayor = myArray[i];
            }
        }
        System.out.println(mayor);
    }
}
