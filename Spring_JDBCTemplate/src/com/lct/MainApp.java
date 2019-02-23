package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    EmployeeDao  dao=ac.getBean("edao",EmployeeDao.class);


   int staus=dao.saveEmployee(new Employee(106,"Anna",17000));
    System.out.println(staus);

    //modify the data
    /*int status=dao.updateEmployee(new Employee(103, "Hunter", 1000));
    System.out.println(status);*/

    //delete the data bundled id,need to create a new Employee object,then call setId(int id) method.
    //when the value of parameter is given ,getId() method get the value and send it to the query statement.
/*    Employee employee=new Employee();
    employee.setId(105);
    dao.deleteEmployee(employee);*/

  }
}
