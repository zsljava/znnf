package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfManagerService;
import cn.znnf.model.ZnnfManager;
import cn.znnf.model.ZnnfManagerExample;

@Controller
public class ZnnfManagerController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfManager/list.do";
	
	@Resource
	private ZnnfManagerService znnfManagerService;
	
	@RequestMapping("/znnfManager/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfManagerExample znnfManagerExample = new ZnnfManagerExample();
		int totalCount = znnfManagerService.countZnnfManager(znnfManagerExample);
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
		znnfManagerExample.setPageIndex((pageNum - 1) * pageSize);
		znnfManagerExample.setPageSize(pageSize);
		List<ZnnfManager> znnfManagers = znnfManagerService.getPageZnnfManager(znnfManagerExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfManagers", znnfManagers);
		return "/ZnnfManager/list";
	}
	
	@RequestMapping("/znnfManager/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfManager/add";
	}

	@RequestMapping("/znnfManager/add")
	public String add(Model model, @ModelAttribute("znnfManager") ZnnfManager znnfManager) {
		znnfManagerService.addZnnfManager(znnfManager);
		return redirect;
	}

	@RequestMapping("/znnfManager/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfManagerService.delZnnfManagerById(id);
		return redirect;
	}

	@RequestMapping("/znnfManager/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfManager znnfManager = znnfManagerService.getZnnfManagerById(id);
		model.addAttribute("znnfManager", znnfManager);
		return "/ZnnfManager/edit";
	}

	@RequestMapping("/znnfManager/edit")
	public String edit(Model model, @ModelAttribute("znnfManager") ZnnfManager znnfManager) {
		znnfManagerService.updateZnnfManager(znnfManager);
		return redirect;
	}

	@RequestMapping("/znnfManager/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfManager znnfManager = znnfManagerService.getZnnfManagerById(id);
		model.addAttribute("znnfManager", znnfManager);
		return "/ZnnfManager/view";
	}
}
