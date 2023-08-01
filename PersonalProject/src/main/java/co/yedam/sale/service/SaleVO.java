package co.yedam.sale.service;

import java.sql.Date;

import lombok.Data;

@Data
public class SaleVO {
	private int SaleNumber;
	private int SaleCount;
	private Date SaleDate;

	public String toString() {
		System.out.print("판매번호 " + SaleNumber);
		System.out.print(" 판매갯수 " + SaleCount);
		System.out.println(" 판매날짜 " + SaleDate);
		return null;
	}
}
