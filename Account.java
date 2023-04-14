/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet5;

/**
 *
 * @author 20100
 */
import java.util.Scanner;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    Account(){
        
    }
    Account(int id,double initialBalance){
        this.id=id;
        this.balance=initialBalance;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public static void setAnnualInterestRate(double AIR){
        annualInterestRate=AIR;
    }
    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return this.dateCreated.date;
    }
    public static double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return this.balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
public class Date{
    Scanner input=new Scanner(System.in);
    String date;
    Date(){
        System.out.println("Enter the day,month and year (for today'the day when this account was created')respectively:");
        date=input.nextInt()+"/"+input.nextInt()+"/"+input.nextInt();
    }
}
}
