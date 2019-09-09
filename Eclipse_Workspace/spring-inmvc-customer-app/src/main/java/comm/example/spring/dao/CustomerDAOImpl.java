package comm.example.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session currSession=sessionFactory.getCurrentSession();
		Query<Customer> theQuery=currSession.createQuery("from Customer order by lastName",Customer.class);
		List<Customer> customers=theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currSession=sessionFactory.getCurrentSession();
		currSession.save(theCustomer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session currSession=sessionFactory.getCurrentSession();
		Customer c=currSession.get(Customer.class,id);
		currSession.remove(c);
	}

}