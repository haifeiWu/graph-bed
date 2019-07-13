package com.whfstudio.graphbed.provider.dao;

import com.whfstudio.graphbed.provider.model.GraphInfo;
import com.whfstudio.graphbed.provider.model.GraphInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GraphInfoMapper {
    long countByExample(GraphInfoExample example);

    int deleteByExample(GraphInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GraphInfo record);

    int insertSelective(GraphInfo record);

    List<GraphInfo> selectByExample(GraphInfoExample example);

    GraphInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GraphInfo record, @Param("example") GraphInfoExample example);

    int updateByExample(@Param("record") GraphInfo record, @Param("example") GraphInfoExample example);

    int updateByPrimaryKeySelective(GraphInfo record);

    int updateByPrimaryKey(GraphInfo record);

    GraphInfo selectForUpdate(Integer id);
}