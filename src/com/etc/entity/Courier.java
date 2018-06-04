package com.etc.entity;

public class Courier {
	private int COURIERNO;//快递员编号,工号
	private String COURIERREGION;//区域(分部)
	private String COURIERNAME;//快递员姓名
	private String COURIERTEL;//快递员联系电话
	private int COURIERSTATE;//0 表示在职 1 表示离职
	private String COURIERCREATE;//建档时间
	private String COURIERMODIFIED;//修改时间
	
	public Courier() {
		super();
	}
	
	/**
	 * 建档需要的字段.新增的时候调用这个就行
	 * @param cOURIERNO 工号(手动填写,需要先验证.根据工号查询这个人)
	 * @param cOURIERREGION 区域(这个先放着.先暴力写入吧)
	 * @param cOURIERNAME 员工姓名
	 * @param cOURIERTEL 员工电话
	 */
	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERTEL) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERTEL = cOURIERTEL;
	}


	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERTEL, int cOURIERSTATE,
			String cOURIERCREATE, String cOURIERMODIFIED) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERTEL = cOURIERTEL;
		COURIERSTATE = cOURIERSTATE;
		COURIERCREATE = cOURIERCREATE;
		COURIERMODIFIED = cOURIERMODIFIED;
	}


	public int getCOURIERNO() {
		return COURIERNO;
	}
	public void setCOURIERNO(int cOURIERNO) {
		COURIERNO = cOURIERNO;
	}
	public String getCOURIERREGION() {
		return COURIERREGION;
	}
	public void setCOURIERREGION(String cOURIERREGION) {
		COURIERREGION = cOURIERREGION;
	}
	public String getCOURIERNAME() {
		return COURIERNAME;
	}
	public void setCOURIERNAME(String cOURIERNAME) {
		COURIERNAME = cOURIERNAME;
	}
	public String getCOURIERTEL() {
		return COURIERTEL;
	}
	public void setCOURIERTEL(String cOURIERTEL) {
		COURIERTEL = cOURIERTEL;
	}
	public int getCOURIERSTATE() {
		return COURIERSTATE;
	}
	public void setCOURIERSTATE(int cOURIERSTATE) {
		COURIERSTATE = cOURIERSTATE;
	}
	public String getCOURIERCREATE() {
		return COURIERCREATE;
	}
	public void setCOURIERCREATE(String cOURIERCREATE) {
		COURIERCREATE = cOURIERCREATE;
	}
	public String getCOURIERMODIFIED() {
		return COURIERMODIFIED;
	}
	public void setCOURIERMODIFIED(String cOURIERMODIFIED) {
		COURIERMODIFIED = cOURIERMODIFIED;
	}
	
}
