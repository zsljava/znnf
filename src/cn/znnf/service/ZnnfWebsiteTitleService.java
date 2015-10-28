package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfWebsiteTitleMapper;
import cn.znnf.model.ZnnfWebsiteTitle;
import cn.znnf.model.ZnnfWebsiteTitleExample;

@Service
public class ZnnfWebsiteTitleService{
	
	@Resource
	private ZnnfWebsiteTitleMapper znnfWebsiteTitleMapper;
	
	public void addZnnfWebsiteTitle(ZnnfWebsiteTitle znnfWebsiteTitle) {
		znnfWebsiteTitleMapper.insertSelective(znnfWebsiteTitle);
	}
	
	public void delZnnfWebsiteTitleById(Integer id) {
		znnfWebsiteTitleMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfWebsiteTitleByExample(ZnnfWebsiteTitle znnfWebsiteTitle,ZnnfWebsiteTitleExample znnfWebsiteTitleExample) {
		znnfWebsiteTitleMapper.updateByExampleSelective(znnfWebsiteTitle,znnfWebsiteTitleExample);
	}
	
	public void updateZnnfWebsiteTitle(ZnnfWebsiteTitle znnfWebsiteTitle) {
		znnfWebsiteTitleMapper.updateByPrimaryKeySelective(znnfWebsiteTitle);
	}
	
	public ZnnfWebsiteTitle getZnnfWebsiteTitleById(Integer id) {
		return znnfWebsiteTitleMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfWebsiteTitle> getPageZnnfWebsiteTitle(ZnnfWebsiteTitleExample znnfWebsiteTitleExample) {
		return znnfWebsiteTitleMapper.selectPage(znnfWebsiteTitleExample);
	}
	
	public int countZnnfWebsiteTitle(ZnnfWebsiteTitleExample znnfWebsiteTitleExample) {
		return znnfWebsiteTitleMapper.countByExample(znnfWebsiteTitleExample);
	}
	
	public List<ZnnfWebsiteTitle> selectByExample(ZnnfWebsiteTitleExample example) {
		return znnfWebsiteTitleMapper.selectByExample(example);
	}
}
