package cn.znnf.mapper;

import cn.znnf.model.ZnnfMessageSend;
import cn.znnf.model.ZnnfMessageSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfMessageSendMapper {
    int countByExample(ZnnfMessageSendExample example);

    int deleteByExample(ZnnfMessageSendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfMessageSend record);

    int insertSelective(ZnnfMessageSend record);

    List<ZnnfMessageSend> selectByExample(ZnnfMessageSendExample example);

    ZnnfMessageSend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfMessageSend record, @Param("example") ZnnfMessageSendExample example);

    int updateByExample(@Param("record") ZnnfMessageSend record, @Param("example") ZnnfMessageSendExample example);

    int updateByPrimaryKeySelective(ZnnfMessageSend record);

    int updateByPrimaryKey(ZnnfMessageSend record);

    List<ZnnfMessageSend> selectPage(ZnnfMessageSendExample example);
}