public class rough {
    public static void main(String[] args) {
        System.out.println("----------------------**Rough workhere**---------------------");

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for  (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
          }

          for (int i = array.length - 1; i > 0; i--) {
            //int j = r.nextInt(i + 1);
             int j=2;
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
         }
         System.out.println();
         for  (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
          }

        
    }
}
