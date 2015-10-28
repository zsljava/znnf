package cn.znnf.mapper;

import cn.znnf.model.ZnnfPermission;
import cn.znnf.model.ZnnfPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnnfPermissionMapper {
    int countByExample(ZnnfPermissionExample example);

    int deleteByExample(ZnnfPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZnnfPermission record);

    int insertSelective(ZnnfPermission record);

    List<ZnnfPermission> selectByExample(ZnnfPermissionExample example);

    ZnnfPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZnnfPermission record, @Param("example") ZnnfPermissionExample example);

    int updateByExample(@Param("record") ZnnfPermission record, @Param("example") ZnnfPermissionExample example);

    int updateByPrimaryKeySelective(ZnnfPermission record);

    int updateByPrimaryKey(ZnnfPermission record);

    List<ZnnfPermission> selectPage(ZnnfPermissionExample example);
}