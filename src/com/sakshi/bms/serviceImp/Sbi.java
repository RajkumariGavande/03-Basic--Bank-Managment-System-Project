package com.sakshi.bms.serviceImp;

import java.util.Scanner;

import com.sakshi.bms.model.Account;
import com.sakshi.bms.service.Rbi;

public class Sbi implements Rbi {

	Account a = null;
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		a = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly Enter The Details To Create An Account...!");
		System.out.println("Enter Name here:");
		a.setName(sc.next() + sc.nextLine());
		System.out.println("Enter Account Number:");
		a.setAccNo(sc.nextLong());
		System.out.println("Enter your Mobile number:");
		a.setMobNo(sc.nextLong());
		System.out.println("Enter your Addhar number:");
		a.setAdharNo(sc.nextLong());
		System.out.println("Enter Your gender:");
		a.setGender(sc.next());
		System.out.println("Enter your Age:");
		a.setAge(sc.nextInt());
		System.out.println("Enter balance to enter into Account:");
		a.setBalance(sc.nextDouble());
		System.out.println("Account Created Succsessfully....!");
		System.out.println("*************************************************");
	}

	@Override
	public void displayAllDetails() {

		if (a != null) {
			System.out.println("Account Holder Name is:" + a.getName());
			System.out.println("Account Number is:" + a.getAccNo());
			System.out.println("Mobile Number is:" + a.getMobNo());
			System.out.println("Addhar number is:" + a.getAdharNo());
			System.out.println("Gender is:" + a.getGender());
			System.out.println("Age is:" + a.getAge());
			System.out.println("Balance entered by person:" + a.getBalance());
		} else {
			System.out.println("Please enter the Account Details before display");
		}
		System.out.println("**************************************************");
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter Amount to deposite:");
		double amount = sc.nextInt();
		double currentBalance = a.getBalance() + amount;
		a.setBalance(currentBalance);
		System.out.println("Deposite Successfully...!");
		System.out.println("**************************************************");
	}

	@Override
	public void withdrawal() {

		System.out.println("Enter Balance to Withdraw:");
		double withdrawal = sc.nextInt();
		if (a.getBalance() < withdrawal)
			System.out.println("Cannot Withdraw.Balance is Insufficient");
		else {
			double currentBalance = a.getBalance() - withdrawal;
			a.setBalance(currentBalance);
			System.out.println("Withdrawal of Rs-/" + withdrawal + " sucssesfully...!");
			System.out.println("**************************************************");
		}
	}

	@Override
	public void balanceCheck() {

		System.out.println("After withdrawal remainig Balance should be...." + a.getBalance());
		System.out.println("**************************************************");
	}

//	@Override
//	public void updateDetails() {
//		if (a != null) {
//			System.out.println("Enter 1 to update name:");
//			System.out.println("Enter 2 t0 update mobile number");
//			int ch = sc.nextInt();
//			if (ch == 1) {
//				System.out.println("Enter new name:");
//				a.setName(sc.next());
//			} else if (ch == 2) {
//				System.out.println("Enter new Updated Mobile:");
//				a.setMobNo(sc.nextLong());
//			} else
//				System.out.println("Please enter the Account Details before display");
//
//		}
//
//	}

}
