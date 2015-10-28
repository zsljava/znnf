package cn.znnf.mapper;

import cn.znnf.model.ZnnfMessageFeedback;
import cn.znnf.model.ZnnfMessageFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfMessageFeedbackMapper {
    int countByExample(ZnnfMessageFeedbackExample example);

    int deleteByExample(ZnnfMessageFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfMessageFeedback record);

    int insertSelective(ZnnfMessageFeedback record);

    List<ZnnfMessageFeedback> selectByExample(ZnnfMessageFeedbackExample example);

    ZnnfMessageFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfMessageFeedback record, @Param("example") ZnnfMessageFeedbackExample example);

    int updateByExample(@Param("record") ZnnfMessageFeedback record, @Param("example") ZnnfMessageFeedbackExample example);

    int updateByPrimaryKeySelective(ZnnfMessageFeedback record);

    int updateByPrimaryKey(ZnnfMessageFeedback record);

    List<ZnnfMessageFeedback> selectPage(ZnnfMessageFeedbackExample example);
}