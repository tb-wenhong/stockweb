package com.xiaosan.web.up;

/**
 * ɢ����Ϣ
 * @author Administrator
 *
 */
public class UserInfo implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//�û��ǳ�
	private String userName;
	//�Ϻ��ɶ�����
	private String shareholdersCodeSH;
	//��֤�ɶ�����
    private String shareholdersCodeSZ;
	//�ֻ�����
	private String mobilePhone;
	//�ʼ���ַ
	private String email;
	//΢��
	private String weixinID;
	
	private int age;
	
	private int sex;
	//ְҵ
	private String profession;
	//��ҵ
	private String industry;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getShareholdersCodeSH() {
		return shareholdersCodeSH;
	}

	public void setShareholdersCodeSH(String shareholdersCodeSH) {
		this.shareholdersCodeSH = shareholdersCodeSH;
	}

	public String getShareholdersCodeSZ() {
		return shareholdersCodeSZ;
	}

	public void setShareholdersCodeSZ(String shareholdersCodeSZ) {
		this.shareholdersCodeSZ = shareholdersCodeSZ;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeixinID() {
		return weixinID;
	}

	public void setWeixinID(String weixinID) {
		this.weixinID = weixinID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	

}
