package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfManagerMapper;
import cn.znnf.model.ZnnfManager;
import cn.znnf.model.ZnnfManagerExample;

@Service
public class ZnnfManagerService{
	
	@Resource
	private ZnnfManagerMapper znnfManagerMapper;
	
	public void addZnnfManager(ZnnfManager znnfManager) {
		znnfManagerMapper.insertSelective(znnfManager);
	}
	
	public void delZnnfManagerById(Integer id) {
		znnfManagerMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfManagerByExample(ZnnfManager znnfManager,ZnnfManagerExample znnfManagerExample) {
		znnfManagerMapper.updateByExampleSelective(znnfManager,znnfManagerExample);
	}
	
	public void updateZnnfManager(ZnnfManager znnfManager) {
		znnfManagerMapper.updateByPrimaryKeySelective(znnfManager);
	}
	
	public ZnnfManager getZnnfManagerById(Integer id) {
		return znnfManagerMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfManager> getPageZnnfManager(ZnnfManagerExample znnfManagerExample) {
		return znnfManagerMapper.selectPage(znnfManagerExample);
	}
	
	public int countZnnfManager(ZnnfManagerExample znnfManagerExample) {
		return znnfManagerMapper.countByExample(znnfManagerExample);
	}
	
	public List<ZnnfManager> selectByExample(ZnnfManagerExample example) {
		return znnfManagerMapper.selectByExample(example);
	}
}
