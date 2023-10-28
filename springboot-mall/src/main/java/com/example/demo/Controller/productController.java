package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

import net.bytebuddy.asm.Advice.Return;

@RestController
public class productController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String  index() {
		System.out.println("test");
		return "myPageTemplate";
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
		System.out.println(productId);
//	    Product product = productService.getProductById(productId);

//	    if (product != null) {
//	        System.out.println(product.getProductName());
//	        return ResponseEntity.status(HttpStatus.OK).body(product);
//	    } else {
//	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//	    }
		return null;
	}

	@GetMapping("/product")
	public String test() {
		String product = productService.getProductById();
		System.out.println(product);
		return product;
	}
	
}
