package com.example.demo.controller;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.Form;
import com.example.demo.form.FormFile;
import com.example.demo.model.File;
import com.example.demo.model.FileType;
import com.example.demo.service.FileService;

@Controller
@RequestMapping("/file")
public class FileController {
	@Autowired
	FileService fileService;

	public void init(Model model) {
		// ファイル種別の一覧を取得する
		List<FileType> fileTypes = fileService.getFileTypes();
		// ファイル種別IDからファイル種別名へのHashMapを作成する
		HashMap<Integer, String> fileTypeIdToFileTypeName = new HashMap<>();
		fileTypes.forEach((fileType) -> {
			fileTypeIdToFileTypeName.put(fileType.getTYPE_ID(), fileType.getNAME());
		});

		// ファイルの一覧を取得する
		List<File> files = fileService.getFiles();
		// ファイル種別IDからファイルへのHashMapを作成する
		HashMap<Integer, File> fileTypeIdToFile = new HashMap<>();
		files.forEach((file) -> {
			fileTypeIdToFile.put(file.getTYPE_ID(), file);
		});

		model.addAttribute("fileTypeIdToFileTypeName", fileTypeIdToFileTypeName);
		model.addAttribute("fileTypeIdToFile", fileTypeIdToFile);
	}

	public void initForm(Model model) {
		// ファイル種別の一覧を取得する
		List<FileType> fileTypes = fileService.getFileTypes();

		// フォームの項目のリストを作成する
		List<FormFile> formFiles = new ArrayList<>();
		fileTypes.forEach((fileType) -> {
			FormFile formFile = new FormFile();
			formFile.setTypeId(fileType.getTYPE_ID());
			formFiles.add(formFile);
		});

		// フォームを作成する
		Form form = new Form();
		form.setFormFiles(formFiles);

		model.addAttribute("form", form);
	}

	@GetMapping
	public String index(Model model) {
		init(model);
		initForm(model);
		return "index";
	}

	@PostMapping()
	public String update(Model model, Form form) {
		// TODO: ファイル名などのバリデーションを行う

		fileService.save(form.getFormFiles());

		init(model);
		initForm(model);

		return "index";
	}

	@GetMapping("/{typeId}")
	public ResponseEntity<InputStreamResource> downloadFile(@PathVariable Integer typeId) {
		File file = fileService.getFile(typeId);

		InputStream inputStream = file.getCONTENT();
		InputStreamResource resource = new InputStreamResource(inputStream);

		String filename = file.getNAME();

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentDisposition(
				ContentDisposition.builder("attachment").filename(filename, StandardCharsets.UTF_8).build());
		return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_OCTET_STREAM).body(resource);
	}
}
