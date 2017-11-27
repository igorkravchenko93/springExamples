Spring technologies examples:

Modules: 

**common-model**

    Example of common module for a few applications
    Example of POJO with One-to-many JPA configuration
    Used by other modules for DB storage
    Have DB data from import.sql. Other SpringBoot applications detect it automatically and execute on start
    
**rest-template-example**    
    
    Example of spring RestTemplate that able to make REST calls to himself
    Example of spring-boot microservice
    
**spring-boot-full-app**

    Example of sping-boot microservice
    Example of spring-data
    Example of end-to-end application 
    Example of H2 and postgreSQL properties configuration
    Example of manual jackson converter
    //todo another one microservice. MultiModule one more time?
    //todo connect them with Netflix Eureka
    //todo connect them with Netflix Feign
    //todo integration tests
    
**spring-context-example**
    
    Example of java configuration.
    Example of DataSource PostgreSQL configuration
    Example of JPA repository level: EntityManager, JPQL
    
**spring-eureka-feign-example**

    Example of eureka-feign
    Example of ribbon loadBalancer
    Example of wrapped RestTemplate to not use http://localhost:3004 but http://ValidationService instead 
    Example of two microservices that chatting
    Example of PathVariable
    //todo   Investigate discovery server with example https://github.com/kbastani/spring-cloud-microservice-example/blob/master/discovery-microservice/src/main/resources/application.yml
            #    serviceUrl:
            #      defaultZone: http://discovery:${server.port}/eureka/
    //todo http://localhost:3003/  showing disabled servers that is down as UP
    
**spring-data-rest**

    //todo example of spring-data-rest
    //todo resolve n+1 probllem
    