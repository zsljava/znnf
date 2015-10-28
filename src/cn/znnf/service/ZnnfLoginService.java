package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfLoginMapper;
import cn.znnf.model.ZnnfLogin;
import cn.znnf.model.ZnnfLoginExample;

@Service
public class ZnnfLoginService{
	
	@Resource
	private ZnnfLoginMapper znnfLoginMapper;
	
	public void addZnnfLogin(ZnnfLogin znnfLogin) {
		znnfLoginMapper.insertSelective(znnfLogin);
	}
	
	public void delZnnfLoginById(Integer id) {
		znnfLoginMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfLoginByExample(ZnnfLogin znnfLogin,ZnnfLoginExample znnfLoginExample) {
		znnfLoginMapper.updateByExampleSelective(znnfLogin,znnfLoginExample);
	}
	
	public void updateZnnfLogin(ZnnfLogin znnfLogin) {
		znnfLoginMapper.updateByPrimaryKeySelective(znnfLogin);
	}
	
	public ZnnfLogin getZnnfLoginById(Integer id) {
		return znnfLoginMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfLogin> getPageZnnfLogin(ZnnfLoginExample znnfLoginExample) {
		return znnfLoginMapper.selectPage(znnfLoginExample);
	}
	
	public int countZnnfLogin(ZnnfLoginExample znnfLoginExample) {
		return znnfLoginMapper.countByExample(znnfLoginExample);
	}
	
	public List<ZnnfLogin> selectByExample(ZnnfLoginExample example) {
		return znnfLoginMapper.selectByExample(example);
	}
}
