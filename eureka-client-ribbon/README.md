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

## actual combat of ribbon
    ribbon: resemble httpClient or URLConnection

* dependency
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
        </dependency>
```

* config application.yml
```
        server:
          port: 8781

        eureka:
          client:
            serviceUrl:
              defaultZone: http://localhost:8761/eureka/

        spring:
          application:
            name: eureka-client-ribbon
```
-----------------------------------------------------------------------------------

*  RestTemplate refer to  Application main

```
        @Bean
        @LoadBalanced
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
```




