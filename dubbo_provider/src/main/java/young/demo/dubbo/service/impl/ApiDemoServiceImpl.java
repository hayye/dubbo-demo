package young.demo.dubbo.service.impl;

import org.springframework.stereotype.Component;
import young.demo.dubbo.service.ApiDemoService;

import java.util.ArrayList;
import java.util.List;

@Component
@com.alibaba.dubbo.config.annotation.Service
public class ApiDemoServiceImpl implements ApiDemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
