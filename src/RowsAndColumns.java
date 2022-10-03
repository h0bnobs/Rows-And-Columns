import java.util.Scanner;

public class RowsAndColumns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter the number of rows: ");
            rows = scanner.nextInt();
        System.out.println("Enter then number of columns: ");
            columns = scanner.nextInt();
        System.out.println("Enter the symbol you would like: ");
            symbol = scanner.next();

        for(int i=1; i<=rows; i++) {//i is short for index. The for loop continues as long as i is less than or equal to 1 which it is, and it then increments by 1
            System.out.println();//this moves the cursor down 1 line per the input of the user
            for(int j=1; j<=columns; j++) {//this nested loop continues as long as j<=1
                System.out.print(symbol);//while this is running it uses the user's symbol to make the columns
            }
        }
    }
}
