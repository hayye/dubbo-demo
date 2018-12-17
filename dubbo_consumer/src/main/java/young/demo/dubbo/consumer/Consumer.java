package young.demo.dubbo.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import young.demo.dubbo.service.ApiDemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dubbo_consumer.xml")
public class Consumer {

    @com.alibaba.dubbo.config.annotation.Reference
    private ApiDemoService apiDemoService;

    @Test
    public void testConsumer(){
        System.out.println("consumer start");
        System.out.println(apiDemoService.getPermissions(1L));
    }

   /* public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:dubbo_consumer.xml");
        context.start();
        System.out.println("consumer start");
        ApiDemoService api = context.getBean(ApiDemoService.class);
        System.out.println("consumer");
        System.out.println(api.getPermissions(1L));
    }*/
}
