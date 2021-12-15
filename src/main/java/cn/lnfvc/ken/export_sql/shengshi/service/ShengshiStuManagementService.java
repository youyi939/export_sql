package cn.lnfvc.ken.export_sql.shengshi.service;


import cn.lnfvc.ken.export_sql.comm.ISysService;
import cn.lnfvc.ken.export_sql.shengshi.entity.ShengshiStuManagement;
import java.io.Serializable;

/**
 * <p>
    *  服务类
    * </p>
 *
 * @author generator
 * @since 2021-05-11
 */
public interface ShengshiStuManagementService extends ISysService<ShengshiStuManagement> {

    String TABLE_NAME = "ShengshiStudentManagement";


    /**
       * 获取一个对象
       * @param id 主键
       * @return
       */
    ShengshiStuManagement getById(Serializable id);

}



