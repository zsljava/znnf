package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfIntegrationOriginMapper;
import cn.znnf.model.ZnnfIntegrationOrigin;
import cn.znnf.model.ZnnfIntegrationOriginExample;

@Service
public class ZnnfIntegrationOriginService{
	
	@Resource
	private ZnnfIntegrationOriginMapper znnfIntegrationOriginMapper;
	
	public void addZnnfIntegrationOrigin(ZnnfIntegrationOrigin znnfIntegrationOrigin) {
		znnfIntegrationOriginMapper.insertSelective(znnfIntegrationOrigin);
	}
	
	public void delZnnfIntegrationOriginById(Integer id) {
		znnfIntegrationOriginMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfIntegrationOriginByExample(ZnnfIntegrationOrigin znnfIntegrationOrigin,ZnnfIntegrationOriginExample znnfIntegrationOriginExample) {
		znnfIntegrationOriginMapper.updateByExampleSelective(znnfIntegrationOrigin,znnfIntegrationOriginExample);
	}
	
	public void updateZnnfIntegrationOrigin(ZnnfIntegrationOrigin znnfIntegrationOrigin) {
		znnfIntegrationOriginMapper.updateByPrimaryKeySelective(znnfIntegrationOrigin);
	}
	
	public ZnnfIntegrationOrigin getZnnfIntegrationOriginById(Integer id) {
		return znnfIntegrationOriginMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfIntegrationOrigin> getPageZnnfIntegrationOrigin(ZnnfIntegrationOriginExample znnfIntegrationOriginExample) {
		return znnfIntegrationOriginMapper.selectPage(znnfIntegrationOriginExample);
	}
	
	public int countZnnfIntegrationOrigin(ZnnfIntegrationOriginExample znnfIntegrationOriginExample) {
		return znnfIntegrationOriginMapper.countByExample(znnfIntegrationOriginExample);
	}
	
	public List<ZnnfIntegrationOrigin> selectByExample(ZnnfIntegrationOriginExample example) {
		return znnfIntegrationOriginMapper.selectByExample(example);
	}
}
