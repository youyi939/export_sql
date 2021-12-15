package cn.lnfvc.ken.export_sql.shengshi.entity;

import cn.lnfvc.ken.export_sql.comm.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * <p>
    * 学员信息
    * </p>
 *
 * @author gennerator
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="shengshi_stu_management对象", description="学员信息")
public class ShengshiStuManagement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @JsonSerialize(using= ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 学员姓名
     */
    @ApiModelProperty(value = "学员姓名")
    private String stuname;

    /**
     * 学员性别
     */
    @ApiModelProperty(value = "学员性别")
    private String stusex;

    /**
     * 学员生日
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "学员生日")
    private Date stubrd;




}