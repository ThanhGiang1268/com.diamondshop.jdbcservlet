package com.diamondshop.projectservlet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.diamondshop.projectservlet.dao.IGenericDAO;
import com.diamondshop.projectservlet.mapper.IRowMapper;

public class AbstractDAO<T> implements IGenericDAO<T> {

	ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

//	driverName = com.mysql.jdbc.Driver
//			url = jdbc:mysql://localhost:3306/jdbcservlet
//			user = root
//			password = 1234

		
//		public Connection getConnection() {
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				String url = "jdbc:mysql://localhost:3306/jdbcservlet";
//				String password = "1234";
//				String user = "root";
//				return DriverManager.getConnection(url,user,password);
//			} catch (SQLException | ClassNotFoundException e) {
//
//				return null;
//			}
//		}
		public Connection getConnection() {
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			return DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rSet = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			setParameter(ps, parameters);
			rSet = ps.executeQuery();
			while (rSet.next()) {
				results.add(rowMapper.mapRow(rSet));
			}
			return results;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rSet != null) {
					rSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
	}

	private void setParameter(PreparedStatement ps, Object... parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					ps.setLong(index, (Long) parameter);
				} else if (parameter instanceof String) {
					ps.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					ps.setInt(index, (Integer) parameter);
				} else if (parameter instanceof Timestamp) {
					ps.setTimestamp(index, (Timestamp) parameter);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(String sql, Object... parameters) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			setParameter(ps, parameters);
			ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			if (con != null) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}

	@Override
	public Long insert(String sql, Object... parameters) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Long id = null;
			con = getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			setParameter(ps, parameters);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getLong(1);
			}
			con.commit();
			return id;
		} catch (SQLException e) {
			if (con != null) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public int count(String sql, Object... parameters) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			int count = 0;
			con = getConnection();
			ps = con.prepareStatement(sql);
			setParameter(ps, parameters);
			rs = ps.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
			return count;

		} catch (SQLException e) {
			return 0;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				return 0;
			}
		}
	}

}
