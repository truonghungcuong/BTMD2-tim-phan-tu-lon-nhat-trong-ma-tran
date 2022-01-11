import java.util.Scanner;

public class Main {
    public static double findMax(double[][] array, int n, int m) {
        double max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array;
        int n;
        int m;
        System.out.println("Nhap kich co ma tran:");
        n = sc.nextInt();
        m = sc.nextInt();
        array = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu o hang " + i + " cot " + j);
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Phan tu lon nhat cua ma tran:" + findMax(array, n, m));
    }
}