package org.me.tools;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 秃头老狗
 * @version 1.0
 */
public class BookkeepingBookSystem {
    private static final List<Account> accountList = new ArrayList<>();

    static {//默认的2条测试数据
        accountList.add(new Account(AccountType.income,"工作", 20.0, "note"));
        accountList.add(new Account(AccountType.expend, "娱乐",10.0, "note"));
    }

    public static void joinSystem() {

        System.out.println();
        System.out.println("==============================记账本系统==============================");
        System.out.println("0.退出系统");
        System.out.println("1.收入");
        System.out.println("2.支出");
        System.out.println("3.收支记录");
        System.out.println("4.查看余额");
        Integer userNextInt = Utilitys.userNextInt("你的选择");
        System.out.println();
        switch (userNextInt) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                income();
            }
            case 2 -> {
                expend();
            }
            case 3 -> {
                queryLog();
            }
            case 4 -> {
                System.out.println("余额: " + getBalance());
            }
        }
        joinSystem();

    }

    /**
     * 收入
     */
    private static void income() {
        BigDecimal money = Utilitys.userNextBigDecimal("收入金额");
        String note = Utilitys.userNextLine("收入详情");
        Integer incomeType = Utilitys.userNextInt("收入方式(1.工资,2.红包,3.转账,4.其他)");
        String type;
        switch (incomeType) {
            case 1 -> {
                type = "工资";
            }
            case 2 -> {
                type = "红包";
            }
            case 3 -> {
                type = "转账";
            }
            case 4 -> {
                type = "其他";
            }
            default -> type = "null";
        }
        Account account = new Account(AccountType.income, type, money.doubleValue(), note);
        accountList.add(account);
    }

    /**
     * 支出
     */
    private static void expend() {
        BigDecimal money = Utilitys.userNextBigDecimal("支出金额");
        String note = Utilitys.userNextLine("支出详情");
        Integer incomeType = Utilitys.userNextInt("支出方式(1.工作,2.娱乐,3.生活,4.其他)");
        String type;
        switch (incomeType) {
            case 1 -> {
                type = "工作";
            }
            case 2 -> {
                type = "娱乐";
            }
            case 3 -> {
                type = "生活";
            }
            case 4 -> {
                type = "其他";
            }
            default -> type = "null";
        }
        Account account = new Account(AccountType.income, type, money.doubleValue(), note);
        accountList.add(account);

    }

    /**
     * 查询记录
     */
    private static void queryLog() {
        for (Account account : accountList) {
            System.out.println(account);
        }
        System.out.println("余额: " + getBalance());
    }

    /**
     * 计算余额
     */
    private static double getBalance() {
        double balance = 0;
        for (Account account : accountList) {
            AccountType accountType = account.getAccountType();
            if (accountType == AccountType.income) {
                balance += account.getMoney();
            } else if (accountType == AccountType.expend) {
                balance -= account.getMoney();
            } else {
                System.out.println("错误的账条数据");
            }

        }
        return balance;
    }


}
