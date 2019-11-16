//package com.yuan.redis.config;
//
//import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisSentinelConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
//
//import java.util.Set;
//
//@Configuration
//@ConfigurationProperties(prefix="spring.redis.sentinel")
//public class RedisSentinelConfig {
//
//    private Set<String> nodes;
//    private String master;
//
//    public Set<String> getNodes() {
//        return nodes;
//    }
//
//    public void setNodes(Set<String> nodes) {
//        this.nodes = nodes;
//    }
//
//    public String getMaster() {
//        return master;
//    }
//
//    public void setMaster(String master) {
//        this.master = master;
//    }
//
//    @Value("${spring.redis.timeout}")
//    private long timeout;
//
//    @Value("${spring.redis.password}")
//    private String password;
//
//    @Value("${spring.redis.lettuce.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.lettuce.pool.min-idle}")
//    private int minIdle;
//
//    @Value("${spring.redis.lettuce.pool.max-wait}")
//    private long maxWait;
//
//    @Value("${spring.redis.lettuce.pool.max-active}")
//    private int maxActive;
//
//    @Bean
//    public RedisConnectionFactory lettuceConnectionFactory(){
//        RedisSentinelConfiguration redisSentinelConfiguration=new RedisSentinelConfiguration(master,nodes);
//        redisSentinelConfiguration.setPassword(password);
//        GenericObjectPoolConfig genericObjectPoolConfig=new GenericObjectPoolConfig();
//        genericObjectPoolConfig.setMaxTotal(maxActive);
//        genericObjectPoolConfig.setMaxIdle(maxIdle);
//        genericObjectPoolConfig.setMinIdle(minIdle);
//        genericObjectPoolConfig.setMaxWaitMillis(maxWait);
//        LettucePoolingClientConfiguration lettucePoolingClientConfiguration=LettucePoolingClientConfiguration.builder()
//                .poolConfig(genericObjectPoolConfig)
//                .build();
//        return new LettuceConnectionFactory(redisSentinelConfiguration,lettucePoolingClientConfiguration);
//    }
//}
