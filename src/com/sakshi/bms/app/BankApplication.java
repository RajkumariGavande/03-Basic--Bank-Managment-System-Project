package com.sakshi.bms.app;

import java.util.Scanner;

import com.sakshi.bms.serviceImp.Sbi;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi s = new Sbi();
		while (true) {
			System.out.println(".......Welecome To Bank Managment System Application....!");
			System.out.println("->Choose 1:To create new Account");
			System.out.println("->Choose 2: To display all details of Account Holder");
			System.out.println("->Choose 3:To Deposite Amount");
			System.out.println("->Choose 4:To Withdraw Amount");
			System.out.println("->Choose 5:To Check total balance");
			// System.out.println("->choose 6:To update Details:");
			System.out.println("***************************************");

			System.out.println("....click on the option to which transaction you want to perform....");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				s.createAccount();
				break;
			case 2:
				s.displayAllDetails();
				break;
			case 3:
				s.depositeMoney();
				break;
			case 4:
				s.withdrawal();
				break;

			case 5:
				s.balanceCheck();
				break;
//			case 6:
//				s.updateDetails();
//				break;

			default:
				System.out.println("You chosse the wrong option");
				break;
			}
		}
	}
}