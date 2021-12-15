package cn.lnfvc.ken.export_sql.saas.entity;

import cn.lnfvc.ken.export_sql.comm.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/12/14 下午1:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysAttachment对象", description="附件表")
public class SysAttachment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    @ApiModelProperty(value = "编号")
    private String uuid;

    @ApiModelProperty(value = "文件路径")
    private String path;

    @ApiModelProperty(value = "文件类型 扩展名")
    private String ext;

    @ApiModelProperty(value = "所属表")
    private String ptable;

    @ApiModelProperty(value = "父ID")
    private String pid;

    @ApiModelProperty(value = "模块名")
    private String moudle;

    @ApiModelProperty(value = "模块名")
    private String userId;

    @ApiModelProperty(value = "值或备注")
    private String mark;

    @TableField(exist = false)
    @ApiModelProperty(value = "base64码")
    private String base64;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "时间")
    private Date createDate;

    @TableField(exist = false)
    @ApiModelProperty(value = "完整文件路径")
    private String fullPath;

}
