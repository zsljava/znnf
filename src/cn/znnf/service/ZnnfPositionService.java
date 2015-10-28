package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfPositionMapper;
import cn.znnf.model.ZnnfPosition;
import cn.znnf.model.ZnnfPositionExample;

@Service
public class ZnnfPositionService{
	
	@Resource
	private ZnnfPositionMapper znnfPositionMapper;
	
	public void addZnnfPosition(ZnnfPosition znnfPosition) {
		znnfPositionMapper.insertSelective(znnfPosition);
	}
	
	public void delZnnfPositionById(Integer id) {
		znnfPositionMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfPositionByExample(ZnnfPosition znnfPosition,ZnnfPositionExample znnfPositionExample) {
		znnfPositionMapper.updateByExampleSelective(znnfPosition,znnfPositionExample);
	}
	
	public void updateZnnfPosition(ZnnfPosition znnfPosition) {
		znnfPositionMapper.updateByPrimaryKeySelective(znnfPosition);
	}
	
	public ZnnfPosition getZnnfPositionById(Integer id) {
		return znnfPositionMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfPosition> getPageZnnfPosition(ZnnfPositionExample znnfPositionExample) {
		return znnfPositionMapper.selectPage(znnfPositionExample);
	}
	
	public int countZnnfPosition(ZnnfPositionExample znnfPositionExample) {
		return znnfPositionMapper.countByExample(znnfPositionExample);
	}
	
	public List<ZnnfPosition> selectByExample(ZnnfPositionExample example) {
		return znnfPositionMapper.selectByExample(example);
	}
}
