package com.energyfragment.mybatismultidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * @author  zhangnbr
 * @date    2022-03-27
 * @desc    1号数据源映射-系统用户表
 */
// 注意这里添加的例外
// 如果不添加了这个例外，DataSourceAutoConfiguration会自动配置单数据源，由于我们不是按照单数据源格式进行配置，会在启动时报错
// 所以需要添加例外，通过自定义的DataSource进行扫描
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MybatisMultiDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMultiDataSourceApplication.class, args);
    }

}
