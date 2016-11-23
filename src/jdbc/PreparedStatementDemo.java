package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @titlePreparedStatementDemo.java
 * @author taojian
 * @date2016-11-16下午4:34:41
 * 查询等操作
 */
public class PreparedStatementDemo {

	//mysql的驱动名称
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	//连接数据库的路径
	public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8";
	//mysql数据库的用户名
	public static final String DBUSER="root";
	//数据库的密码
	public static final String PASSWORD="123";
	
	public static void main(String[] args) throws Exception {
		PreparedStatementDemo pd=new PreparedStatementDemo();   
		//pd.query();
		//pd.queryById(2);
		//pd.queryClear();
		//pd.Tabpage();
		pd.batchQuery();
		}
	
	//查询数据
	public  void query()throws Exception{
		
		// TODO Auto-generated method stub
				// 第一步：加载数据库驱动程序；
				Connection conn=null;  
				PreparedStatement pstmt=null;
				String sql="select id,name,age from student";
				Class.forName(DBDRIVER);
				//• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
				conn=(Connection) DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
				//打印结果com.mysql.jdbc.Connection@465863	
				System.out.println(conn);
				//• 第三步：进行数据表的CRUD操作，执行SQL；
				pstmt=conn.prepareStatement(sql);
		       ResultSet rs=pstmt.executeQuery();
		       while(rs.next()){
		    	   int id=rs.getInt(1);
		    	   String name=rs.getString(2);
		    	   int age=rs.getInt(3);
		    	   System.out.println(id+","+name+","+age+" ");
		    	   
		    	   
		       }
				//• 第四步：关闭数据库连接。
				conn.close();		
	}
    // 根据某一id查询
    public  void queryById(int id)throws Exception{
		
		// TODO Auto-generated method stub
				// 第一步：加载数据库驱动程序；
				Connection conn=null;  
				PreparedStatement pstmt=null;
				String sql="select id,name,age from student where id=?";
				Class.forName(DBDRIVER);
				//• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
				conn=(Connection) DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
				//打印结果com.mysql.jdbc.Connection@465863	
				System.out.println(conn);
				//• 第三步：进行数据表的CRUD操作，执行SQL；
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
		       ResultSet rs=pstmt.executeQuery();
		       if(rs.next()){
		    	   int id1=rs.getInt(1);
		    	   String name=rs.getString(2);
		    	   int age=rs.getInt(3);
		    	   System.out.println(id1+","+name+","+age+" ");
		       }else{
		    	   System.out.println("没有查询到结果");
		       }
				//• 第四步：关闭数据库连接。
				conn.close();		
	}
    //模糊查询
    
    public void queryClear() throws Exception{
    	
    	//待查询的关键字
		String keyWord = "o" ;
		String sql = "SELECT id,name,age FROM student  WHERE name LIKE ?";
		Connection conn = null; // 每一个Connection对象表示一个数据库连接
		PreparedStatement pstmt = null; // 数据库操作对象
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
		pstmt = conn.prepareStatement(sql) ;	// 执行了SQL
		pstmt.setString(1, "%" + keyWord + "%"); // 在执行之前设置内容
		ResultSet rs = pstmt.executeQuery() ;	// 查询操作
		while (rs.next()) {	// 查询出来就显示
			int id = rs.getInt(1) ;
			String name = rs.getString(2) ;
			int age = rs.getInt(3) ;
			System.out.println(id + "，" + name + "，" + age );
		}
		pstmt.close(); // 关闭操作，如果不关闭操作，关闭连接也是一样的
		conn.close(); // 关闭连接
	}
    
    //模糊查询后的分页操作
    public void Tabpage() throws Exception{
    	String column = "name" ;
		String keyWord = "a" ;
		int currentPage = 1 ;	// 当前所在页
		int lineSize = 2 ;	// 每页显示的长度
		String sql = " SELECT * FROM ( "
				+ " SELECT id,name,age,ROWNUM rn FROM student WHERE "
				+ column + " LIKE ? AND rn<=?) temp " + " WHERE temp.rn>? ";
		Connection conn = null; // 每一个Connection对象表示一个数据库连接
		PreparedStatement pstmt = null; // 数据库操作对象
		Class.forName(DBDRIVER);
		//• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
		conn=(Connection) DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		//打印结果com.mysql.jdbc.Connection@465863	
		System.out.println(conn);
		pstmt = conn.prepareStatement(sql) ;	// 执行了SQL
		pstmt.setString(1, "%" + keyWord + "%"); // 在执行之前设置内容
		pstmt.setInt(2, currentPage * lineSize) ;
		pstmt.setInt(3, (currentPage - 1) * lineSize);
		ResultSet rs = pstmt.executeQuery() ;	// 查询操作
		while (rs.next()) {	// 查询出来就显示
			int id = rs.getInt(1) ;
			String name = rs.getString(2) ;
			int age = rs.getInt(3) ;
			System.out.println(id + "，" + name + "，" + age );
		}
		pstmt.close(); // 关闭操作，如果不关闭操作，关闭连接也是一样的
		conn.close(); // 关闭连接    	
    }
    
    public void countId() throws Exception{
    	String column = "name" ;
		String keyWord = "" ;
		String sql = " SELECT COUNT(id) FROM student WHERE " + column
				+ " LIKE ? ";
		Connection conn = null; // 每一个Connection对象表示一个数据库连接
		PreparedStatement pstmt = null; // 数据库操作对象
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
		pstmt = conn.prepareStatement(sql) ;	// 执行了SQL
		pstmt.setString(1, "%" + keyWord + "%"); // 在执行之前设置内容
		ResultSet rs = pstmt.executeQuery() ;	// 查询操作
		if (rs.next()) {	// 一定会有内容返回
			int count = rs.getInt(1) ;
			System.out.println(count);
		}
		pstmt.close(); // 关闭操作，如果不关闭操作，关闭连接也是一样的
		conn.close(); // 关闭连接

    	
    	
    }
    /**
     * 
     * 所谓的批处理指的是数据库可以一次性的执行多条SQL语句。所以在JDBC 2.0之后，对于Statement和PreparedStatement接口都有了一些新的方法：
		• Statement接口增加了两个方法：
			|- 增加一个执行的SQL：public void addBatch(String sql) throws SQLException，没有执行；
			|- 一次性执行多条SQL：public int[] executeBatch() throws SQLException；
		• PreparedStatement接口增加了一个方法：
			|- 增加执行的SQL：public void addBatch() throws SQLException。

     */
    public void batchQuery() throws Exception{
    	
	}

    

}

