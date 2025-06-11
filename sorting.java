public class sorting {
   


public class Sorting_Examples {
   static void Bubble_Sort(int a[]) {
       for (int i = 0; i < a.length - 1; i++)
       {

        boolean done=true;
           for (int j = 0; j < a.length - 1; j++)
           {System.out.println("Pass"+i);
            
               if (a[j] > a[j + 1]) {
                done=false;
                   int t = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = t;
               }
               if(done)
               break;
           }
       }
   }


   public static void main(String[] args) {
       int[] a = {10, 25, 5, 40, 15, 30, 20};
       
       Bubble_Sort(a);
      


   }
}

}
