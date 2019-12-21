package com.cy.pd.stock.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cy.pd.common.vo.JsonResult;
import com.cy.pd.stock.pojo.output;
import com.cy.pd.stock.service.PdOutputService;

@Controller
@RequestMapping("/output/")
public class PdOutputController {
	@Autowired
	private PdOutputService pdOutputService;
	
	@RequestMapping("doOutputList")
	public String doUserList(){
		return "pd/output_list";
	} 
	@RequestMapping("doOutputEditUI")
	public String deEditUI(){
		return "pd/output_edit";
	}
	
	
	@RequestMapping("doUpdateObject")
	@ResponseBody
	public JsonResult doUpdateObject(output entity) throws Exception{
		System.out.println("controller："+entity);
		//System.out.println("浏览器接收名称："+entity.getName());
		pdOutputService.updateObject(entity);
		return new JsonResult("添加成功");
	}
	
	@RequestMapping("doDeleteObject")
	@ResponseBody
	public JsonResult doDeleteObject(Integer...ids){
		pdOutputService.deleteObjects(ids);
		return new JsonResult("删除成功");
	}
	
	@ResponseBody
	@RequestMapping("doInsertObject")
	public JsonResult doInsertObject(output output) {
		pdOutputService.insertObject(output);
		return new JsonResult("添加成功");
	}
	
	/**
	 * 页面数据显示
	 * @param Commodity_name
	 * @param pageCurrent
	 * @return
	 */
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String Commodity_name,
			                            Integer pageCurrent) {
			 return new JsonResult(
					 pdOutputService.findPageObjects(Commodity_name,
						                             pageCurrent));
		 }
	
	

}
