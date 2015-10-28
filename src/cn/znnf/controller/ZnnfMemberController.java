package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfMemberService;
import cn.znnf.model.ZnnfMember;
import cn.znnf.model.ZnnfMemberExample;

@Controller
public class ZnnfMemberController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfMember/list.do";
	
	@Resource
	private ZnnfMemberService znnfMemberService;
	
	@RequestMapping("/znnfMember/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfMemberExample znnfMemberExample = new ZnnfMemberExample();
		int totalCount = znnfMemberService.countZnnfMember(znnfMemberExample);
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
		znnfMemberExample.setPageIndex((pageNum - 1) * pageSize);
		znnfMemberExample.setPageSize(pageSize);
		List<ZnnfMember> znnfMembers = znnfMemberService.getPageZnnfMember(znnfMemberExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfMembers", znnfMembers);
		return "/ZnnfMember/list";
	}
	
	@RequestMapping("/znnfMember/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfMember/add";
	}

	@RequestMapping("/znnfMember/add")
	public String add(Model model, @ModelAttribute("znnfMember") ZnnfMember znnfMember) {
		znnfMemberService.addZnnfMember(znnfMember);
		return redirect;
	}

	@RequestMapping("/znnfMember/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfMemberService.delZnnfMemberById(id);
		return redirect;
	}

	@RequestMapping("/znnfMember/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMember znnfMember = znnfMemberService.getZnnfMemberById(id);
		model.addAttribute("znnfMember", znnfMember);
		return "/ZnnfMember/edit";
	}

	@RequestMapping("/znnfMember/edit")
	public String edit(Model model, @ModelAttribute("znnfMember") ZnnfMember znnfMember) {
		znnfMemberService.updateZnnfMember(znnfMember);
		return redirect;
	}

	@RequestMapping("/znnfMember/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMember znnfMember = znnfMemberService.getZnnfMemberById(id);
		model.addAttribute("znnfMember", znnfMember);
		return "/ZnnfMember/view";
	}
}
