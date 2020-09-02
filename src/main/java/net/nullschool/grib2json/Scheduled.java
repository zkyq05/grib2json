package net.nullschool.grib2json;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
class SpiderScheduled {

    @Scheduled(cron = "00 59 * * * ?")//0 */1 * * * ?
    public void MapScheduled() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----开始执行定时任务----:"+df.format(new Date()));

    }
}
