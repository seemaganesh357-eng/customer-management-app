package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@Column(name="cust_id")
	private int custId;
	@Column(name="cust_name")
	private String custName;
	@Column(name="cust_add")
	private String custAdd;
}
