package cn.lnfvc.ken.export_sql.comm;

import java.util.List;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/12/14 下午2:02
 */
public interface SysService<T> {

    List<T> findByEntity(T entity);
}

