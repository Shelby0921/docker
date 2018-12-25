package com.xxk.SpringBootTest.pojo;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3275775199784568748L;
	private Integer uid;
	private String uName;
	private String uPassWord;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassWord() {
		return uPassWord;
	}
	public void setuPassWord(String uPassWord) {
		this.uPassWord = uPassWord;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uName=" + uName + ", uPassWord=" + uPassWord + "]";
	}
}
