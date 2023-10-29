package com.example.demo.Model;

import java.util.Date;

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
@Entity
@Table(name = "orders", schema = "mall")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer orderId;
	
	 @ManyToOne
	 @JoinColumn(name = "user_id") 
	  private User user;
	
	@Column(name="order_date")
	private Date ordDate;
	
	@Column(name="status",length=45)
	private String status;
	
	@Column(name="total_amount",length=45)
	private Integer totalAmount;

}
