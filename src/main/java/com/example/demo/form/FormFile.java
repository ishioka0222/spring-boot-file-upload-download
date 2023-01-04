package com.example.demo.form;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FormFile {
	private Integer typeId;
	private Boolean isDeleted = false;
	private MultipartFile multipartFile;
}
