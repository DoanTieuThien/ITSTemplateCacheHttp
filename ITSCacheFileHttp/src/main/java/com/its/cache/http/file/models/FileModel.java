package com.its.cache.http.file.models;

import java.io.Serializable;

import org.springframework.http.MediaType;

public class FileModel implements Serializable {
	private String fileName;
	private String contentType;
	private byte[] data;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
