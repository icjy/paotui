package com.runningman.paotui;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.runningman.paotui.mapper.OrderMapper;
import com.runningman.paotui.pojo.Order;
import com.runningman.paotui.pojo.User;
import com.runningman.paotui.service.OrderService;
import org.hibernate.validator.constraints.EAN;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.util.DateUtil.now;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={PaotuiApplication.class})
class PaotuiApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
    }

    @Test
    void makeOrderTest(){
        Order order = new Order();
        order.setTitle("Titile");
        order.setUser("1");
        order.setBegin("Begin");
        order.setEnd("End");
        order.setStart_Lnglat("Start_Lnglat");
        order.setReward("Reward");
        order.setEnd_lnglat("End_lnglat");
        order.setEndtime(now());
        orderMapper.insertOrder(order);

        List<Order> orderList = orderMapper.selectOrderByUser("1");

        for (Order order1:orderList){
            System.out.println(order1.toString());
        }
    }


    @Test
    void orderServiceTest(){
        /*Order order = new Order();
        order.setTitle("Titile");
        //order.setUser("1");
        order.setBegin("Begin");
        order.setEnd("End");
        order.setStart_Lnglat("Start_Lnglat");
        order.setReward("Reward");
        order.setEnd_lnglat("End_lnglat");
        order.setEndtime(now());
        orderService.makeOrder("1",order);
        System.out.println(order.getId());*/
        //orderService.selectOrderByUser("1");
        System.out.println(orderService.getAllOrderList(1,1));
        System.out.println(orderService.getUserOrders("2",1,1));
    }
}
