package cn.znnf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.znnf.service.ZnnfPositionService;
import cn.znnf.model.ZnnfPosition;
import cn.znnf.model.ZnnfPositionExample;

@Controller
public class ZnnfPositionController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/znnfPosition/list.do";
	
	@Resource
	private ZnnfPositionService znnfPositionService;
	
	@RequestMapping("/znnfPosition/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		ZnnfPositionExample znnfPositionExample = new ZnnfPositionExample();
		int totalCount = znnfPositionService.countZnnfPosition(znnfPositionExample);
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
		znnfPositionExample.setPageIndex((pageNum - 1) * pageSize);
		znnfPositionExample.setPageSize(pageSize);
		List<ZnnfPosition> znnfPositions = znnfPositionService.getPageZnnfPosition(znnfPositionExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("znnfPositions", znnfPositions);
		return "/ZnnfPosition/list";
	}
	
	@RequestMapping("/znnfPosition/toAdd")
	public String toAdd(Model model) {
		return "/ZnnfPosition/add";
	}

	@RequestMapping("/znnfPosition/add")
	public String add(Model model, @ModelAttribute("znnfPosition") ZnnfPosition znnfPosition) {
		znnfPositionService.addZnnfPosition(znnfPosition);
		return redirect;
	}

	@RequestMapping("/znnfPosition/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		znnfPositionService.delZnnfPositionById(id);
		return redirect;
	}

	@RequestMapping("/znnfPosition/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfPosition znnfPosition = znnfPositionService.getZnnfPositionById(id);
		model.addAttribute("znnfPosition", znnfPosition);
		return "/ZnnfPosition/edit";
	}

	@RequestMapping("/znnfPosition/edit")
	public String edit(Model model, @ModelAttribute("znnfPosition") ZnnfPosition znnfPosition) {
		znnfPositionService.updateZnnfPosition(znnfPosition);
		return redirect;
	}

	@RequestMapping("/znnfPosition/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ZnnfPosition znnfPosition = znnfPositionService.getZnnfPositionById(id);
		model.addAttribute("znnfPosition", znnfPosition);
		return "/ZnnfPosition/view";
	}
}
