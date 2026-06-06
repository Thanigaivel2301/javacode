import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int mid = size / 2;

        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < name.length(); k++) {
                char ch = name.charAt(k);
                printCharRow(ch, i, size, mid);
                System.out.print("  "); 
            }
            System.out.println();
        }
    }

    public static void printCharRow(char ch, int i, int size, int mid) {
        for (int j = 0; j < size; j++) {
            boolean Pattern = false;

            switch (ch) {
                case 'A':
                    Pattern = ((j == 0 || j == size - 1) && i > 0) || i == mid || (i == 0 && j > 0 && j < size - 1);
                    break;
                case 'B':
                    Pattern = j == 0 || (i == 0 || i == mid || i == size - 1) && j < size - 1 || (j == size - 1 && i != 0 && i != mid && i != size - 1);
                    break;
                case 'C':
                    Pattern = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0);
                    break;
                case 'D':
                    Pattern = j == 0 || ((i == 0 || i == size - 1) && j < size - 1) || (j == size - 1 && i > 0 && i < size - 1);
                    break;
                case 'E':
                    Pattern = j == 0 || i == 0 || i == mid || i == size - 1;
                    break;
                case 'F':
                    Pattern = j == 0 || i == 0 || i == mid;
                    break;
                case 'G':
                    Pattern = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0) || (i >= mid && j == size - 1) || (i == mid && j >= mid);
                    break;
                case 'H':
                    Pattern = j == 0 || j == size - 1 || i == mid;
                    break;
                case 'I':
                    Pattern = i == 0 || i == size - 1 || j == mid;
                    break;
                case 'J':
                    Pattern = i == 0 || (j == mid && i < size - 1) || (i == size - 1 && j < mid && j > 0) || (i == size - 1 - 1 && j == 0 && i >= mid);
                    break;
                case 'K':
                    Pattern = j == 0 || (i < mid && j == size - 1 - i) || (i >= mid && j == i);
                    break;
                case 'L':
                    Pattern = j == 0 || i == size - 1;
                    break;
                case 'M':
                    Pattern = j == 0 || j == size - 1 || (i <= mid && (j == i || j == size - 1 - i));
                    break;
                case 'N':
                    Pattern = j == 0 || j == size - 1 || j == i;
                    break;
                case 'O':
                    Pattern = (j == 0 && i > 0 && i < size - 1) || (j == size - 1 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0 && j < size - 1);
                    break;
                case 'P':
                    Pattern = j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid);
                    break;
                case 'Q':
                    Pattern = ((j == 0 || j == size - 2) && i > 0 && i < size - 2) || ((i == 0 || i == size - 2) && j > 0 && j < size - 2) || (i >= mid && j == i);
                    break;
                case 'R':
                    Pattern = j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid) || (i > mid && j == i);
                    break;
                case 'S':
                    Pattern = i == 0 || i == mid || i == size - 1 || (i < mid && j == 0) || (i > mid && j == size - 1);
                    break;
                case 'T':
                    Pattern = i == 0 || j == mid;
                    break;
                case 'U':
                    Pattern = ((j == 0 || j == size - 1) && i < size - 1) || (i == size - 1 && j > 0 && j < size - 1);
                    break;
                case 'V':
                    Pattern = (i < mid && (j == 0 || j == size - 1)) || (i >= mid && (j == i - mid || j == size - 1 - (i - mid)));
                    break;
                case 'W':
                    Pattern = j == 0 || j == size - 1 || (i >= mid && (j == i || j == size - 1 - i));
                    break;
                case 'X':
                    Pattern = j == i || j == size - 1 - i;
                    break;
                case 'Y':
                    Pattern = (i < mid && (j == i || j == size - 1 - i)) || (i >= mid && j == mid);
                    break;
                case 'Z':
                    Pattern = i == 0 || i == size - 1 || j == size - 1 - i;
                    break;
               
                default:
                    Pattern = false;
                    break;
            }

            if (Pattern) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}