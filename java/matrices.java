import java.util.Scanner;;
public class matrices {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows :");
        m = sc.nextInt();
        System.out.println("Enter number of columns :");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix :");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of first matrix :");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Enter the elements of second matrix :");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of second matrix :");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Added Matrix :");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }System.out.println();
        }
        sc.close();
        s.close();
    }
}
