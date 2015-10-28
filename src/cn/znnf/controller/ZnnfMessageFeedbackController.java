package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfMessageFeedbackService;
import cn.znnf.model.ZnnfMessageFeedback;
import cn.znnf.model.ZnnfMessageFeedbackExample;

@Controller
public class ZnnfMessageFeedbackController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfMessageFeedback/list.do";
	
	@Resource
	private ZnnfMessageFeedbackService znnfMessageFeedbackService;
	
	@RequestMapping("/znnfMessageFeedback/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfMessageFeedbackExample znnfMessageFeedbackExample = new ZnnfMessageFeedbackExample();
		int totalCount = znnfMessageFeedbackService.countZnnfMessageFeedback(znnfMessageFeedbackExample);
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
		znnfMessageFeedbackExample.setPageIndex((pageNum - 1) * pageSize);
		znnfMessageFeedbackExample.setPageSize(pageSize);
		List<ZnnfMessageFeedback> znnfMessageFeedbacks = znnfMessageFeedbackService.getPageZnnfMessageFeedback(znnfMessageFeedbackExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfMessageFeedbacks", znnfMessageFeedbacks);
		return "/ZnnfMessageFeedback/list";
	}
	
	@RequestMapping("/znnfMessageFeedback/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfMessageFeedback/add";
	}

	@RequestMapping("/znnfMessageFeedback/add")
	public String add(Model model, @ModelAttribute("znnfMessageFeedback") ZnnfMessageFeedback znnfMessageFeedback) {
		znnfMessageFeedbackService.addZnnfMessageFeedback(znnfMessageFeedback);
		return redirect;
	}

	@RequestMapping("/znnfMessageFeedback/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfMessageFeedbackService.delZnnfMessageFeedbackById(id);
		return redirect;
	}

	@RequestMapping("/znnfMessageFeedback/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMessageFeedback znnfMessageFeedback = znnfMessageFeedbackService.getZnnfMessageFeedbackById(id);
		model.addAttribute("znnfMessageFeedback", znnfMessageFeedback);
		return "/ZnnfMessageFeedback/edit";
	}

	@RequestMapping("/znnfMessageFeedback/edit")
	public String edit(Model model, @ModelAttribute("znnfMessageFeedback") ZnnfMessageFeedback znnfMessageFeedback) {
		znnfMessageFeedbackService.updateZnnfMessageFeedback(znnfMessageFeedback);
		return redirect;
	}

	@RequestMapping("/znnfMessageFeedback/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMessageFeedback znnfMessageFeedback = znnfMessageFeedbackService.getZnnfMessageFeedbackById(id);
		model.addAttribute("znnfMessageFeedback", znnfMessageFeedback);
		return "/ZnnfMessageFeedback/view";
	}
}
