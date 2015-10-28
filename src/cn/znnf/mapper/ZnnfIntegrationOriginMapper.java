package cn.znnf.mapper;

import cn.znnf.model.ZnnfIntegrationOrigin;
import cn.znnf.model.ZnnfIntegrationOriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfIntegrationOriginMapper {
    int countByExample(ZnnfIntegrationOriginExample example);

    int deleteByExample(ZnnfIntegrationOriginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfIntegrationOrigin record);

    int insertSelective(ZnnfIntegrationOrigin record);

    List<ZnnfIntegrationOrigin> selectByExample(ZnnfIntegrationOriginExample example);

    ZnnfIntegrationOrigin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfIntegrationOrigin record, @Param("example") ZnnfIntegrationOriginExample example);

    int updateByExample(@Param("record") ZnnfIntegrationOrigin record, @Param("example") ZnnfIntegrationOriginExample example);

    int updateByPrimaryKeySelective(ZnnfIntegrationOrigin record);

    int updateByPrimaryKey(ZnnfIntegrationOrigin record);

    List<ZnnfIntegrationOrigin> selectPage(ZnnfIntegrationOriginExample example);
}