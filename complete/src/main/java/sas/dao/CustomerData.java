package sas.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TBLMCUSTOMERDATA")
public class CustomerData {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getNAME() {
		return NAME;
	}



	public void setNAME(String nAME) {
		NAME = nAME;
	}



	public int getPROJECT() {
		return PROJECT;
	}



	public void setPROJECT(int pROJECT) {
		PROJECT = pROJECT;
	}



	public int getDATA() {
		return DATA;
	}



	public void setDATA(int dATA) {
		DATA = dATA;
	}



	private String NAME;
	private int PROJECT;
	private int DATA;
	private String USERNAME;
	private String PASSWORD;

	public String getUSERNAME() {
		return USERNAME;
	}



	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}



	public String getPASSWORD() {
		return PASSWORD;
	}



	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}



	public CustomerData(int ID,String NAME,int PROJECT,int DATA,String USERNAME,String PASSWORD){
		this.ID=ID;
		this.NAME=NAME;
		this.PROJECT=PROJECT;
		this.DATA=DATA;
		this.USERNAME=USERNAME;
		this.PASSWORD=PASSWORD;
	}
	
	
	public CustomerData(){
		
	}
}
