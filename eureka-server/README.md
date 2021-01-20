*************************************************************************
#    learn to springcloud
*************************************************************************

##  Run a Eureka Server
* annotation
  @EnableEurekaServer Application main

* dependencies
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
```
* Standalone Mode
    * Standalone Eureka Server
    * application.yml config
```

    server:
      port: 8761

    eureka:
      instance:
        hostname: localhost
      client:
        registerWithEureka: false
        fetchRegistry: false
        serviceUrl:
          defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
    # server:
    #   enable-self-preservation: false

    spring:
      application:
        name: eureka-server
```
