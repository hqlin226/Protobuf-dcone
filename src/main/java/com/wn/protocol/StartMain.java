package com.wn.protocol;

import com.wn.protocol.common.LCLocationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by houql
 *
 * @date 2017/10/31 15:51
 */
public class StartMain {
    public static Logger log = LoggerFactory.getLogger(StartMain.class);
    public static void main(String[] args) {
        log.info("开始初始化对象....");
        LCLocationData.LocationData.Builder location = LCLocationData.LocationData.newBuilder();
        location.setAlarm(100L);
        location.setDirection(1);

        location.build();
        log.info("location  "+location);

        // 1.3 序列化成 byte[]
        byte[] result = location.build().toByteArray();

        try {
            LCLocationData.LocationData locationData=LCLocationData.LocationData.parseFrom(result);
            log.info("反序列location  "+locationData);
        }catch (Exception ex){

        }

    }
}
