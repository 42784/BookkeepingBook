package org.me.tools;

/**
 * @author 秃头老狗
 * @version 1.0
 */
public class Account {

    private AccountType accountType;
    private String type;
    private double money;
    private String note;

    public Account(AccountType accountType, double money, String note) {
        this.accountType = accountType;
        this.money = money;
        this.note = note;
    }

    public Account(AccountType accountType, String type, double money, String note) {
        this.accountType = accountType;
        this.type = type;
        this.money = money;
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType.getType() +
                ", type='" + type + '\'' +
                ", money=" + money +
                ", note='" + note + '\'' +
                '}';
    }
}

class AccountType {
    public static AccountType income = new AccountType("收入");
    public static AccountType expend = new AccountType("支出");
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    AccountType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "type='" + type + '\'' +
                '}';
    }
}