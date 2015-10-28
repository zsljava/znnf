package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfWebsiteContentService;
import cn.znnf.model.ZnnfWebsiteContent;
import cn.znnf.model.ZnnfWebsiteContentExample;

@Controller
public class ZnnfWebsiteContentController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfWebsiteContent/list.do";
	
	@Resource
	private ZnnfWebsiteContentService znnfWebsiteContentService;
	
	@RequestMapping("/znnfWebsiteContent/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfWebsiteContentExample znnfWebsiteContentExample = new ZnnfWebsiteContentExample();
		int totalCount = znnfWebsiteContentService.countZnnfWebsiteContent(znnfWebsiteContentExample);
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
		znnfWebsiteContentExample.setPageIndex((pageNum - 1) * pageSize);
		znnfWebsiteContentExample.setPageSize(pageSize);
		List<ZnnfWebsiteContent> znnfWebsiteContents = znnfWebsiteContentService.getPageZnnfWebsiteContent(znnfWebsiteContentExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfWebsiteContents", znnfWebsiteContents);
		return "/ZnnfWebsiteContent/list";
	}
	
	@RequestMapping("/znnfWebsiteContent/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfWebsiteContent/add";
	}

	@RequestMapping("/znnfWebsiteContent/add")
	public String add(Model model, @ModelAttribute("znnfWebsiteContent") ZnnfWebsiteContent znnfWebsiteContent) {
		znnfWebsiteContentService.addZnnfWebsiteContent(znnfWebsiteContent);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteContent/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfWebsiteContentService.delZnnfWebsiteContentById(id);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteContent/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfWebsiteContent znnfWebsiteContent = znnfWebsiteContentService.getZnnfWebsiteContentById(id);
		model.addAttribute("znnfWebsiteContent", znnfWebsiteContent);
		return "/ZnnfWebsiteContent/edit";
	}

	@RequestMapping("/znnfWebsiteContent/edit")
	public String edit(Model model, @ModelAttribute("znnfWebsiteContent") ZnnfWebsiteContent znnfWebsiteContent) {
		znnfWebsiteContentService.updateZnnfWebsiteContent(znnfWebsiteContent);
		return redirect;
	}

	@RequestMapping("/znnfWebsiteContent/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfWebsiteContent znnfWebsiteContent = znnfWebsiteContentService.getZnnfWebsiteContentById(id);
		model.addAttribute("znnfWebsiteContent", znnfWebsiteContent);
		return "/ZnnfWebsiteContent/view";
	}
}
