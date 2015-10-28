package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfLoginService;
import cn.znnf.model.ZnnfLogin;
import cn.znnf.model.ZnnfLoginExample;

@Controller
public class ZnnfLoginController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfLogin/list.do";
	
	@Resource
	private ZnnfLoginService znnfLoginService;
	
	@RequestMapping("/znnfLogin/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfLoginExample znnfLoginExample = new ZnnfLoginExample();
		int totalCount = znnfLoginService.countZnnfLogin(znnfLoginExample);
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
		znnfLoginExample.setPageIndex((pageNum - 1) * pageSize);
		znnfLoginExample.setPageSize(pageSize);
		List<ZnnfLogin> znnfLogins = znnfLoginService.getPageZnnfLogin(znnfLoginExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfLogins", znnfLogins);
		return "/ZnnfLogin/list";
	}
	
	@RequestMapping("/znnfLogin/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfLogin/add";
	}

	@RequestMapping("/znnfLogin/add")
	public String add(Model model, @ModelAttribute("znnfLogin") ZnnfLogin znnfLogin) {
		znnfLoginService.addZnnfLogin(znnfLogin);
		return redirect;
	}

	@RequestMapping("/znnfLogin/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfLoginService.delZnnfLoginById(id);
		return redirect;
	}

	@RequestMapping("/znnfLogin/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfLogin znnfLogin = znnfLoginService.getZnnfLoginById(id);
		model.addAttribute("znnfLogin", znnfLogin);
		return "/ZnnfLogin/edit";
	}

	@RequestMapping("/znnfLogin/edit")
	public String edit(Model model, @ModelAttribute("znnfLogin") ZnnfLogin znnfLogin) {
		znnfLoginService.updateZnnfLogin(znnfLogin);
		return redirect;
	}

	@RequestMapping("/znnfLogin/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfLogin znnfLogin = znnfLoginService.getZnnfLoginById(id);
		model.addAttribute("znnfLogin", znnfLogin);
		return "/ZnnfLogin/view";
	}
}
