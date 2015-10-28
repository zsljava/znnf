package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfCommissionerService;
import cn.znnf.model.ZnnfCommissioner;
import cn.znnf.model.ZnnfCommissionerExample;

@Controller
public class ZnnfCommissionerController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfCommissioner/list.do";
	
	@Resource
	private ZnnfCommissionerService znnfCommissionerService;
	
	@RequestMapping("/znnfCommissioner/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfCommissionerExample znnfCommissionerExample = new ZnnfCommissionerExample();
		int totalCount = znnfCommissionerService.countZnnfCommissioner(znnfCommissionerExample);
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
		znnfCommissionerExample.setPageIndex((pageNum - 1) * pageSize);
		znnfCommissionerExample.setPageSize(pageSize);
		List<ZnnfCommissioner> znnfCommissioners = znnfCommissionerService.getPageZnnfCommissioner(znnfCommissionerExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfCommissioners", znnfCommissioners);
		return "/ZnnfCommissioner/list";
	}
	
	@RequestMapping("/znnfCommissioner/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfCommissioner/add";
	}

	@RequestMapping("/znnfCommissioner/add")
	public String add(Model model, @ModelAttribute("znnfCommissioner") ZnnfCommissioner znnfCommissioner) {
		znnfCommissionerService.addZnnfCommissioner(znnfCommissioner);
		return redirect;
	}

	@RequestMapping("/znnfCommissioner/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfCommissionerService.delZnnfCommissionerById(id);
		return redirect;
	}

	@RequestMapping("/znnfCommissioner/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfCommissioner znnfCommissioner = znnfCommissionerService.getZnnfCommissionerById(id);
		model.addAttribute("znnfCommissioner", znnfCommissioner);
		return "/ZnnfCommissioner/edit";
	}

	@RequestMapping("/znnfCommissioner/edit")
	public String edit(Model model, @ModelAttribute("znnfCommissioner") ZnnfCommissioner znnfCommissioner) {
		znnfCommissionerService.updateZnnfCommissioner(znnfCommissioner);
		return redirect;
	}

	@RequestMapping("/znnfCommissioner/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfCommissioner znnfCommissioner = znnfCommissionerService.getZnnfCommissionerById(id);
		model.addAttribute("znnfCommissioner", znnfCommissioner);
		return "/ZnnfCommissioner/view";
	}
}
