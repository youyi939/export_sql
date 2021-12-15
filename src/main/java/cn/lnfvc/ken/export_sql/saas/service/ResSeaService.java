package cn.lnfvc.ken.export_sql.saas.service;


import cn.lnfvc.ken.export_sql.comm.SysService;
import cn.lnfvc.ken.export_sql.saas.entity.ResSea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 资源公海（市场部）服务类
 * </p>
 *
 * @author generator
 * @since 2021-08-31
 */
public interface ResSeaService extends SysService<ResSea> {

    String TABLE_NAME = "ResSea";

    /**
     * 通过uuid获取资源对象
     * @param uuid
     * @return
     */
    ResSea getByUUid(Serializable uuid);



}