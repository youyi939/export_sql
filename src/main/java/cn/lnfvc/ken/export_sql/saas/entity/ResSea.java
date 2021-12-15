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
import java.util.List;


/**
 * <p>
 *  资源公海（市场部）
 * </p>
 *
 * @author gennerator
 * @since 2021-09-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="res_sea对象", description=" 资源公海（市场部）")
public class ResSea extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId(type = IdType.UUID)
    @ApiModelProperty(value = "")
    private String uuid;
    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    private String clientName;
    /**
     * 电话号
     */
    @ApiModelProperty(value = "电话号")
    private String phone;
    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String sex;
    /**
     * 省
     */
    @ApiModelProperty(value = "省")
    private String province;
    /**
     * 市
     */
    @ApiModelProperty(value = "市")
    private String city;
    /**
     * 区
     */
    @ApiModelProperty(value = "区")
    private String region;
    /**
     * 省 id
     */
    @ApiModelProperty(value = "省 id")
    private Integer provinceId;
    /**
     * 市 id
     */
    @ApiModelProperty(value = "市 id")
    private Integer cityId;
    /**
     * 区 id
     */
    @ApiModelProperty(value = "区 id")
    private Integer regionId;
    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private Double lon;
    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private Double lat;
    /**
     * 渠道
     */
    @ApiModelProperty(value = "渠道")
    private String channel;
    /**
     * 渠道 id
     */
    @ApiModelProperty(value = "渠道 id")
    private Integer channelId;
    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCard;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;


    /**
     * 录入时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "录入时间")
    private Date enteringTime;

    /**
     * 首次分配时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "首次分配时间")
    private Date firstDistributionTime;
    /**
     * 最新分配时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "最新分配时间")
    private Date latestDistributionTime;
    /**
     * 意向课程
     */
    @ApiModelProperty(value = "意向课程")
    private String lntendedCourse;

    /**
     * 意向课程id
     */
    @ApiModelProperty(value = "意向课程id")
    private Integer lntendedCourseId;
    /**
     * 分配状态(已分配/未分配/无需分配)
     */
    @ApiModelProperty(value = "分配状态(已分配/未分配/无需分配)")
    private String state;
    /**
     * 意向度
     */
    @ApiModelProperty(value = "意向度")
    private String intentionDegree;
    /**
     * 有效性(有效/无效)
     */
    @ApiModelProperty(value = "有效性(有效/无效)")
    private String effectiveness;
    /**
     * 地推人员UUID
     */
    @ApiModelProperty(value = "地推人员UUID")
    private String pushUserUuid;
    /**
     * 租户tid（校区）
     */
    @ApiModelProperty(value = "租户tid（校区）")
    private Integer schoolId;
    /**
     * 平台方tid
     */
    @ApiModelProperty(value = "平台方tid")
    private String tid;
    /**
     * 导入方式(自动/手动/导入)
     */
    @ApiModelProperty(value = "导入方式(自动/手动/导入)")
    private String inportWay;
    /**
     * 无效性描述
     */
    @ApiModelProperty(value = "无效性描述")
    private String effectivenessRemark;
    /**
     * 是否成交
     */
    @ApiModelProperty(value = "是否成交")
    private Boolean deal;
    /**
     * 是否交付
     */
    @ApiModelProperty(value = "是否交付")
    private Boolean delivery;
    /**
     * 学员生日（必填）
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "学员生日（必填）")
    private Date stuBrithday;
    /**
     * 学员姓名
     */
    @ApiModelProperty(value = "学员姓名")
    private String stuName;
    /**
     * 学员年龄
     */
    @ApiModelProperty(value = "学员年龄")
    private Integer stuAge;
    /**
     * 客服姓名
     */
    @ApiModelProperty(value = "客服姓名")
    private String serviceName;


    /**
     * 客服UUID
     */
    @ApiModelProperty(value = "客服UUID")
    private String serviceUuid;
    /**
     * 学生微信号
     */
    @ApiModelProperty(value = "学生微信号")
    private String stuWechat;
    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址")
    private String address;
    /**
     * 校区名称
     */
    @ApiModelProperty(value = "校区名称")
    private String schoolName;
    /**
     * 试听状态
     */
    @ApiModelProperty(value = "试听状态")
    private String auditionType;
    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avator;
    /**
     * 销售员UUID
     */
    @ApiModelProperty(value = "销售员UUID")
    private String sellId;
    /**
     * 销售员姓名
     */
    @ApiModelProperty(value = "销售员姓名")
    private String sellName;
    /**
     * 跟进信息
     */
    @ApiModelProperty(value = "跟进信息")
    private String contentRemark;
    /**
     * 跟进状态
     */
    @ApiModelProperty(value = "跟进状态")
    private String followState;
    /**
     * 跟进状态id
     */
    @ApiModelProperty(value = "跟进状态id")
    private Integer followStateId;
    /**
     * 下次回访时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "下次回访时间")
    private Date nextFollowTime;

    /**
     * 当前处理人id
     */
    @ApiModelProperty(value = "当前处理人id")
    private String currentHandlerId;
    /**
     * 当前处理人
     */
    @ApiModelProperty(value = "当前处理人")
    private String currentHandler;



    /**
     * 咨询校区id
     */
    @ApiModelProperty(value = "校区id")
    private Integer handleSchoolId;
    /**
     * 咨询校区名称
     */
    @ApiModelProperty(value = "校区名称")
    private String handleSchoolName;

    /* -----------------------------------叮咚资源新增字段------------------------------------*/

    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    private String remarks;
    /**
     * 公司名头
     */
    @ApiModelProperty(value = "公司名头")
    private String companyName;
    /**
     * 资源职务
     */
    @ApiModelProperty(value = "资源职务")
    private String position;
    /**
     * 主营产品
     */
    @ApiModelProperty(value = "主营产品")
    private String product;
    /**
     * 渠道ID 当职员创建资源 渠道id 和名称对应 员工user_uuid 和 name
     */
    @ApiModelProperty(value = "创建渠道员工id")
    private String createChannelId;
    /**
     * 资源创建来源渠道
     */
    @ApiModelProperty(value = "创建渠道员工名称")
    private String createChannelName;
    /**
     * 资源跟进人UUID
     */
    @ApiModelProperty(value = "资源跟进人UUID")
    private String followPersonId;
    /**
     * 资源跟进人姓名
     */
    @ApiModelProperty(value = "资源跟进人姓名")
    private String followPersonName;
    /**
     * 资源录入方式
     */
    @ApiModelProperty(value = "资源录入方式")
    private String createType;
    /**
     * 最新跟进记录
     */
    @ApiModelProperty(value = "最新跟进记录")
    private String latelyFollowRecord;
    /**
     * 最新跟进时间
     */
    @ApiModelProperty(value = "最新跟进时间")
    private Date latelyFollowTime;
    /**
     * 查询跟进时间开始
     * */
    @TableField(exist = false)
    @ApiModelProperty(value = "查询跟进时间开始")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date followTimeStart;
    /**
     * 查询跟进时间结束
     * */
    @TableField(exist = false)
    @ApiModelProperty(value = "查询跟进时间结束")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date followTimeEnd;
    /**
     * 资源模糊查询
     * */
    @ApiModelProperty(value = "模糊查询字段")
    @TableField(exist = false)
    private String search;
    /**资源附件信息*/
    @TableField(exist = false)
    @ApiModelProperty(value = "附件集合")
    private List<SysAttachment> attachmentList;
    /**
     * 资源图片接收
     * */
    @TableField(exist = false)
    @ApiModelProperty(value = "单个附件")
    private String base64Image;
    /**
     * 搜索创建时间开始
     * */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "资源创建时间开始")
    @TableField(exist = false)
    private Date createTimeStart;
    /**
     * 搜索创建时间结束
     * */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "资源创建时间结束")
    @TableField(exist = false)
    private Date createTimeEnd;

    @ApiModelProperty("资源的登陆uuid")
    private String loginUuid;



}


