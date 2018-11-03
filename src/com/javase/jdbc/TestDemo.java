/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 * @titleTestDemo.java
 * @author taojian
 * @date2016-11-11上午10:48:36
 *       第一步：加载数据库驱动程序；
		• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
		• 第三步：进行数据表的CRUD操作，执行SQL；
		• 第四步：关闭数据库连接。

 */
public class TestDemo {
    
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
		Statement stmt=null;
		Class.forName(DBDRIVER);
		//• 第二步：通过DriverManager类根据指定的属性内容连接数据库；
		conn=(Connection) DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		//打印结果com.mysql.jdbc.Connection@465863	
		System.out.println(conn);
		//• 第三步：进行数据表的CRUD操作，执行SQL；
		stmt=(Statement) conn.createStatement();
		//创造stmt的接口对象
		/**
		
		String sql="insert into student (id,name,age) values(2,'张三',16)";
		int len=stmt.executeUpdate(sql);
		System.out.println("更新的行数"+len);
		*/
		String sql="select id,name,age from student";
		ResultSet rs = stmt.executeQuery(sql) ;	// 查询
		while (rs.next()) {
			int id = rs.getInt("id") ;
			String name = rs.getString("name") ;
			int age = rs.getInt("age") ;
		
			System.out.println(id + "，" + name + "，" + age );
		}

		//• 第四步：关闭数据库连接。
		conn.close();
	}

}
