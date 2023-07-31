package co.yedam.purchase.service.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.PersonalProject.db.DataSource;
import co.yedam.purchase.service.PurchaseService;
import co.yedam.purchase.service.PurchaseVO;
import co.yedam.sale.service.SaleVO;

public class PurchaseServiceImpl implements PurchaseService {
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<PurchaseVO> purchaseSelectList() {
		String sql = "SELECT PUR_NUMBER, PUR_NAME, PUR_COUNT, PUR_DATE "
				+ "FROM  PURCHASE PU LEFT JOIN PRODUCT P ON(PU.PUR_NUMBER "
				+ "= P.PRO_NUMBER)";
		List<PurchaseVO> purchases = new ArrayList<PurchaseVO>();
		PurchaseVO vo;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new PurchaseVO();
				vo.setPurchaseNumber(rs.getInt("pur_number"));
				vo.setPurchaseName(rs.getString("pur_name"));
				vo.setPurchaseCount(rs.getInt("pur_count"));
				vo.setPurchaseDate(rs.getDate("pur_date"));
				purchases.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return purchases;
	}

	@Override
	public int purchaseInsert(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
