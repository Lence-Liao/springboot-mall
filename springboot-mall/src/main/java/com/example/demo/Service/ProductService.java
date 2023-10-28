package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Model.Product;

@Service
public class ProductService {
	
	@Autowired ProductDao productDao;
	
	public String getProductById() {
		
			List<Product> product = (List<Product>) productDao.findAll();
			product.get(0).getProductName();
			return product.get(0).getProductName();
	}
}
