package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfWebsiteContentMapper;
import cn.znnf.model.ZnnfWebsiteContent;
import cn.znnf.model.ZnnfWebsiteContentExample;

@Service
public class ZnnfWebsiteContentService{
	
	@Resource
	private ZnnfWebsiteContentMapper znnfWebsiteContentMapper;
	
	public void addZnnfWebsiteContent(ZnnfWebsiteContent znnfWebsiteContent) {
		znnfWebsiteContentMapper.insertSelective(znnfWebsiteContent);
	}
	
	public void delZnnfWebsiteContentById(Integer id) {
		znnfWebsiteContentMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfWebsiteContentByExample(ZnnfWebsiteContent znnfWebsiteContent,ZnnfWebsiteContentExample znnfWebsiteContentExample) {
		znnfWebsiteContentMapper.updateByExampleSelective(znnfWebsiteContent,znnfWebsiteContentExample);
	}
	
	public void updateZnnfWebsiteContent(ZnnfWebsiteContent znnfWebsiteContent) {
		znnfWebsiteContentMapper.updateByPrimaryKeySelective(znnfWebsiteContent);
	}
	
	public ZnnfWebsiteContent getZnnfWebsiteContentById(Integer id) {
		return znnfWebsiteContentMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfWebsiteContent> getPageZnnfWebsiteContent(ZnnfWebsiteContentExample znnfWebsiteContentExample) {
		return znnfWebsiteContentMapper.selectPage(znnfWebsiteContentExample);
	}
	
	public int countZnnfWebsiteContent(ZnnfWebsiteContentExample znnfWebsiteContentExample) {
		return znnfWebsiteContentMapper.countByExample(znnfWebsiteContentExample);
	}
	
	public List<ZnnfWebsiteContent> selectByExample(ZnnfWebsiteContentExample example) {
		return znnfWebsiteContentMapper.selectByExample(example);
	}
}
