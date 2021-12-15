package cn.lnfvc.ken.export_sql.saas.service.impl;

import cn.lnfvc.ken.export_sql.comm.SysServiceImpl;
import cn.lnfvc.ken.export_sql.saas.entity.ResSea;
import cn.lnfvc.ken.export_sql.mapper.ResSeaMapper;
import cn.lnfvc.ken.export_sql.saas.service.ResSeaService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 资源公海（市场部）服务实现类
 * </p>
 *
 * @author generator
 * @since 2021-08-31
 */
@Service
public class ResSeaServiceImpl extends SysServiceImpl<ResSeaMapper, ResSea> implements ResSeaService {


    @Override
    public ResSea getByUUid(Serializable uuid) {
        return baseMapper.selectById(uuid);
    }



}
