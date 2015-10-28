package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfMemberMapper;
import cn.znnf.model.ZnnfMember;
import cn.znnf.model.ZnnfMemberExample;

@Service
public class ZnnfMemberService{
	
	@Resource
	private ZnnfMemberMapper znnfMemberMapper;
	
	public void addZnnfMember(ZnnfMember znnfMember) {
		znnfMemberMapper.insertSelective(znnfMember);
	}
	
	public void delZnnfMemberById(Integer id) {
		znnfMemberMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfMemberByExample(ZnnfMember znnfMember,ZnnfMemberExample znnfMemberExample) {
		znnfMemberMapper.updateByExampleSelective(znnfMember,znnfMemberExample);
	}
	
	public void updateZnnfMember(ZnnfMember znnfMember) {
		znnfMemberMapper.updateByPrimaryKeySelective(znnfMember);
	}
	
	public ZnnfMember getZnnfMemberById(Integer id) {
		return znnfMemberMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfMember> getPageZnnfMember(ZnnfMemberExample znnfMemberExample) {
		return znnfMemberMapper.selectPage(znnfMemberExample);
	}
	
	public int countZnnfMember(ZnnfMemberExample znnfMemberExample) {
		return znnfMemberMapper.countByExample(znnfMemberExample);
	}
	
	public List<ZnnfMember> selectByExample(ZnnfMemberExample example) {
		return znnfMemberMapper.selectByExample(example);
	}
}
