package cn.znnf.mapper;

import cn.znnf.model.ZnnfPosition;
import cn.znnf.model.ZnnfPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfPositionMapper {
    int countByExample(ZnnfPositionExample example);

    int deleteByExample(ZnnfPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfPosition record);

    int insertSelective(ZnnfPosition record);

    List<ZnnfPosition> selectByExample(ZnnfPositionExample example);

    ZnnfPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfPosition record, @Param("example") ZnnfPositionExample example);

    int updateByExample(@Param("record") ZnnfPosition record, @Param("example") ZnnfPositionExample example);

    int updateByPrimaryKeySelective(ZnnfPosition record);

    int updateByPrimaryKey(ZnnfPosition record);

    List<ZnnfPosition> selectPage(ZnnfPositionExample example);
}