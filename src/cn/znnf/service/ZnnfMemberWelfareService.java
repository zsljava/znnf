package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfMemberWelfareMapper;
import cn.znnf.model.ZnnfMemberWelfare;
import cn.znnf.model.ZnnfMemberWelfareExample;

@Service
public class ZnnfMemberWelfareService{
	
	@Resource
	private ZnnfMemberWelfareMapper znnfMemberWelfareMapper;
	
	public void addZnnfMemberWelfare(ZnnfMemberWelfare znnfMemberWelfare) {
		znnfMemberWelfareMapper.insertSelective(znnfMemberWelfare);
	}
	
	public void delZnnfMemberWelfareById(Integer id) {
		znnfMemberWelfareMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfMemberWelfareByExample(ZnnfMemberWelfare znnfMemberWelfare,ZnnfMemberWelfareExample znnfMemberWelfareExample) {
		znnfMemberWelfareMapper.updateByExampleSelective(znnfMemberWelfare,znnfMemberWelfareExample);
	}
	
	public void updateZnnfMemberWelfare(ZnnfMemberWelfare znnfMemberWelfare) {
		znnfMemberWelfareMapper.updateByPrimaryKeySelective(znnfMemberWelfare);
	}
	
	public ZnnfMemberWelfare getZnnfMemberWelfareById(Integer id) {
		return znnfMemberWelfareMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfMemberWelfare> getPageZnnfMemberWelfare(ZnnfMemberWelfareExample znnfMemberWelfareExample) {
		return znnfMemberWelfareMapper.selectPage(znnfMemberWelfareExample);
	}
	
	public int countZnnfMemberWelfare(ZnnfMemberWelfareExample znnfMemberWelfareExample) {
		return znnfMemberWelfareMapper.countByExample(znnfMemberWelfareExample);
	}
	
	public List<ZnnfMemberWelfare> selectByExample(ZnnfMemberWelfareExample example) {
		return znnfMemberWelfareMapper.selectByExample(example);
	}
}
