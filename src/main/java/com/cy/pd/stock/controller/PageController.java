package com.cy.pd.stock.controller;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		System.out.println("访问次数:"+atomicLong.incrementAndGet());
		return "index";
	}
	
	@RequestMapping("doIndexUI01")
	public String doIndexUI01() {
		System.out.println("访问次数:"+atomicLong.incrementAndGet());
		return "backstage_index";
	}
	
	/*
	 * 记录页面访问次数,此类型的对象线程安全?自己去查
	 * 底层CAS算法,基于cup性能
	 */
	private AtomicLong atomicLong=new AtomicLong(0);
		
		@RequestMapping("doPageUI")
		public String doPageUI() {
			return "common/page";
		}

}
