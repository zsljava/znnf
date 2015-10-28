package cn.znnf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.znnf.mapper.ZnnfMessageFeedbackMapper;
import cn.znnf.model.ZnnfMessageFeedback;
import cn.znnf.model.ZnnfMessageFeedbackExample;

@Service
public class ZnnfMessageFeedbackService{
	
	@Resource
	private ZnnfMessageFeedbackMapper znnfMessageFeedbackMapper;
	
	public void addZnnfMessageFeedback(ZnnfMessageFeedback znnfMessageFeedback) {
		znnfMessageFeedbackMapper.insertSelective(znnfMessageFeedback);
	}
	
	public void delZnnfMessageFeedbackById(Integer id) {
		znnfMessageFeedbackMapper.deleteByPrimaryKey(id);
	}
	
	public void updateZnnfMessageFeedbackByExample(ZnnfMessageFeedback znnfMessageFeedback,ZnnfMessageFeedbackExample znnfMessageFeedbackExample) {
		znnfMessageFeedbackMapper.updateByExampleSelective(znnfMessageFeedback,znnfMessageFeedbackExample);
	}
	
	public void updateZnnfMessageFeedback(ZnnfMessageFeedback znnfMessageFeedback) {
		znnfMessageFeedbackMapper.updateByPrimaryKeySelective(znnfMessageFeedback);
	}
	
	public ZnnfMessageFeedback getZnnfMessageFeedbackById(Integer id) {
		return znnfMessageFeedbackMapper.selectByPrimaryKey(id);
	}
	
	public List<ZnnfMessageFeedback> getPageZnnfMessageFeedback(ZnnfMessageFeedbackExample znnfMessageFeedbackExample) {
		return znnfMessageFeedbackMapper.selectPage(znnfMessageFeedbackExample);
	}
	
	public int countZnnfMessageFeedback(ZnnfMessageFeedbackExample znnfMessageFeedbackExample) {
		return znnfMessageFeedbackMapper.countByExample(znnfMessageFeedbackExample);
	}
	
	public List<ZnnfMessageFeedback> selectByExample(ZnnfMessageFeedbackExample example) {
		return znnfMessageFeedbackMapper.selectByExample(example);
	}
}
