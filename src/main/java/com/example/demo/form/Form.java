package com.example.demo.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Form {
	private List<FormFile> formFiles = new ArrayList<>();
}
