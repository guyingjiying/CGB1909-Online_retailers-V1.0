package com.cy.pd.stock.pojo;

import lombok.Data;

@Data
public class classify {
	/*
	 * 类别
	 */
	private String Category;
	/*
	 * 库存上限
	 */
	private int Inventory_ceiling;
	/*
	 * 库存下限
	 */
	private int Lower_limit_of_inventory;
	/*
	 * 过期的
	 */
	private int Stale;
	/*
	 * 将要过期的
	 */
	private int Immediately_stale;
	/*
	 * 过期预警
	 */
	private int Stale_early_warning;
}
