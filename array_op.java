public class array_op {
    public static void main(String args []) {
            //--creation of one dimensional array--
            int[] a1 = new int[6];
            System.out.println("One dimensional array");
            for(int i=0; i<a1.length; i++) {
                a1[i] = i;
            }
            for(int j=0; j<a1.length; j++) {
                System.out.print(a1[j]+" ");
            }

            //--creation of two dimensional array--
            int [][] a2 = new int[3][4];
            System.out.println("\ntwo dimensional array");
            for(int i=0; i<a2.length; i++) {
                for(int j=0; j<a2[i].length; j++) {
                    a2[i][j] = i*a2[i].length+j;
                }
            }
            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a2[i].length; j++) {
                    System.out.print(a2[i][j]+" ");
                }
                System.out.println();
            }
    }
}