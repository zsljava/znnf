package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfMemberWelfareService;
import cn.znnf.model.ZnnfMemberWelfare;
import cn.znnf.model.ZnnfMemberWelfareExample;

@Controller
public class ZnnfMemberWelfareController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfMemberWelfare/list.do";
	
	@Resource
	private ZnnfMemberWelfareService znnfMemberWelfareService;
	
	@RequestMapping("/znnfMemberWelfare/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfMemberWelfareExample znnfMemberWelfareExample = new ZnnfMemberWelfareExample();
		int totalCount = znnfMemberWelfareService.countZnnfMemberWelfare(znnfMemberWelfareExample);
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
		znnfMemberWelfareExample.setPageIndex((pageNum - 1) * pageSize);
		znnfMemberWelfareExample.setPageSize(pageSize);
		List<ZnnfMemberWelfare> znnfMemberWelfares = znnfMemberWelfareService.getPageZnnfMemberWelfare(znnfMemberWelfareExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfMemberWelfares", znnfMemberWelfares);
		return "/ZnnfMemberWelfare/list";
	}
	
	@RequestMapping("/znnfMemberWelfare/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfMemberWelfare/add";
	}

	@RequestMapping("/znnfMemberWelfare/add")
	public String add(Model model, @ModelAttribute("znnfMemberWelfare") ZnnfMemberWelfare znnfMemberWelfare) {
		znnfMemberWelfareService.addZnnfMemberWelfare(znnfMemberWelfare);
		return redirect;
	}

	@RequestMapping("/znnfMemberWelfare/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfMemberWelfareService.delZnnfMemberWelfareById(id);
		return redirect;
	}

	@RequestMapping("/znnfMemberWelfare/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMemberWelfare znnfMemberWelfare = znnfMemberWelfareService.getZnnfMemberWelfareById(id);
		model.addAttribute("znnfMemberWelfare", znnfMemberWelfare);
		return "/ZnnfMemberWelfare/edit";
	}

	@RequestMapping("/znnfMemberWelfare/edit")
	public String edit(Model model, @ModelAttribute("znnfMemberWelfare") ZnnfMemberWelfare znnfMemberWelfare) {
		znnfMemberWelfareService.updateZnnfMemberWelfare(znnfMemberWelfare);
		return redirect;
	}

	@RequestMapping("/znnfMemberWelfare/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMemberWelfare znnfMemberWelfare = znnfMemberWelfareService.getZnnfMemberWelfareById(id);
		model.addAttribute("znnfMemberWelfare", znnfMemberWelfare);
		return "/ZnnfMemberWelfare/view";
	}
}
