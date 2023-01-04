package com.example.demo.model;

import java.io.InputStream;

public class File {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file.TYPE_ID
	 * @mbg.generated
	 */
	private Integer TYPE_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file.NAME
	 * @mbg.generated
	 */
	private String NAME;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file.CONTENT
	 * @mbg.generated
	 */
	private InputStream CONTENT;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file.TYPE_ID
	 * @return  the value of file.TYPE_ID
	 * @mbg.generated
	 */
	public Integer getTYPE_ID() {
		return TYPE_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file.TYPE_ID
	 * @param TYPE_ID  the value for file.TYPE_ID
	 * @mbg.generated
	 */
	public void setTYPE_ID(Integer TYPE_ID) {
		this.TYPE_ID = TYPE_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file.NAME
	 * @return  the value of file.NAME
	 * @mbg.generated
	 */
	public String getNAME() {
		return NAME;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file.NAME
	 * @param NAME  the value for file.NAME
	 * @mbg.generated
	 */
	public void setNAME(String NAME) {
		this.NAME = NAME == null ? null : NAME.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file.CONTENT
	 * @return  the value of file.CONTENT
	 * @mbg.generated
	 */
	public InputStream getCONTENT() {
		return CONTENT;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file.CONTENT
	 * @param CONTENT  the value for file.CONTENT
	 * @mbg.generated
	 */
	public void setCONTENT(InputStream CONTENT) {
		this.CONTENT = CONTENT;
	}
}