package com.etc.entity;

public class Courier {
	private int COURIERNO;//���Ա���,����
	private String COURIERREGION;//����(�ֲ�)
	private String COURIERNAME;//���Ա����
	private String COURIERTEL;//���Ա��ϵ�绰
	private int COURIERSTATE;//0 ��ʾ��ְ 1 ��ʾ��ְ
	private String COURIERCREATE;//����ʱ��
	private String COURIERMODIFIED;//�޸�ʱ��
	
	public Courier() {
		super();
	}
	
	/**
	 * ������Ҫ���ֶ�.������ʱ������������
	 * @param cOURIERNO ����(�ֶ���д,��Ҫ����֤.���ݹ��Ų�ѯ�����)
	 * @param cOURIERREGION ����(����ȷ���.�ȱ���д���)
	 * @param cOURIERNAME Ա������
	 * @param cOURIERTEL Ա���绰
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
