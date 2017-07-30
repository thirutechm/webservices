package com.thiru.techm.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long id;
	private String name;
	private Date date;
	private String author;
	
	public Message()
	{
		
	}
	/**
	 * @param id
	 * @param name
	 * @param author
	 */
	public Message(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.date =  new Date();
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
