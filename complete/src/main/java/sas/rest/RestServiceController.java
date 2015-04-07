package sas.rest;

import sas.dao.CustomerData;
import sas.dao.DataNavigationTreeData;
import sas.dao.ProjectNavigationTreeData;
import sas.daoimpl.ICommonDao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
public class RestServiceController {

    /**
     * Please use below method for sample at the time of generating other rest implementations
     * */
    /*@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }*/
    
	
    @RequestMapping("/projectnavigationtreerestservice")
    public List<ProjectNavigationTreeData> projectnavigationtreerestservice(){

    	List<ProjectNavigationTreeData> projectNavigationTreeDataList = new ArrayList<ProjectNavigationTreeData>();
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ICommonDao personDAO = context.getBean(ICommonDao.class);
    	
    	List<ProjectNavigationTreeData> list = personDAO.getProjectNavigationTreeDatalist();
    	
    	for(ProjectNavigationTreeData projectNavigationTreeData : list){
    		// if we need we can add validation here
    		projectNavigationTreeDataList.add(projectNavigationTreeData);
    	}
    	//close resources
    	
    	context.close();
    	return projectNavigationTreeDataList;
    }
    
    @RequestMapping("/datanavigationtreeservice")
    public List<DataNavigationTreeData> datanavigationtreerestservice(HttpServletRequest request){
    	
    	List<DataNavigationTreeData> dataNavigationTreeDataList = new ArrayList<DataNavigationTreeData>();
    	
    	System.out.println(request.getSession().getAttribute("userid"));
    	if(request.getSession().getAttribute("userid")==null || request.getSession().getAttribute("userid").equals("0")){
    		return dataNavigationTreeDataList;
    	}
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ICommonDao personDAO = context.getBean(ICommonDao.class);
    	
    	List<DataNavigationTreeData> list = personDAO.getDataNavigationTreeDatalist();
    	
    	for(DataNavigationTreeData projectNavigationTreeData : list){
    		// if we need we can add validation here
    		dataNavigationTreeDataList.add(projectNavigationTreeData);
    	}
    	//close resources
    	
    	context.close();
    	
    	return dataNavigationTreeDataList;
    }
    
    @RequestMapping("/validateCustomer")
    public CustomerData validateCustomer(HttpServletRequest request,@RequestParam(value="username") String username,@RequestParam(value="password") String password){
    	
    	CustomerData customerData = new CustomerData();
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ICommonDao personDAO = context.getBean(ICommonDao.class);
    	
    	CustomerData customerDetailsData = personDAO.getCustomerData(username, password);
    	
    	if(customerDetailsData!=null){
    		customerData=customerDetailsData;
    		request.getSession().setAttribute("userid",String.valueOf(customerData.getID()));
    		System.out.println(request.getSession().getAttribute("userid"));
    	}
    	context.close();
    	
    	return customerData;
    }
    
    //implementation is pending
    /*@RequestMapping("/datanavigationtreeservice")*/
    
}
