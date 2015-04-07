package sas.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sas.dao.CustomerData;
import sas.dao.DataNavigationTreeData;
import sas.dao.ProjectNavigationTreeData;

public class CommonDaoImpl implements ICommonDao {

	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DataNavigationTreeData> getDataNavigationTreeDatalist() {
		// TODO Auto-generated method stub
				Session session = this.sessionFactory.openSession();
		        List<DataNavigationTreeData> personList = session.createQuery("from DataNavigationTreeData").list();
		        session.close();
		        return personList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProjectNavigationTreeData> getProjectNavigationTreeDatalist() {
		// TODO Auto-generated method stub
				Session session = this.sessionFactory.openSession();
		        List<ProjectNavigationTreeData> personList = session.createQuery("from ProjectNavigationTreeData").list();
		        session.close();
		        return personList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public CustomerData getCustomerData(String username,String password) {
		// TODO Auto-generated method stub
		String query = "from CustomerData where username='"+username+"' and password='"+password+"'";
		Session session = this.sessionFactory.openSession();
        CustomerData personList = (CustomerData) session.createQuery(query).uniqueResult();
        session.close();
        return personList;
	}

}
