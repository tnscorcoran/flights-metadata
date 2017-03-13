package com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getHeader() {
		return header;
	}

	private long id;
	private String content;
	private String header;
	
	public Greeting() {
		super();
	}

	public Greeting(long id, String content, String header) {
		super();
		this.id = id;
		this.content = content;
		this.header = header;
	}
    

}
