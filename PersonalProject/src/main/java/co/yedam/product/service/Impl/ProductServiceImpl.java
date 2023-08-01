package co.yedam.product.service.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.PersonalProject.db.DataSource;
import co.yedam.product.service.ProductService;
import co.yedam.product.service.ProductVO;

public class ProductServiceImpl implements ProductService {

	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
//	private SaleService ss = new SaleServiceImpl();

	@Override
	public List<ProductVO> productSelectList() {
		String sql = "SELECT * FROM PRODUCT ORDER BY PRO_NUMBER";
		List<ProductVO> products = new ArrayList<ProductVO>();
		ProductVO vo;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new ProductVO();
				vo.setProNumber(rs.getInt("pro_number"));
				vo.setProName(rs.getString("pro_name"));
				vo.setProType(rs.getString("pro_type"));
				vo.setProPrice(rs.getInt("pro_price"));
				vo.setProCount(rs.getInt("pro_count"));
				products.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return products;
	}

	@Override
	public ProductVO productSelect(ProductVO vo) {
		String sql = "SELECT * FROM PRODUCT WHERE PRO_NUMBER = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getProNumber());
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new ProductVO();
				vo.setProNumber(rs.getInt("pro_number"));
				vo.setProName(rs.getString("pro_name"));
				vo.setProType(rs.getString("pro_type"));
				vo.setProPrice(rs.getInt("pro_price"));
				vo.setProCount(rs.getInt("pro_count"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	@Override
	public int productInsert(ProductVO vo) {
		int n = 0;
		String sql = "INSERT INTO PRODUCT VALUES (?,?,?,?,?)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getProNumber());
			psmt.setString(2, vo.getProName());
			psmt.setString(3, vo.getProType());
			psmt.setInt(4, vo.getProPrice());
			psmt.setInt(5, vo.getProCount());
			n = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int productUpdate(ProductVO vo) {
		int n = 0;
		String sql = "UPDATE PRODUCT SET PRO_PRICE = ? WHERE PRO_NUMBER = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getProPrice());
			psmt.setInt(2, vo.getProNumber());
			n = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int productDelete(ProductVO vo) {
		int n = 0;
		String sql = "DELETE FROM PRODUCT WHERE PRO_NUMBER = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getProNumber());
			n = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int productCountUpdate(ProductVO vo) {
		int n = 0;
		String sql = "UPDATE PRODUCT SET PRO_COUNT = ? WHERE PRO_NUMBER = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getProCount());
			psmt.setInt(2, vo.getProNumber());
			n = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
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
