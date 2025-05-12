## sa-token集成redis实现分布式Session
https://sa-token.cc

### 整合Redis
RedisTemplate 是 SpringBoot 官方推荐的 Redis 客户端，Sa-Token 提供基于 RedisTemplate 的 Redis 整合方案：

```xml 
<!-- Sa-Token 整合 RedisTemplate -->
<dependency>
    <groupId>cn.dev33</groupId>
    <artifactId>sa-token-redis-template</artifactId>
    <version>1.42.0</version>
</dependency>

<!-- 提供 Redis 连接池 -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-pool2</artifactId>
</dependency>

```
### 填写redis配置
spring.data.redis是springboot3.x中集成redis的配置前缀
```properties
# Redis数据库索引（默认为0）
spring.data.redis.database=1
# Redis服务器地址
spring.data.redis.host=127.0.0.1
# Redis服务器连接端口
spring.data.redis.port=6379
# Redis服务器连接密码（默认为空）
spring.data.redis.password=root
# 连接超时时间
spring.data.redis.timeout=10s
# 连接池最大连接数
spring.data.redis.lettuce.pool.max-active=200
# 连接池最大阻塞等待时间（使用负值表示没有限制）
spring.data.redis.lettuce.pool.max-wait=-1ms
# 连接池中的最大空闲连接
spring.data.redis.lettuce.pool.max-idle=10
# 连接池中的最小空闲连接
spring.data.redis.lettuce.pool.min-idle=0

```

### 参考
https://sa-token.cc/doc.html#/micro/dcs-session