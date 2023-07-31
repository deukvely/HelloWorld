package co.yedam.sale.service;

import java.sql.Date;

import lombok.Data;
@Data
public class SaleVO {
	private int SaleNumber;
	private String SaleName;
	private int SaleCount;
	private Date SaleDate;

	public String toString() {
		System.out.print(SaleNumber + " ");
		System.out.print(SaleName + " ");
		System.out.print(SaleCount + " ");
		System.out.println(SaleDate);
		return null;
	}
}
