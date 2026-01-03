import java.util.scanner;

public class RingRotate {

    //Main method
    public static void main (String[] args) throws Exception {

    //Create a Scanner object to read input from the user
    Scanner scn = new Scanner(System.in);

    // Prompt the user to enter the number of rows and collumns
    System.out.println("Enter number of rows:");
    int n = scn.nextInt();
    System.out.println("Enter number of columns:");
    int m = scn.nextInt();

    //create a 2D array to hold the matrix elements
    int[][] arr = new int[n][m];

    //Prompt the user to enter the elements of the matrix
    System.out.println("Enter the elements of the " + n + "x" + m + " matrix:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = scn.nextInt(); // store each element
        }
    }

    // prompt the user to enter the ring number and rotation number
    System.out.println("Enter the ring number (sno) ");
    int sno = scn.nextInt();
    System.out.println("Enter the rotation number (rno) ");
    int rno = scn.nextInt();

    // call the ring rotation function
    ringrotate(arr, sno, rno);

    // display the updated matrix
    display(arr);
    }
  
    //function to preform the rotation of the specified ring
    public static void ringrotate(int[][] arr, int sno, int rno) {
        // convert the 2d ring into a 1d array
        int[] la = fill1Dfrom2D( arr, sno);

        // rotate the 1D array
        rotate1D(La, rno);

        // fill the 2D array
 }