import java.util.*;

class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rows = sc.nextInt();
        System.out.print("How many columns? ");
        int columns = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter origin coordinate: ");
        String[] target;
        target = sc.nextLine().split(" ");
        String x = target[0];
        int xCoordinate = Integer.parseInt(x);
        String y = target[1];
        int yCoordinate = Integer.parseInt(y);
        sc.close();

        try {
            if (xCoordinate > columns || xCoordinate < 0) { throw new Exception("X coordinate is out of column bounds!"); }
            if (yCoordinate > rows || yCoordinate < 0) { throw new Exception("Y coordinate is out of row bounds!"); }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println("\nResult");
        for (int row = rows; row > 0; row--) {
            for (int column = 1; column <= columns; column++) {
              if (yCoordinate == row) {
                if (xCoordinate == column) {
                        System.out.print("1");
                    } else {
                        int base = xCoordinate - column + 1;
                        if (xCoordinate <= column) { base = column - xCoordinate + 1; }
                        System.out.print(base);
                    }
                } else {
                    int base = yCoordinate - row + 1;
                    if (yCoordinate <= row) {
                        base = row - yCoordinate + 1;
                    }
                    System.out.print(base);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}