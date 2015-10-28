package cn.znnf.mapper;

import cn.znnf.model.ZnnfMember;
import cn.znnf.model.ZnnfMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfMemberMapper {
    int countByExample(ZnnfMemberExample example);

    int deleteByExample(ZnnfMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfMember record);

    int insertSelective(ZnnfMember record);

    List<ZnnfMember> selectByExample(ZnnfMemberExample example);

    ZnnfMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfMember record, @Param("example") ZnnfMemberExample example);

    int updateByExample(@Param("record") ZnnfMember record, @Param("example") ZnnfMemberExample example);

    int updateByPrimaryKeySelective(ZnnfMember record);

    int updateByPrimaryKey(ZnnfMember record);

    List<ZnnfMember> selectPage(ZnnfMemberExample example);
}