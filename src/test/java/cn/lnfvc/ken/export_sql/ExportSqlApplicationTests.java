package cn.lnfvc.ken.export_sql;

import cn.lnfvc.ken.export_sql.saas.entity.ResSea;
import cn.lnfvc.ken.export_sql.saas.service.ResSeaService;
import cn.lnfvc.ken.export_sql.shengshi.entity.ShengshiStuManagement;
import cn.lnfvc.ken.export_sql.shengshi.service.ShengshiStuManagementService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ExportSqlApplicationTests {

    @Resource
    ShengshiStuManagementService shengshiStudentManagementService;

    @Resource
    ResSeaService seaService;

    @Test
    void contextLoads() {
        ResSea resSea = seaService.getByUUid("00617770a4603133ee811e8a2a8a154e");
        System.out.println(resSea.toString());

        ShengshiStuManagement studentManagement = shengshiStudentManagementService.getById((int)14944509);
        System.out.println(studentManagement.toString());
    }

}
