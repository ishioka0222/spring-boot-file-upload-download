package com.example.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.FileMapper;
import com.example.demo.dao.FileTypeMapper;
import com.example.demo.form.FormFile;
import com.example.demo.model.File;
import com.example.demo.model.FileExample;
import com.example.demo.model.FileType;
import com.example.demo.model.FileTypeExample;

@Service
public class FileService {
	@Autowired
	FileTypeMapper fileTypeMapper;

	@Autowired
	FileMapper fileMapper;

	public List<FileType> getFileTypes() {
		FileTypeExample example = new FileTypeExample();
		example.setOrderByClause("TYPE_ID ASC");
		return fileTypeMapper.selectByExample(example);
	}

	public File getFile(int typeId) {
		return fileMapper.selectByPrimaryKey(typeId);
	}

	public List<File> getFiles() {
		FileExample example = new FileExample();
		example.setOrderByClause("TYPE_ID ASC");
		return fileMapper.selectByExample(example);
	}

	public void save(List<FormFile> formFiles) {
		for (FormFile formFile : formFiles) {
			MultipartFile multipartFile = formFile.getMultipartFile();
			if (multipartFile.isEmpty()) {
				// アップロードするファイルがない場合
				if (formFile.getIsDeleted()) {
					// ファイルを削除する場合
					fileMapper.deleteByPrimaryKey(formFile.getTypeId());
				}
			} else {
				// アップロードするファイルがある場合
				try {
					String filename = multipartFile.getOriginalFilename();
					InputStream inputStream = multipartFile.getInputStream();

					File file = new File();
					file.setTYPE_ID(formFile.getTypeId());
					file.setNAME(filename);
					file.setCONTENT(inputStream);

					File existingFile = fileMapper.selectByPrimaryKey(formFile.getTypeId());
					if (existingFile == null) {
						// ファイルがない場合は新規登録
						fileMapper.insert(file);
					} else {
						// ファイルがある場合は更新
						fileMapper.updateByPrimaryKey(file);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
