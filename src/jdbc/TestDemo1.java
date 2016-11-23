package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 * 
 * @titleTestDemo1.java
 * @author taojian
 * @date2016-11-11上午11:32:21
 * 
 */
public class TestDemo1 {
    
	//mysql的驱动名称
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	//连接数据库的路径
	public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8";
	//mysql数据库的用户名
	public static final String DBUSER="root";
	//数据库的密码
	public static final String PASSWORD="123";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 第一步：加载数据库驱动程序；
		Connection conn=null;
     
		Class.forName(DBDRIVER);
		//• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
		conn=(Connection) DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		//打印结果com.mysql.jdbc.Connection@465863	
		System.out.println(conn);
		//• 第三步：进行数据表的CRUD操作，执行SQL；
		/**
		 * 即：Statement不应该被使用，所有的开发都会使用Statement的子接口：PreparedStatement完成。
	    PreparedStatement采用的是一种预处理的方式来进行程序编写的，所谓的预处理指的是先在数据库之中执行好要操作的SQL语句，但是其对应的内容暂时不插入，通过程序再依次设置。
	               如果要想取得PreparedStatement接口的对象依然需要通过Connection接口完成，在Connection接口定义的方法：
		• 取得PreparedStatement接口对象：public PreparedStatement prepareStatement(String sql) throws SQLException 

		 */
		int id=1;
		String name = "Mr'Smith" ;
		int age=17;
	    PreparedStatement pstmt;
		String sql = "INSERT INTO student (id,name,age) VALUES (?,?,?)";
        pstmt  = conn.prepareStatement(sql) ;	// 执行了SQL
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		pstmt.executeUpdate();

		//• 第四步：关闭数据库连接。
		conn.close();
		
		}

	
	   
	  
	}


