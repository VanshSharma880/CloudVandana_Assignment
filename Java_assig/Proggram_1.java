//1) Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

import java.util.Random;

public class Proggram_1 {
    public static void main(String[] args) 
    {
       int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array);

        for(int i=0; i<array.length; i++) {
           System.out.print(array[i]+" ");
            
            }
            
    }

    
    public static void shuffleArray(int[] array) 
    {
        int n = array.length;
        Random r = new Random();
        
        for (int i = n - 1; i > 0; i--) {
           int j = r.nextInt(i + 1);
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            
        }
        
    }
}
