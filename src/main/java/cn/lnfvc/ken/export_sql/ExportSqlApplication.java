package cn.lnfvc.ken.export_sql;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author ken
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class ExportSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExportSqlApplication.class, args);
    }

}