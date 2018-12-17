package young.demo.dubbo.service;

import java.util.List;

public interface ApiDemoService {
    List<String> getPermissions(Long id);
}
