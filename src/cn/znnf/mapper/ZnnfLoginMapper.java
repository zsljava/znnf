package cn.znnf.mapper;

import cn.znnf.model.ZnnfLogin;
import cn.znnf.model.ZnnfLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfLoginMapper {
    int countByExample(ZnnfLoginExample example);

    int deleteByExample(ZnnfLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfLogin record);

    int insertSelective(ZnnfLogin record);

    List<ZnnfLogin> selectByExample(ZnnfLoginExample example);

    ZnnfLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfLogin record, @Param("example") ZnnfLoginExample example);

    int updateByExample(@Param("record") ZnnfLogin record, @Param("example") ZnnfLoginExample example);

    int updateByPrimaryKeySelective(ZnnfLogin record);

    int updateByPrimaryKey(ZnnfLogin record);

    List<ZnnfLogin> selectPage(ZnnfLoginExample example);
}