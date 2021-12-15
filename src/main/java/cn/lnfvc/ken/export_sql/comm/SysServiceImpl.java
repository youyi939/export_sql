package cn.lnfvc.ken.export_sql.comm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/12/14 下午2:19
 */
public class SysServiceImpl<M extends BaseMapper<T>, T> implements SysService<T> {

    @Autowired
    protected M baseMapper;

    protected Class<?> currentModelClass() {
        return ReflectionKit.getSuperClassGenericType(getClass(), 1);
    }

    /**
     * 获取 SqlStatement
     *
     * @param sqlMethod ignore
     * @return ignore
     */
    protected String sqlStatement(SqlMethod sqlMethod) {
        return SqlHelper.table(currentModelClass()).getSqlStatement(sqlMethod.getMethod());
    }

    /**
     * 批量操作 SqlSession
     */
    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(currentModelClass());
    }

    @Override
    public List<T> findByEntity(T entity){
        QueryWrapper<T> queryWrapper = new QueryWrapper<>(entity);
        return baseMapper.selectList(queryWrapper);
    }

}

