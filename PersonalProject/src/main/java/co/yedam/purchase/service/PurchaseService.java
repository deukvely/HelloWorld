package co.yedam.purchase.service;

import java.util.List;

public interface PurchaseService {
	public List<PurchaseVO> purchaseSelectList();

	public int purchaseInsert(PurchaseVO vo);
}