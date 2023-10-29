package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "order_details", schema = "mall")
@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_detail_id")
	private Integer orderDetailId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order orderId;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="subtotal")
	private Integer subtotal;
	
	
}
