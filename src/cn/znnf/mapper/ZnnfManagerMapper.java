package cn.znnf.mapper;

import cn.znnf.model.ZnnfManager;
import cn.znnf.model.ZnnfManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfManagerMapper {
    int countByExample(ZnnfManagerExample example);

    int deleteByExample(ZnnfManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfManager record);

    int insertSelective(ZnnfManager record);

    List<ZnnfManager> selectByExample(ZnnfManagerExample example);

    ZnnfManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfManager record, @Param("example") ZnnfManagerExample example);

    int updateByExample(@Param("record") ZnnfManager record, @Param("example") ZnnfManagerExample example);

    int updateByPrimaryKeySelective(ZnnfManager record);

    int updateByPrimaryKey(ZnnfManager record);

    List<ZnnfManager> selectPage(ZnnfManagerExample example);
}