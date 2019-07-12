package com.whfstudio.graphbed.dao;

import com.whfstudio.graphbed.model.GraphInfo;
import com.whfstudio.graphbed.model.GraphInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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