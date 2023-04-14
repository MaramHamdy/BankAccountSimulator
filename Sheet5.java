/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet5;
public class Sheet5 {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(0.12);
        System.out.println("annual interest rate="+Account.getAnnualInterestRate());
        System.out.println("monthly interest rate="+Account.getMonthlyInterestRate()); 
        //acc1
        Account acc1=new Account();
        System.out.println("acc1 id="+acc1.getID());
        System.out.println("acc1 balance="+acc1.getBalance());
        System.out.println("acc1 date created="+acc1.getDateCreated());
        System.out.println("acc1 monthly interest="+acc1.getMonthlyInterest());
        //acc2
        Account acc2=new Account(22010245,3000);
        System.out.println("acc2 id="+acc2.getID());
        System.out.println("acc2 balance="+acc2.getBalance());
        System.out.println("acc2 date created="+acc2.getDateCreated()); 
        System.out.println("acc2 monthly interest="+acc2.getMonthlyInterest());
    }
    
}
