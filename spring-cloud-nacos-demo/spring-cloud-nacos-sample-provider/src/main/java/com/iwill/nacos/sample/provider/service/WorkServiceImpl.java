package com.iwill.nacos.sample.provider.service;

import com.iwill.nacos.sample.api.IWorkService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class WorkServiceImpl implements IWorkService {

    @Override
    public String doWork() {
        return "homeworkd";
    }
}
