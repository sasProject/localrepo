package sas.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tblmdatanavigationtree")
public class DataNavigationTreeData {
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getRIGHT_KEY() {
		return RIGHT_KEY;
	}

	public void setRIGHT_KEY(String rIGHT_KEY) {
		RIGHT_KEY = rIGHT_KEY;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getPARENT_ID() {
		return PARENT_ID;
	}

	public void setPARENT_ID(int pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}

	public String getPATH() {
		return PATH;
	}

	public void setPATH(String pATH) {
		PATH = pATH;
	}

	public String getPARAM() {
		return PARAM;
	}

	public void setPARAM(String pARAM) {
		PARAM = pARAM;
	}

	public String getICON() {
		return ICON;
	}

	public void setICON(String iCON) {
		ICON = iCON;
	}

	public String getPERSPECTIVE() {
		return PERSPECTIVE;
	}

	public void setPERSPECTIVE(String pERSPECTIVE) {
		PERSPECTIVE = pERSPECTIVE;
	}

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String RIGHT_KEY;
	private String NAME;
	private int PARENT_ID;
	private String PATH;
	private String PARAM;
	private String ICON;
	private String PERSPECTIVE;

	public DataNavigationTreeData(int ID,String RIGHT_KEY,String NAME,int PARENT_ID,String PATH,String PARAM,String ICON,String PERSPECTIVE){
		this.ID=ID;
		this.RIGHT_KEY=RIGHT_KEY;
		this.NAME=NAME;
		this.PARENT_ID=PARENT_ID;
		this.PATH=PATH;
		this.PARAM=PARAM;
		this.ICON=ICON;
		this.PERSPECTIVE=PERSPECTIVE;
	}
	
	public DataNavigationTreeData(){
		
	}
}
