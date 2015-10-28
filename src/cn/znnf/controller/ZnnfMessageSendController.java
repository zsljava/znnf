package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfMessageSendService;
import cn.znnf.model.ZnnfMessageSend;
import cn.znnf.model.ZnnfMessageSendExample;

@Controller
public class ZnnfMessageSendController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfMessageSend/list.do";
	
	@Resource
	private ZnnfMessageSendService znnfMessageSendService;
	
	@RequestMapping("/znnfMessageSend/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfMessageSendExample znnfMessageSendExample = new ZnnfMessageSendExample();
		int totalCount = znnfMessageSendService.countZnnfMessageSend(znnfMessageSendExample);
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
		znnfMessageSendExample.setPageIndex((pageNum - 1) * pageSize);
		znnfMessageSendExample.setPageSize(pageSize);
		List<ZnnfMessageSend> znnfMessageSends = znnfMessageSendService.getPageZnnfMessageSend(znnfMessageSendExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfMessageSends", znnfMessageSends);
		return "/ZnnfMessageSend/list";
	}
	
	@RequestMapping("/znnfMessageSend/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfMessageSend/add";
	}

	@RequestMapping("/znnfMessageSend/add")
	public String add(Model model, @ModelAttribute("znnfMessageSend") ZnnfMessageSend znnfMessageSend) {
		znnfMessageSendService.addZnnfMessageSend(znnfMessageSend);
		return redirect;
	}

	@RequestMapping("/znnfMessageSend/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfMessageSendService.delZnnfMessageSendById(id);
		return redirect;
	}

	@RequestMapping("/znnfMessageSend/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMessageSend znnfMessageSend = znnfMessageSendService.getZnnfMessageSendById(id);
		model.addAttribute("znnfMessageSend", znnfMessageSend);
		return "/ZnnfMessageSend/edit";
	}

	@RequestMapping("/znnfMessageSend/edit")
	public String edit(Model model, @ModelAttribute("znnfMessageSend") ZnnfMessageSend znnfMessageSend) {
		znnfMessageSendService.updateZnnfMessageSend(znnfMessageSend);
		return redirect;
	}

	@RequestMapping("/znnfMessageSend/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfMessageSend znnfMessageSend = znnfMessageSendService.getZnnfMessageSendById(id);
		model.addAttribute("znnfMessageSend", znnfMessageSend);
		return "/ZnnfMessageSend/view";
	}
}
