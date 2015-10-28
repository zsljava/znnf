package cn.znnf.mapper;

import cn.znnf.model.ZnnfMemberWelfare;
import cn.znnf.model.ZnnfMemberWelfareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfMemberWelfareMapper {
    int countByExample(ZnnfMemberWelfareExample example);

    int deleteByExample(ZnnfMemberWelfareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfMemberWelfare record);

    int insertSelective(ZnnfMemberWelfare record);

    List<ZnnfMemberWelfare> selectByExample(ZnnfMemberWelfareExample example);

    ZnnfMemberWelfare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfMemberWelfare record, @Param("example") ZnnfMemberWelfareExample example);

    int updateByExample(@Param("record") ZnnfMemberWelfare record, @Param("example") ZnnfMemberWelfareExample example);

    int updateByPrimaryKeySelective(ZnnfMemberWelfare record);

    int updateByPrimaryKey(ZnnfMemberWelfare record);

    List<ZnnfMemberWelfare> selectPage(ZnnfMemberWelfareExample example);
}