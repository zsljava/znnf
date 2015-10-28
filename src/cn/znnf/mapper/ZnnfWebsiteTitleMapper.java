package cn.znnf.mapper;

import cn.znnf.model.ZnnfWebsiteTitle;
import cn.znnf.model.ZnnfWebsiteTitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfWebsiteTitleMapper {
    int countByExample(ZnnfWebsiteTitleExample example);

    int deleteByExample(ZnnfWebsiteTitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfWebsiteTitle record);

    int insertSelective(ZnnfWebsiteTitle record);

    List<ZnnfWebsiteTitle> selectByExample(ZnnfWebsiteTitleExample example);

    ZnnfWebsiteTitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfWebsiteTitle record, @Param("example") ZnnfWebsiteTitleExample example);

    int updateByExample(@Param("record") ZnnfWebsiteTitle record, @Param("example") ZnnfWebsiteTitleExample example);

    int updateByPrimaryKeySelective(ZnnfWebsiteTitle record);

    int updateByPrimaryKey(ZnnfWebsiteTitle record);

    List<ZnnfWebsiteTitle> selectPage(ZnnfWebsiteTitleExample example);
}