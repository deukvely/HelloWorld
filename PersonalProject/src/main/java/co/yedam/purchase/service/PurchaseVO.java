package co.yedam.purchase.service;

import java.sql.Date;

import lombok.Data;
@Data
public class PurchaseVO {
	private int purchaseNumber;
	private String purchaseName;
	private int purchaseCount;
	private Date purchaseDate;

	public String toString() {
		System.out.print(purchaseNumber + " ");
		System.out.print(purchaseName + " ");
		System.out.print(purchaseCount + " ");
		System.out.println(purchaseDate);
		return null;
	}
}
