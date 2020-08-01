package emailapp;

public class histo {

    static int[] myArray = {1,2,1,3,3,1,2,1,5,1};

    public static void main (String args[]) {
        // Your code here
        int n = myArray.length;
        boolean visited[] = new boolean[n];

        for (int i = 1; i <= 5; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (visited[j] == true)
                    continue;

                if (myArray[j] == i) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.print(i + ": " );
            for (int k = 0; k < count; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
