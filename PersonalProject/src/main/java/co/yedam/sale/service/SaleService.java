package co.yedam.sale.service;

import java.util.List;

public interface SaleService {
	public List<SaleVO> saleSelectList();

	public int SaleInsert(SaleVO vo);
}


//.toLocalDate();