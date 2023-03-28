package com.example.demo.Dao.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Model.Product;

import com.example.demo.rowmapper.ProductRowMapper;

@Component
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private NamedParameterJdbcTemplate namedParemeterJdbcTemplate;
	
	@Override
	public Product getProductById(Integer productId) {
		String sql="select productId,product_name, category,"
				+ " image_url, price, stock, description, "
				+ "created_date, last_modified_date "
				+ "where productId=:productId";
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("productId", productId);
		
		List<Product> productList=namedParemeterJdbcTemplate.query(sql,map,new ProductRowMapper());
		if(productList.size()>0) {
			return productList.get(0);
		}else {
			return null;
		}
	}
}
