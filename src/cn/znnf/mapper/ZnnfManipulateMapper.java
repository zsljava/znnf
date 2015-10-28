package cn.znnf.mapper;

import cn.znnf.model.ZnnfManipulate;
import cn.znnf.model.ZnnfManipulateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfManipulateMapper {
    int countByExample(ZnnfManipulateExample example);

    int deleteByExample(ZnnfManipulateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfManipulate record);

    int insertSelective(ZnnfManipulate record);

    List<ZnnfManipulate> selectByExample(ZnnfManipulateExample example);

    ZnnfManipulate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfManipulate record, @Param("example") ZnnfManipulateExample example);

    int updateByExample(@Param("record") ZnnfManipulate record, @Param("example") ZnnfManipulateExample example);

    int updateByPrimaryKeySelective(ZnnfManipulate record);

    int updateByPrimaryKey(ZnnfManipulate record);

    List<ZnnfManipulate> selectPage(ZnnfManipulateExample example);
}