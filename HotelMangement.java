package com.itvedant;

public class HotelMangement {

	private int Srno;
	private String dishName;
	private int price;
	private int quantity;
	private int totalBill;
	public HotelMangement(int srno, String dishName, int price, int quantity, int totalBill) {
		super();
		Srno = srno;
		this.dishName = dishName;
		this.price = price;
		this.quantity = quantity;
		this.totalBill = totalBill;
	}
	public int getSrno() {
		return Srno;
	}
	public void setSrno(int srno) {
		Srno = srno;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "HotelMangement [Srno=" + Srno + ", dishName=" + dishName + ", price=" + price + ", quantity=" + quantity
				+ ", totalBill=" + totalBill + "]";
	}
	
	
	
}
