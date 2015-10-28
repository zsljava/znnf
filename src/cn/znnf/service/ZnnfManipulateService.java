package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfManipulateMapper;
import cn.znnf.model.ZnnfManipulate;
import cn.znnf.model.ZnnfManipulateExample;

@Service
public class ZnnfManipulateService{
	
	@Resource
	private ZnnfManipulateMapper znnfManipulateMapper;
	
	public void addZnnfManipulate(ZnnfManipulate znnfManipulate) {
		znnfManipulateMapper.insertSelective(znnfManipulate);
	}
	
	public void delZnnfManipulateById(Integer id) {
		znnfManipulateMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfManipulateByExample(ZnnfManipulate znnfManipulate,ZnnfManipulateExample znnfManipulateExample) {
		znnfManipulateMapper.updateByExampleSelective(znnfManipulate,znnfManipulateExample);
	}
	
	public void updateZnnfManipulate(ZnnfManipulate znnfManipulate) {
		znnfManipulateMapper.updateByPrimaryKeySelective(znnfManipulate);
	}
	
	public ZnnfManipulate getZnnfManipulateById(Integer id) {
		return znnfManipulateMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfManipulate> getPageZnnfManipulate(ZnnfManipulateExample znnfManipulateExample) {
		return znnfManipulateMapper.selectPage(znnfManipulateExample);
	}
	
	public int countZnnfManipulate(ZnnfManipulateExample znnfManipulateExample) {
		return znnfManipulateMapper.countByExample(znnfManipulateExample);
	}
	
	public List<ZnnfManipulate> selectByExample(ZnnfManipulateExample example) {
		return znnfManipulateMapper.selectByExample(example);
	}
}
