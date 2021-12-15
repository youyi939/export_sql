package cn.lnfvc.ken.export_sql.comm;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/12/14 下午1:56
 */

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * 预留基础类
 */
@Data
public abstract class BaseEntity {

    @TableLogic
    private boolean deleteFlag;



}
