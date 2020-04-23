package com.its.cache.http.file.controller;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.cache.http.file.models.FileModel;

@RestController
@RequestMapping("/public")
public class FileController {

	@Autowired
	@Qualifier("fileMap")
	private ConcurrentHashMap<String, FileModel> fileMap = null;

	@GetMapping(value = "/file")
	public void requestImageFile(HttpServletResponse response, @RequestParam("fileName") String fileName) {
		try {
			String fileNameTemp = Optional.ofNullable(fileName).orElse("").trim();
			if ("".equals(fileNameTemp)) {
				response.setStatus(404);
				return;
			}
			if (!this.fileMap.containsKey(fileNameTemp)) {
				response.setStatus(404);
				return;
			}
			FileModel fileModel = this.fileMap.get(fileNameTemp);
			response.setContentType(fileModel.getContentType());
			response.getOutputStream().write(fileModel.getData());
			response.getOutputStream().flush();
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	@GetMapping(value = "/hello")
	public @ResponseBody String hello() {
		return "hello";
	}
}
