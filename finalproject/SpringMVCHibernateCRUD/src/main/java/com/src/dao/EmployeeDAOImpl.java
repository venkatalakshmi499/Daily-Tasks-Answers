package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.src.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(EmployeeDAOImpl.class);
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

		logger.info("Employee saved successfully");
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		return sessionFactory.getCurrentSession().createQuery("from Employee")
				.list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
				Employee.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(
				Employee.class, empid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}


@Override
public boolean userValidate(Employee employee) {
	
	Session session=sessionFactory.getCurrentSession();
	
	Query que=session.createQuery("from Employee where name=:u and email=:p");
	
	que.setParameter("u", employee.getName());
	que.setParameter("p", employee.getEmail());
	
	List list=que.list();
	
	boolean b=list.isEmpty();
	
	if(!b)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
}
		
	
	
