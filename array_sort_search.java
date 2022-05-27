import java.util.Arrays;
public class array_sort_search {
    //--search an element in an array--
    public static int search(int array[], int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;//if not present in the array
    }
    public static void main(String args[]) {
        int a1 [] = new int[] {2, 3, 8, 9, 0, 5};
        //--sort array--
        for(int i=0; i<a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        Arrays.sort(a1);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
        int index = search(a1, 5);
        if(index == -1) {
            System.out.println("\nElement not found");
        }
        else {
            System.out.println("\nElement at index : " + index);
        }
      
    }
    
}
