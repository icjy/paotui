package com.runningman.paotui.pojo;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2019/10/31
 * @Description: com.runningman.paotui.pojo
 * @versio: 1.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderTitle {
    private int id;
    private String name;
    private String username;
    private String title;
    private String begin;
    private String end;
    private String reward;
}
