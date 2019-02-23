package com.lct;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

   int saveEmployee(Employee e) {

    //下面这个字符串查询语句必须在mysql查询语句中没有语法错误,注意单引号和双引号不用用错
    String query = "insert into employee values( '" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
    return jdbcTemplate.update(query);
  }

   int updateEmployee(Employee e) {
    //update employee set name='zhangsan',salary='10000.00' where id='1'
    String query = "update employee set name='" + e.getName() + "', salary='" + e.getSalary() + "'where id='" + e.getId() + "' ";
    return jdbcTemplate.update(query);
  }

   int deleteEmployee(Employee e) {
    String query = "delete from employee where id='"+ e.getId() + "'";
    return jdbcTemplate.update(query);
  }

  //select 不能通过调用jdbcTemplate.update来实现?????报错
/* int selectEmployee(Employee e){
    String query="select name,salary from employee";
    return jdbcTemplate.update(query);
  }*/
}
