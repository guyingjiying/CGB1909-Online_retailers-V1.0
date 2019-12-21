package com.cy.pd.stock.pojo;
import java.util.Date;
import lombok.Data;
/**
 * 出库登记表的封装
 * @author 44734
 *
 */
@Data
public class output {
	//
	private Integer Id;
    //商品编号
	private Integer CommodityId;
    //出库数量
	private Integer OutputNumber;
	//商品名称
	private String CommodityName;
	//商品规格
	private String CommoditySpecification;
	//备注
	private String Comment;
	//出库时间
	private Date OutputTime;

}
