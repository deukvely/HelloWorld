package co.yedam.sale.service.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.PersonalProject.db.DataSource;
import co.yedam.sale.service.SaleService;
import co.yedam.sale.service.SaleVO;

public class SaleServiceImpl implements SaleService {
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<SaleVO> saleSelectList() {
		String sql = "SELECT SAL_NUMBER, SAL_NAME, SAL_COUNT, "
				+ "SAL_DATE FROM  SALE S LEFT JOIN PRODUCT P "
				+ "ON(S.SAL_NUMBER = P.PRO_NUMBER)";
		List<SaleVO> sales = new ArrayList<SaleVO>();
		SaleVO vo;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new SaleVO();
				vo.setSaleNumber(rs.getInt("sal_number"));
				vo.setSaleName(rs.getString("sal_name"));
				vo.setSaleCount(rs.getInt("sal_count"));
				vo.setSaleDate(rs.getDate("sal_date"));
				sales.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return sales;
	}

	@Override
	public int SaleInsert(SaleVO vo) {
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
