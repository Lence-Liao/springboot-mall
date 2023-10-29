package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sys_user", schema = "mall")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	@Column(name="userName", length=45)
	private String userName;
	@Column(name="eMail", length=45)
	private String eMail;
	@Column(name="account", length=45)
	private String account;
	@Column(name="password", length=45)
	private String password;
	@Column(name="address", length=90)
	private String address;
	@Column(name="createOn", length=45)
	private Date createOn;
	
}
