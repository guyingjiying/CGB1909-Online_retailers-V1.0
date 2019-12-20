package com.cy.pd.stock.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class commodity {
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
	 * 商品类别
	 */
	private String Category;
	/*
	 * 商品规格
	 */
	private String Commodity_specification;
	/*
	 * 商品编号
	 */
	private int Commodity_number;
	/*
	 * 购入价格
	 */
	private double Purchase_price;
	/*
	 * 卖出价格
	 */
	private double Selling_price;
	/*
	 * 折扣价格
	 */
	private double Trade_price;
	/*
	 * 预警价格
	 */
	private double Alert_discount_price;
	/*
	 * 库存上限
	 */
	private int Inventory_ceiling;
	/*
	 * 库存下限
	 */
	private int Lower_limit_of_inventory;
	/*
	 * 供货商
	 */
	private String Supplier;
	/*
	 * 生产日期
	 */
	private Date Date_of_manufacture;
	/*
	 * 保质期
	 */
	private int Quality_guarantee_period;
	/*
	 * 预警日期
	 */
	private Date Expiration_date;
	/*
	 * 商品状态
	 */
	private String Commodity_status;
	/*
	 * 商品描述
	 */
	private String Commodity_description;
}
