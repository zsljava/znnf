package cn.znnf.mapper;

import cn.znnf.model.ZnnfWebsiteContent;
import cn.znnf.model.ZnnfWebsiteContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfWebsiteContentMapper {
    int countByExample(ZnnfWebsiteContentExample example);

    int deleteByExample(ZnnfWebsiteContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfWebsiteContent record);

    int insertSelective(ZnnfWebsiteContent record);

    List<ZnnfWebsiteContent> selectByExample(ZnnfWebsiteContentExample example);

    ZnnfWebsiteContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfWebsiteContent record, @Param("example") ZnnfWebsiteContentExample example);

    int updateByExample(@Param("record") ZnnfWebsiteContent record, @Param("example") ZnnfWebsiteContentExample example);

    int updateByPrimaryKeySelective(ZnnfWebsiteContent record);

    int updateByPrimaryKey(ZnnfWebsiteContent record);

    List<ZnnfWebsiteContent> selectPage(ZnnfWebsiteContentExample example);
}