package cn.lnfvc.ken.export_sql;

import cn.lnfvc.ken.export_sql.saas.entity.ResSea;
import cn.lnfvc.ken.export_sql.saas.service.ResSeaService;
import cn.lnfvc.ken.export_sql.shengshi.entity.ShengshiStuManagement;
import cn.lnfvc.ken.export_sql.shengshi.service.ShengshiStuManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: KenChen
 * @Description: 测试controller，用于测试druid监控页面
 * @Date: Create in  2021/12/15 下午5:00
 */
@RestController
public class TestController {

    @Resource
    ShengshiStuManagementService shengshiStudentManagementService;

    @Resource
    ResSeaService seaService;

    @GetMapping("/test")
    public String test(){
        ResSea resSea = seaService.getByUUid("00617770a4603133ee811e8a2a8a154e");
        System.out.println(resSea.toString());

        ShengshiStuManagement studentManagement = shengshiStudentManagementService.getById((int)14944509);
        System.out.println(studentManagement.toString());
        return "hello";
    }

}
