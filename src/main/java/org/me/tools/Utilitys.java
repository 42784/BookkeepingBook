package org.me.tools;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * 常用工具类
 */
public class Utilitys {
    /**
     * 获取扫描器
     */
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static Integer userNextInt(String title) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入" + title + ": ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.print("错误，");
        }
    }
    public static BigDecimal userNextBigDecimal(String title) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入" + title + ": ");
            if (scanner.hasNextLine()) {
                try{
                    return new BigDecimal(scanner.nextLine());
                }catch (Exception ignored){}
            }
            System.out.print("错误，");
        }
    }




    public static Boolean isSure() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("你确定吗(y/n)");
            if (scanner.hasNextLine()) {
                char userChoice = scanner.nextLine().toLowerCase().charAt(0);//用户的选择
                //先变成小写 再获取第一个字符
                switch (userChoice) {
                    case 'y' -> {
                        return true;
                    }
                    case 'n' -> {
                        return false;
                    }
                }
            }
            System.out.print("错误，");
        }
    }


    public static String userNextLine(String title) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入" + title + ": ");
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
            System.out.print("错误，");
        }
    }

    /**
     * 输出一维数组
     */
    public static void showArray_One(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    /**
     * 输出二维数组
     */
    public static void showArray_Two(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
