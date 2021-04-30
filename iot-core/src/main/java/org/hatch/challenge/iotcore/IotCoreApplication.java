package org.hatch.challenge.iotcore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@EnableReactiveElasticsearchRepositories
@SpringBootApplication
public class IotCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(IotCoreApplication.class, args);
    }

}
