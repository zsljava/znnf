package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfWebsiteTitleService;
import cn.znnf.model.ZnnfWebsiteTitle;
import cn.znnf.model.ZnnfWebsiteTitleExample;

@Controller
public class ZnnfWebsiteTitleController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfWebsiteTitle/list.do";
	
	@Resource
	private ZnnfWebsiteTitleService znnfWebsiteTitleService;
	
	@RequestMapping("/znnfWebsiteTitle/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfWebsiteTitleExample znnfWebsiteTitleExample = new ZnnfWebsiteTitleExample();
		int totalCount = znnfWebsiteTitleService.countZnnfWebsiteTitle(znnfWebsiteTitleExample);
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
		znnfWebsiteTitleExample.setPageIndex((pageNum - 1) * pageSize);
		znnfWebsiteTitleExample.setPageSize(pageSize);
		List<ZnnfWebsiteTitle> znnfWebsiteTitles = znnfWebsiteTitleService.getPageZnnfWebsiteTitle(znnfWebsiteTitleExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfWebsiteTitles", znnfWebsiteTitles);
		return "/ZnnfWebsiteTitle/list";
	}
	
	@RequestMapping("/znnfWebsiteTitle/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfWebsiteTitle/add";
	}

	@RequestMapping("/znnfWebsiteTitle/add")
	public String add(Model model, @ModelAttribute("znnfWebsiteTitle") ZnnfWebsiteTitle znnfWebsiteTitle) {
		znnfWebsiteTitleService.addZnnfWebsiteTitle(znnfWebsiteTitle);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteTitle/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfWebsiteTitleService.delZnnfWebsiteTitleById(id);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteTitle/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfWebsiteTitle znnfWebsiteTitle = znnfWebsiteTitleService.getZnnfWebsiteTitleById(id);
		model.addAttribute("znnfWebsiteTitle", znnfWebsiteTitle);
		return "/ZnnfWebsiteTitle/edit";
	}

	@RequestMapping("/znnfWebsiteTitle/edit")
	public String edit(Model model, @ModelAttribute("znnfWebsiteTitle") ZnnfWebsiteTitle znnfWebsiteTitle) {
		znnfWebsiteTitleService.updateZnnfWebsiteTitle(znnfWebsiteTitle);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteTitle/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfWebsiteTitle znnfWebsiteTitle = znnfWebsiteTitleService.getZnnfWebsiteTitleById(id);
		model.addAttribute("znnfWebsiteTitle", znnfWebsiteTitle);
		return "/ZnnfWebsiteTitle/view";
	}
}
