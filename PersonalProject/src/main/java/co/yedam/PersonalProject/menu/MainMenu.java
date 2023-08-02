package co.yedam.PersonalProject.menu;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import co.yedam.product.service.ProductService;
import co.yedam.product.service.ProductVO;
import co.yedam.product.service.Impl.ProductServiceImpl;
import co.yedam.purchase.service.PurchaseService;
import co.yedam.purchase.service.PurchaseVO;
import co.yedam.purchase.service.Impl.PurchaseServiceImpl;
import co.yedam.sale.service.SaleService;
import co.yedam.sale.service.SaleVO;
import co.yedam.sale.service.Impl.SaleServiceImpl;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private ProductService pds = new ProductServiceImpl();
	private PurchaseService pcs = new PurchaseServiceImpl();
	private SaleService ss = new SaleServiceImpl();

	private void mainTitle() {
		System.out.println("=====제품관리=====");
		System.out.println("====1.상품관리====");
		System.out.println("===2.입출고관리====");
		System.out.println("=====3.종료======");
		System.out.println("원하는 작업번호를 입력하세요");
	} // fdaskmfdkasmfksmafkmdk

	private void productTitle() {
		System.out.println("=====상품관리=====");
		System.out.println("====1.상품조회====");
		System.out.println("====2.단건조회====");
		System.out.println("====3.상품등록====");
		System.out.println("====4.상품수정====");
		System.out.println("====5.상품삭제====");
		System.out.println("=====6.종료======");
		System.out.println("원하는 작업번호를 입력하세요");
	}

	private void salPurTitle() {
		System.out.println("====입출고관리=====");
		System.out.println("=====1.구매======");
		System.out.println("====2.구매내역====");
		System.out.println("=====3.판매======");
		System.out.println("====4.판매내역====");
		System.out.println("=====5.종료======");
		System.out.println("원하는 작업번호를 입력하세요");
	}

	public void mainRun() {
		boolean run = false;
		do {
			try {
				mainTitle();
				int key = Integer.parseInt(sc.nextLine());
				switch (key) {
				case 1:
					productRun();
					break;
				case 2:
					salPurRun();
					break;
				case 3:
					System.out.println("작업을 종료합니다.");
					run = true;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} while (!run);
		sc.close();

	}

	public void productRun() {
		boolean run = false;
		do {
			try {
				productTitle();
				int key = Integer.parseInt(sc.nextLine());
				switch (key) {
				case 1:
					// 상품 등록
					productSelectList();
					break;
				case 2:
					// 상품내역
					productSelect();
					break;
				case 3:
					// 단건조회
					productInsert();
					break;
				case 4:
					// 상품수정
					productUpdate();
					break;
				case 5:
					// 상품삭제
					productDelete();
					break;
				case 6:
					run = true;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} while (!run);

	}

	public void salPurRun() {
		boolean run = false;
		do {
			try {
				salPurTitle();
				int key = Integer.parseInt(sc.nextLine());
				switch (key) {
				case 1:
					// 구매
					purchaseInsert();
					break;
				case 2:
					// 구매내역
					purchaseSelectList();
					break;
				case 3:
					// 판매
					saleInsert();
					break;
				case 4:
					// 판매내역
					saleSelectList();
					break;
				case 5:
					run = true;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} while (!run);
	}

	private void productSelectList() {
		List<ProductVO> products = pds.productSelectList();
		if (!products.isEmpty()) {
			for (ProductVO product : products) {
				product.toString();
			}
		} else {
			System.out.println("등록된 상품이 존재하지 않습니다.");
		}
	}

	private void productSelect() {
		ProductVO product = new ProductVO();
		System.out.print("검색할 번호 ");
		int no = Integer.parseInt(sc.nextLine());
		product.setProNumber(no);
		product = pds.productSelect(product);
		if (product.getProName() != null) {
			product.toString();
		} else {
			System.out.println("*존재하지 않는 회원*");
		}
	}

	private void productInsert() {
		ProductVO product = new ProductVO();
		System.out.print("번호 이름 종류 가격 갯수");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		product.setProNumber(no);
		product.setProName(data[1]);
		product.setProType(data[2]);
		int type = Integer.parseInt(data[3]);
		product.setProPrice(type);
		int count = Integer.parseInt(data[4]);
		product.setProCount(count);

		int result = pds.productInsert(product);
		if (result == 1) {
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
	}

	private void productUpdate() {
		ProductVO product = new ProductVO();
		System.out.println("번호 바꿀 가격");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		product.setProNumber(no);
		int price = Integer.parseInt(data[1]);
		product.setProPrice(price);

		int result = pds.productUpdate(product);
		if (result == 1) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}
	}

	private void productDelete() {
		ProductVO product = new ProductVO();
		System.out.println("번호");
		String str = sc.nextLine();
		int no = Integer.parseInt(str);
		product.setProNumber(no);

		int result = pds.productDelete(product);
		if (result == 1) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}

	private void saleSelectList() {
		List<SaleVO> sales = ss.saleSelectList();
		if (!sales.isEmpty()) {
			for (SaleVO sale : sales) {
				sale.toString();
			}
		} else {
			System.out.println("등록된 상품이 존재하지 않습니다.");
		}
	}

	private void purchaseSelectList() {
		List<PurchaseVO> purchases = pcs.purchaseSelectList();
		if (!purchases.isEmpty()) {
			for (PurchaseVO purchase : purchases) {
				purchase.toString();
			}
		} else {
			System.out.println("등록된 상품이 존재하지 않습니다.");
		}
	}

	private void saleInsert() {
		SaleVO sale = new SaleVO();
		System.out.print("번호 갯수 날짜(YYYY-MM-DD)");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		sale.setSaleNumber(no);
		int count = Integer.parseInt(data[1]);
		sale.setSaleCount(count);
		Date date = Date.valueOf(data[2]);
		sale.setSaleDate(date);

		ProductVO product = new ProductVO();
		product.setProNumber(no);
		product = pds.productSelect(product);

		int co = product.getProCount();
		co -= count;

		if (co > 0) {
			product.setProCount(co);
			pds.productCountUpdate(product);
			int result = ss.saleInsert(sale);
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록되지 않거나, 판매갯수가 보다 많습니다.");
		}
	}

	private void purchaseInsert() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.print("번호 갯수 날짜(YYYY-MM-DD)");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		purchase.setPurchaseNumber(no);
		int count = Integer.parseInt(data[1]);
		purchase.setPurchaseCount(count);
		Date date = Date.valueOf(data[2]);
		purchase.setPurchaseDate(date);

		ProductVO product = new ProductVO();
		product.setProNumber(no);
		product = pds.productSelect(product);

		int co = product.getProCount();
		co += count;

		if (co > 0) {
			product.setProCount(co);
			pds.productCountUpdate(product);
			int result = pcs.purchaseInsert(purchase);
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
	}
}