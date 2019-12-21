package com.cy.pd.common.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*基于此对象封装控制层对象的响应信息
 * 定义一个JsonResult以方便接收数据
 * 通过页面信息了解到state=1,message="ok"
 */
@Data
@NoArgsConstructor
public class JsonResult implements Serializable{

	private static final long serialVersionUID = 2080943344863436345L;

	/**状态码*/
	private int state=1;//1表示SUCCESS,0表示ERROR
	/**状态信息*/
	private String message="ok";
	/**正确数据*/
	private Object data;
	
	//有参的构造方法
	public JsonResult(String message){
		this.message=message;
	}
	/**一般查询时调用，封装查询结果*/
	public JsonResult(Object data) {
		this.data=data;
	}
	/**出现异常时时调用*/
	public JsonResult(Throwable t){
		this.state=0;
		this.message=t.getMessage();
	}
	
}
