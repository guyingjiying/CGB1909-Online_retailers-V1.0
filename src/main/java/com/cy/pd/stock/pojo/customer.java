package com.cy.pd.stock.pojo;

import lombok.Data;

@Data
public class customer {
	/*
	 * 顾客id
	 */
	private int Cust_id;
	/*
	 * 顾客姓名
	 */
	private String Cust_name;
	/*
	 * 顾客地址
	 */
	private String Cust_add;
	/*
	 * 顾客电话
	 */
	private int Cust_tel;
	/*
	 * 顾客备注
	 */
	private String Cust_remark;
}
