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
		System.out.print(proNumber + " ");
		System.out.print(proName + " ");
		System.out.print(proType + " ");
		System.out.print(proPrice + " ");
		System.out.println(proCount);
		return null;
	}
}
