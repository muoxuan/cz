package com.moxuan.Proj;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
@SpringBootApplication
@MapperScan("com.moxuan.Proj.mapper")
public class ProjApplication {




    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProjApplication.class);

    }

}
