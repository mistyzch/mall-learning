package com.monster.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by misty on 2020/7/22 20:02
 */
@Configuration
@MapperScan("com.monster.mbg.mapper")
public class MybatisConfig {
}
