package co.yedam.product.service;

import java.util.List;

public interface ProductService {
	public List<ProductVO> productSelectList();

	public ProductVO productSelect(ProductVO vo);

	public int productInsert(ProductVO vo);

	public int productUpdate(ProductVO vo);

	public int productDelete(ProductVO vo);
}