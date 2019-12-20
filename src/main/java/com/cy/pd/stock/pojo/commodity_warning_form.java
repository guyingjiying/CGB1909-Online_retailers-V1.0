package com.cy.pd.stock.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class commodity_warning_form {
	/*
	 * 主键id
	 */
	private int Id;
	/*
	 * 商品id
	 */
	private int Commodity_id;
	/*
	 * 商品名称
	 */
	private String Commodity_name;
	/*
	 * 购买日期
	 */
	private Date Date_of_purchase;
	/*
	 * 商品编号
	 */
	private int Commodity_number;
	/*
	 * 过期时间
	 */
	private Date Expiration_date;
}
