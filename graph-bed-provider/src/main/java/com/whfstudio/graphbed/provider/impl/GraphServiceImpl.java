package com.whfstudio.graphbed.provider.impl;

import com.whfstudio.graphbed.common.model.GraphInfo;
import com.whfstudio.graphbed.common.model.GraphInfoExample;
import com.whfstudio.graphbed.provider.dao.GraphInfoMapper;
import com.whfstudio.graphbed.service.GraphService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wuhaifei 2019-07-14
 */
@Service(version = "1.0.0")
public class GraphServiceImpl implements GraphService {

    @Autowired
    GraphInfoMapper graphInfoMapper;

    @Override
    public List<GraphInfo> graphList() {
       return graphInfoMapper.selectByExample(new GraphInfoExample());
    }
}
