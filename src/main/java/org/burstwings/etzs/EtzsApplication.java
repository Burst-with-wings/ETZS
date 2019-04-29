package org.burstwings.etzs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtzsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtzsApplication.class, args);
        System.out.println("启动成功\n");
    }

}
