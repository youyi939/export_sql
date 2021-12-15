package cn.lnfvc.ken.export_sql.shengshi.service.impl;

import cn.lnfvc.ken.export_sql.comm.SysServiceImpl;
import cn.lnfvc.ken.export_sql.mapper.ShengshiStuManagementMapper;
import cn.lnfvc.ken.export_sql.shengshi.entity.ShengshiStuManagement;
import cn.lnfvc.ken.export_sql.shengshi.service.ShengshiStuManagementService;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author generator
 * @since 2021-05-11
 */
@Service
@DS("slave_1")
public class ShengshiStudentManagementServiceImpl extends SysServiceImpl<ShengshiStuManagementMapper, ShengshiStuManagement> implements ShengshiStuManagementService {


    @Override
    public ShengshiStuManagement getById(Serializable id) {
        return baseMapper.selectById(id);
    }

}
