package sas.daoimpl;

import java.util.List;

import sas.dao.CustomerData;
import sas.dao.DataNavigationTreeData;
import sas.dao.ProjectNavigationTreeData;

public interface ICommonDao {

	List<DataNavigationTreeData> getDataNavigationTreeDatalist();
	List<ProjectNavigationTreeData> getProjectNavigationTreeDatalist();
	CustomerData getCustomerData(String username,String password);
}
