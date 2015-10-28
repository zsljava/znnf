package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfMessageSendMapper;
import cn.znnf.model.ZnnfMessageSend;
import cn.znnf.model.ZnnfMessageSendExample;

@Service
public class ZnnfMessageSendService{
	
	@Resource
	private ZnnfMessageSendMapper znnfMessageSendMapper;
	
	public void addZnnfMessageSend(ZnnfMessageSend znnfMessageSend) {
		znnfMessageSendMapper.insertSelective(znnfMessageSend);
	}
	
	public void delZnnfMessageSendById(Integer id) {
		znnfMessageSendMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfMessageSendByExample(ZnnfMessageSend znnfMessageSend,ZnnfMessageSendExample znnfMessageSendExample) {
		znnfMessageSendMapper.updateByExampleSelective(znnfMessageSend,znnfMessageSendExample);
	}
	
	public void updateZnnfMessageSend(ZnnfMessageSend znnfMessageSend) {
		znnfMessageSendMapper.updateByPrimaryKeySelective(znnfMessageSend);
	}
	
	public ZnnfMessageSend getZnnfMessageSendById(Integer id) {
		return znnfMessageSendMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfMessageSend> getPageZnnfMessageSend(ZnnfMessageSendExample znnfMessageSendExample) {
		return znnfMessageSendMapper.selectPage(znnfMessageSendExample);
	}
	
	public int countZnnfMessageSend(ZnnfMessageSendExample znnfMessageSendExample) {
		return znnfMessageSendMapper.countByExample(znnfMessageSendExample);
	}
	
	public List<ZnnfMessageSend> selectByExample(ZnnfMessageSendExample example) {
		return znnfMessageSendMapper.selectByExample(example);
	}
}
