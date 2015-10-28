package cn.znnf.mapper;

import cn.znnf.model.ZnnfCommissioner;
import cn.znnf.model.ZnnfCommissionerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfCommissionerMapper {
    int countByExample(ZnnfCommissionerExample example);

    int deleteByExample(ZnnfCommissionerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfCommissioner record);

    int insertSelective(ZnnfCommissioner record);

    List<ZnnfCommissioner> selectByExample(ZnnfCommissionerExample example);

    ZnnfCommissioner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfCommissioner record, @Param("example") ZnnfCommissionerExample example);

    int updateByExample(@Param("record") ZnnfCommissioner record, @Param("example") ZnnfCommissionerExample example);

    int updateByPrimaryKeySelective(ZnnfCommissioner record);

    int updateByPrimaryKey(ZnnfCommissioner record);

    List<ZnnfCommissioner> selectPage(ZnnfCommissionerExample example);
}