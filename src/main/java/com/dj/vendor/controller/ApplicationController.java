package com.dj.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.vendor.dto.ResultData;
import com.dj.vendor.model.Category;
import com.dj.vendor.service.CategoryService;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping(value = "/categories")
	public ResponseEntity<ResultData> getAllCategories() {
		ResultData resultData = new ResultData();
		List<Category> categoryList = categoryService.getAllCategories();
		resultData.setMessage("Category List Fecthed Successfully");
		resultData.setSuccess(true);
		resultData.setData(categoryList);
		return new ResponseEntity<ResultData>(resultData, HttpStatus.OK);
	}
}
