package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfCommissionerMapper;
import cn.znnf.model.ZnnfCommissioner;
import cn.znnf.model.ZnnfCommissionerExample;

@Service
public class ZnnfCommissionerService{
	
	@Resource
	private ZnnfCommissionerMapper znnfCommissionerMapper;
	
	public void addZnnfCommissioner(ZnnfCommissioner znnfCommissioner) {
		znnfCommissionerMapper.insertSelective(znnfCommissioner);
	}
	
	public void delZnnfCommissionerById(Integer id) {
		znnfCommissionerMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfCommissionerByExample(ZnnfCommissioner znnfCommissioner,ZnnfCommissionerExample znnfCommissionerExample) {
		znnfCommissionerMapper.updateByExampleSelective(znnfCommissioner,znnfCommissionerExample);
	}
	
	public void updateZnnfCommissioner(ZnnfCommissioner znnfCommissioner) {
		znnfCommissionerMapper.updateByPrimaryKeySelective(znnfCommissioner);
	}
	
	public ZnnfCommissioner getZnnfCommissionerById(Integer id) {
		return znnfCommissionerMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfCommissioner> getPageZnnfCommissioner(ZnnfCommissionerExample znnfCommissionerExample) {
		return znnfCommissionerMapper.selectPage(znnfCommissionerExample);
	}
	
	public int countZnnfCommissioner(ZnnfCommissionerExample znnfCommissionerExample) {
		return znnfCommissionerMapper.countByExample(znnfCommissionerExample);
	}
	
	public List<ZnnfCommissioner> selectByExample(ZnnfCommissionerExample example) {
		return znnfCommissionerMapper.selectByExample(example);
	}
}
