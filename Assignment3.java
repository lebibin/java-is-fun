import java.util.*;

class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rows = sc.nextInt();
        System.out.print("How many columns? ");
        int columns = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter origin coordinate? ");
        String[] target;
        target = sc.nextLine().split(" ");
        String x = target[0];
        String y = target[1];
        sc.close();
        System.out.println("Rows: " + rows);
        System.out.println("Columns: " + columns);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Table:");

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (Integer.parseInt(x) == row && Integer.parseInt(y) == column) {
                    System.out.print("1");
                } else {
                    System.out.print("X");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}