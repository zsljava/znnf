package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfPermissionService;
import cn.znnf.model.ZnnfPermission;
import cn.znnf.model.ZnnfPermissionExample;

@Controller
public class ZnnfPermissionController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfPermission/list.do";
	
	@Resource
	private ZnnfPermissionService znnfPermissionService;
	
	@RequestMapping("/znnfPermission/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfPermissionExample znnfPermissionExample = new ZnnfPermissionExample();
		int totalCount = znnfPermissionService.countZnnfPermission(znnfPermissionExample);
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
		znnfPermissionExample.setPageIndex((pageNum - 1) * pageSize);
		znnfPermissionExample.setPageSize(pageSize);
		List<ZnnfPermission> znnfPermissions = znnfPermissionService.getPageZnnfPermission(znnfPermissionExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfPermissions", znnfPermissions);
		return "/ZnnfPermission/list";
	}
	
	@RequestMapping("/znnfPermission/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfPermission/add";
	}

	@RequestMapping("/znnfPermission/add")
	public String add(Model model, @ModelAttribute("znnfPermission") ZnnfPermission znnfPermission) {
		znnfPermissionService.addZnnfPermission(znnfPermission);
		return redirect;
	}

	@RequestMapping("/znnfPermission/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfPermissionService.delZnnfPermissionById(id);
		return redirect;
	}

	@RequestMapping("/znnfPermission/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfPermission znnfPermission = znnfPermissionService.getZnnfPermissionById(id);
		model.addAttribute("znnfPermission", znnfPermission);
		return "/ZnnfPermission/edit";
	}

	@RequestMapping("/znnfPermission/edit")
	public String edit(Model model, @ModelAttribute("znnfPermission") ZnnfPermission znnfPermission) {
		znnfPermissionService.updateZnnfPermission(znnfPermission);
		return redirect;
	}

	@RequestMapping("/znnfPermission/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfPermission znnfPermission = znnfPermissionService.getZnnfPermissionById(id);
		model.addAttribute("znnfPermission", znnfPermission);
		return "/ZnnfPermission/view";
	}
}
