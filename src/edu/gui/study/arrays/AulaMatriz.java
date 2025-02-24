package edu.gui.study.arrays;

public class AulaMatriz {

    public static void main(String [] args) {

        int[][] dias = new int[2][3];

        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3};

        for (int[] dia : dias) {
            System.out.println("------------");
            for (int num : dia) {
                System.out.println(num);
            }
        }

        System.out.println("-----------");

        dias[0][0] = 31;
        dias[0][1] = 28;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int[] dia : dias) {
            for (int num : dia) {
                System.out.println(num);

            }
        }

        System.out.println("----------------");

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("-------------");
            for (int num : arrayBase) {

                System.out.println(num);

            }
        }

    }
}
