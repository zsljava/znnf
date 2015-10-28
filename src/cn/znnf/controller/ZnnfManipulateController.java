package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfManipulateService;
import cn.znnf.model.ZnnfManipulate;
import cn.znnf.model.ZnnfManipulateExample;

@Controller
public class ZnnfManipulateController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfManipulate/list.do";
	
	@Resource
	private ZnnfManipulateService znnfManipulateService;
	
	@RequestMapping("/znnfManipulate/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfManipulateExample znnfManipulateExample = new ZnnfManipulateExample();
		int totalCount = znnfManipulateService.countZnnfManipulate(znnfManipulateExample);
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
		znnfManipulateExample.setPageIndex((pageNum - 1) * pageSize);
		znnfManipulateExample.setPageSize(pageSize);
		List<ZnnfManipulate> znnfManipulates = znnfManipulateService.getPageZnnfManipulate(znnfManipulateExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfManipulates", znnfManipulates);
		return "/ZnnfManipulate/list";
	}
	
	@RequestMapping("/znnfManipulate/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfManipulate/add";
	}

	@RequestMapping("/znnfManipulate/add")
	public String add(Model model, @ModelAttribute("znnfManipulate") ZnnfManipulate znnfManipulate) {
		znnfManipulateService.addZnnfManipulate(znnfManipulate);
		return redirect;
	}

	@RequestMapping("/znnfManipulate/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfManipulateService.delZnnfManipulateById(id);
		return redirect;
	}

	@RequestMapping("/znnfManipulate/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfManipulate znnfManipulate = znnfManipulateService.getZnnfManipulateById(id);
		model.addAttribute("znnfManipulate", znnfManipulate);
		return "/ZnnfManipulate/edit";
	}

	@RequestMapping("/znnfManipulate/edit")
	public String edit(Model model, @ModelAttribute("znnfManipulate") ZnnfManipulate znnfManipulate) {
		znnfManipulateService.updateZnnfManipulate(znnfManipulate);
		return redirect;
	}

	@RequestMapping("/znnfManipulate/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfManipulate znnfManipulate = znnfManipulateService.getZnnfManipulateById(id);
		model.addAttribute("znnfManipulate", znnfManipulate);
		return "/ZnnfManipulate/view";
	}
}
