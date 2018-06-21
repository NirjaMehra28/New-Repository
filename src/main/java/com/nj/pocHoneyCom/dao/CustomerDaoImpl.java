package com.nj.pocHoneyCom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nj.pocHoneyCom.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void saveCustomer(Customer customer) {
		
		
		System.out.println("in addFeedback " + customer);
		
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		if(customer !=null)
		{
			try {
				session.save(customer);
				tx.commit();
				session.close();
			} catch (Exception e) {
				
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}
		
	}


	@Override
	public Customer loginCustomer(Customer customer) {
	
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "from com.nj.pocHoneyCom.entity.Customer as c where c.cust_name=?";
		
		
		
		//List<Customer> customerList = query.getResultList();
		
		try {
			Query query = session.createQuery(hql);
			query.setParameter(1, customer.getCust_First_Name());
			customer = (Customer) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return customer;		
	}

	/* To get List of all customers */
	
	/**
	 *  @Override
   public List<User> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
	 **/
	
}
