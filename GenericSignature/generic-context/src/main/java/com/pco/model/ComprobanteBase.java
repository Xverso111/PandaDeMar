package com.pco.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ComprobanteBase {
	private String id;
	private String version;

	// Getters && Setters
	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@XmlAttribute
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
