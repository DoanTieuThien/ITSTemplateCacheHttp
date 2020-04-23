package com.its.cache.http.file.utils;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;

import com.its.cache.http.file.models.FileModel;

public class Tools {
	public static ConcurrentHashMap<String, FileModel> readAllFile(String folderPath) {
		ConcurrentHashMap<String, FileModel> data = new ConcurrentHashMap<String, FileModel>();
		try {
			File file = new File(folderPath);
			File[] listFile = file.listFiles();

			for (File f : listFile) {
				if (f.isDirectory()) {
					data.putAll(readAllFile(f.getAbsolutePath()));
					continue;
				}
				FileModel fileModel = new FileModel();
				String fileName = f.getName();

				fileModel.setFileName(fileName);
				if (fileName.endsWith(".jpg")) {
					fileModel.setContentType(MediaType.IMAGE_JPEG_VALUE);
				} else if (fileName.endsWith(".png")) {
					fileModel.setContentType(MediaType.IMAGE_PNG_VALUE);
				} else if (fileName.endsWith(".gif")) {
					fileModel.setContentType(MediaType.IMAGE_GIF_VALUE);
				} else if (fileName.endsWith(".css") || fileName.endsWith(".scss")) {
					fileModel.setContentType("text/css");
				} else if (fileName.endsWith(".js")) {
					fileModel.setContentType("application/javascript");
				} else {
					fileModel.setContentType("");
				}
				fileModel.setData(FileUtils.readFileToByteArray(f));
				data.put(fileName, fileModel);
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return data;
	}
}
