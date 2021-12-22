package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.connect.jdbcexam.dto.Role;

public class RoleDao {
	private static String dbUrl = "jdbc:mysql://localhost:3306/role?useSSL=false";
	private static String dbUser = "root";
	private static String dbPasswd = "rootroot";
	public Role getRole(Integer roleId) {
		Role role = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
			String sql = "select * from role where role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String description = rs.getString("description");
				role = new Role(id, description);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception e) {
					
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					
				}
			}
		}
		
		return role;
	}
}
