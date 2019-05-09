package com.walmart.chile.ims.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@Table(name = "IMS_CHANNELS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Channels implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CHANNEL") 
	private String channel;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Channels [Channel=" + channel + "]";
	}
}
