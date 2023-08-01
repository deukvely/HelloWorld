package co.yedam.product.service;

import lombok.Data;

@Data
public class ProductVO {
	private int proNumber;
	private String proName;
	private String proType;
	private int proPrice;
	private int proCount;

	@Override
	public String toString() {
		System.out.print("관리번호 " + proNumber);
		System.out.print(" 제품명 " + proName);
		System.out.print(" 제품종류 " + proType);
		System.out.print(" 제품가격 " + proPrice);
		System.out.println(" 제품갯수 " + proCount);
		return null;
	}
}
