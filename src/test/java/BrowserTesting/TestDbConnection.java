package BrowserTesting;

import java.sql.SQLException;

public class TestDbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select *from Employee"));

	}

}
