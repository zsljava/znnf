package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfIntegrationOriginService;
import cn.znnf.model.ZnnfIntegrationOrigin;
import cn.znnf.model.ZnnfIntegrationOriginExample;

@Controller
public class ZnnfIntegrationOriginController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfIntegrationOrigin/list.do";
	
	@Resource
	private ZnnfIntegrationOriginService znnfIntegrationOriginService;
	
	@RequestMapping("/znnfIntegrationOrigin/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfIntegrationOriginExample znnfIntegrationOriginExample = new ZnnfIntegrationOriginExample();
		int totalCount = znnfIntegrationOriginService.countZnnfIntegrationOrigin(znnfIntegrationOriginExample);
		if(totalCount%pageSize == 0){
			maxPageNum = totalCount/pageSize;
		}else{
			maxPageNum = totalCount/pageSize+1;
		}
		if (pageNum == null || pageNum < 1) {
			pageNum = 1;
		}else {
			if(maxPageNum > 0 && pageNum > maxPageNum) {
				pageNum = maxPageNum;
			}
		}
		znnfIntegrationOriginExample.setPageIndex((pageNum - 1) * pageSize);
		znnfIntegrationOriginExample.setPageSize(pageSize);
		List<ZnnfIntegrationOrigin> znnfIntegrationOrigins = znnfIntegrationOriginService.getPageZnnfIntegrationOrigin(znnfIntegrationOriginExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfIntegrationOrigins", znnfIntegrationOrigins);
		return "/ZnnfIntegrationOrigin/list";
	}
	
	@RequestMapping("/znnfIntegrationOrigin/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfIntegrationOrigin/add";
	}

	@RequestMapping("/znnfIntegrationOrigin/add")
	public String add(Model model, @ModelAttribute("znnfIntegrationOrigin") ZnnfIntegrationOrigin znnfIntegrationOrigin) {
		znnfIntegrationOriginService.addZnnfIntegrationOrigin(znnfIntegrationOrigin);
		return redirect;
	}

	@RequestMapping("/znnfIntegrationOrigin/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfIntegrationOriginService.delZnnfIntegrationOriginById(id);
		return redirect;
	}

	@RequestMapping("/znnfIntegrationOrigin/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfIntegrationOrigin znnfIntegrationOrigin = znnfIntegrationOriginService.getZnnfIntegrationOriginById(id);
		model.addAttribute("znnfIntegrationOrigin", znnfIntegrationOrigin);
		return "/ZnnfIntegrationOrigin/edit";
	}

	@RequestMapping("/znnfIntegrationOrigin/edit")
	public String edit(Model model, @ModelAttribute("znnfIntegrationOrigin") ZnnfIntegrationOrigin znnfIntegrationOrigin) {
		znnfIntegrationOriginService.updateZnnfIntegrationOrigin(znnfIntegrationOrigin);
		return redirect;
	}

	@RequestMapping("/znnfIntegrationOrigin/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfIntegrationOrigin znnfIntegrationOrigin = znnfIntegrationOriginService.getZnnfIntegrationOriginById(id);
		model.addAttribute("znnfIntegrationOrigin", znnfIntegrationOrigin);
		return "/ZnnfIntegrationOrigin/view";
	}
}
