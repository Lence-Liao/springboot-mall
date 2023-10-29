package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product", schema = "mall")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productId")
	private Integer productId;
	@Column(name="productName")
	private String productName;
	@Column(name="category")
	private String category;
	@Column(name="imageUrl")
	private String imageUrl;
	@Column(name="price")
	private Integer price;
	@Column(name="stock")
	private Integer stock;
	@Column(name="description")
	private String description;
	@Column(name="createDate")
	private Date createDate;
	@Column(name="lastModifiedDate")
	private Date lastModifiedDate;

}
