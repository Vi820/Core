package com.itvedant;

import java.util.Scanner;

public class HM {
	
		Scanner sc=new Scanner(System.in);
		String dish;
		int price;
		int totalBill;
		int quantity;
		int srNo;
		String choice;
		public void veg() {

			System.out.println("---------------------------------------");
			System.out.println("| Sr No. | DishName           |Price   |");
			System.out.println("---------------------------------------");
			System.out.println("| 1      | VadaPao            |15      |");
			System.out.println("---------------------------------------");
			System.out.println("| 2      | DOSA               |60      |");
			System.out.println("---------------------------------------");
			System.out.println("| 3      | MenduVada         |20       |");
			System.out.println("---------------------------------------");
			
			
			
		}
		
		
		public  void exe() {
			System.out.println("Enter the dish name");
			 dish=sc.next();
			do {
				
			 if(dish.equalsIgnoreCase("Vadapav")) {
				System.out.println("Your select vadapav");
				System.out.println("Enter the quantity");
				 quantity=sc.nextInt();
				price=15;
				}
			
			if(dish.equalsIgnoreCase("Dosa")) {
				System.out.println("Your selected Dosa");
				System.out.println("Enter the quantity");
				 quantity=sc.nextInt();
				price=60;
				}
			if(dish.equalsIgnoreCase("MeduVada")) {
				System.out.println("Your selected MenduVada");
				System.out.println("Enter the quantity");
				 quantity=sc.nextInt();
				price=20;
				}
			System.out.println("If u Want to Order Again PLease Enter yes or no");
			
			choice=sc.next();
			}while(choice.equalsIgnoreCase("Yes"));
			totalBill=(price*quantity);
			int a=totalBill*quantity;
			System.out.println("your totalBill is "+a);
		}
		
		public static void main(String[] args) {
			HM hm=new HM();
			hm.exe();
		}
		
		

	
}
