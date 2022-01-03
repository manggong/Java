package pro07.sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private String dirver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/servlet?useSSL=false";
	private String username = "root";
	private String password = "rootroot";
	private Statement stmt;
	private Connection con;

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			connDB();
			String query = "select * from t_member";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");

				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);

				list.add(vo);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private void connDB() {
		try {
			Class.forName(dirver);
			System.out.println("driver load success");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection success");
			stmt = con.createStatement();
			System.out.println("statement success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
