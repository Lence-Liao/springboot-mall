package com.example.demo.Dao;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Product;

@Repository
@Transactional
public   interface ProductDao extends CrudRepository<Product, Integer> {
	
}
