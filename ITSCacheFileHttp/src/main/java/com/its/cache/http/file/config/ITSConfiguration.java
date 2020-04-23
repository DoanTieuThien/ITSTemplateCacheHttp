package com.its.cache.http.file.config;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.its.cache.http.file.filter.HttpFilterRequest;
import com.its.cache.http.file.models.FileModel;
import com.its.cache.http.file.utils.Tools;

@Configuration
public class ITSConfiguration {

	@Bean
	public Filter httpFilterRequest() {
		return new HttpFilterRequest();
	}

	@Bean("fileMap")
	public ConcurrentHashMap<String, FileModel> fileMap() {
		ConcurrentHashMap<String, FileModel> data = Tools.readAllFile("webapp/public");
		return data;
	}
}
