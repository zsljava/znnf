package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfPermissionMapper;
import cn.znnf.model.ZnnfPermission;
import cn.znnf.model.ZnnfPermissionExample;

@Service
public class ZnnfPermissionService{
	
	@Resource
	private ZnnfPermissionMapper znnfPermissionMapper;
	
	public void addZnnfPermission(ZnnfPermission znnfPermission) {
		znnfPermissionMapper.insertSelective(znnfPermission);
	}
	
	public void delZnnfPermissionById(Integer id) {
		znnfPermissionMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfPermissionByExample(ZnnfPermission znnfPermission,ZnnfPermissionExample znnfPermissionExample) {
		znnfPermissionMapper.updateByExampleSelective(znnfPermission,znnfPermissionExample);
	}
	
	public void updateZnnfPermission(ZnnfPermission znnfPermission) {
		znnfPermissionMapper.updateByPrimaryKeySelective(znnfPermission);
	}
	
	public ZnnfPermission getZnnfPermissionById(Integer id) {
		return znnfPermissionMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfPermission> getPageZnnfPermission(ZnnfPermissionExample znnfPermissionExample) {
		return znnfPermissionMapper.selectPage(znnfPermissionExample);
	}
	
	public int countZnnfPermission(ZnnfPermissionExample znnfPermissionExample) {
		return znnfPermissionMapper.countByExample(znnfPermissionExample);
	}
	
	public List<ZnnfPermission> selectByExample(ZnnfPermissionExample example) {
		return znnfPermissionMapper.selectByExample(example);
	}
}
