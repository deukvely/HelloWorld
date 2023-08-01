package co.yedam.purchase.service;

import java.sql.Date;

import lombok.Data;

@Data
public class PurchaseVO {
	private int purchaseNumber;
	private int purchaseCount;
	private Date purchaseDate;

	public String toString() {
		System.out.print("구매번호 " + purchaseNumber);
		System.out.print(" 구매갯수 " + purchaseCount);
		System.out.println(" 구매날짜 " + purchaseDate);
		return null;
	}
}
