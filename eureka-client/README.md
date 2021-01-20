*************************************************************************
#    learn to springcloud
*************************************************************************

##  Run a Eureka Client
* annotation
  @EnableEurekaClient Application main

* dependencies
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```
* config application.yml
```
        server:
          port: 8771

        eureka:
          client:
            serviceUrl:
              defaultZone: http://localhost:8761/eureka/

        spring:
          application:
            name: eureka-client
```
