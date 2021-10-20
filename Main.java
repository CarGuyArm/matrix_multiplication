package com.company;
import java.util.*;
public class Main {

    public static void Bazmapatkum(int[][] x, int[][] y, int n, int m,int k) {
        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int u = 0; u < k; u++) {
                for (int j = 0; j < m; j++) {
                    result[i][u] += x[i][j] * y[j][u];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Randomiser(int[][] x,int n,int m) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = rnd.nextInt(5);
            }
        }
    }

    public static void main(String[] args) {
        int n, m,k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nermuceq n: ");//arajin matrici toxeri qanak
        n = scan.nextInt();
        System.out.print("Nermuceq m: ");//arajin matrici syuneri ev erkrord matrici toxeri qanaky
        m = scan.nextInt();
        System.out.print("Nermuceq k: ");//erkrord matrici syuneri qanak
        k=scan.nextInt();
        int[][] x = new int[n][m];
        int[][] y = new int[m][k];
        Randomiser(x,n,m);
        Randomiser(y,m,k);
        Bazmapatkum(x, y, n, m,k);

    }
}
