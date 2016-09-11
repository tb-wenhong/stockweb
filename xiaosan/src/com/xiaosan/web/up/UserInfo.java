package com.xiaosan.web.up;

/**
 * 散户信息
 * @author Administrator
 *
 */
public class UserInfo implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//用户昵称
	private String userName;
	//上海股东代码
	private String shareholdersCodeSH;
	//深证股东代码
    private String shareholdersCodeSZ;
	//手机号码
	private String mobilePhone;
	//邮件地址
	private String email;
	//微信
	private String weixinID;
	
	private int age;
	
	private int sex;
	//职业
	private String profession;
	//行业
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
