package com.liaoyuanfang.cloudyf.data.domain.sso;

import com.liaoyuanfang.cloudyf.data.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Auther: gople
 * @Date: 2021/1/24 16:26
 * @Description:
 */
@Data
@Entity
@javax.persistence.Table(name = "bs_user_base_info")
@org.hibernate.annotations.Table(appliesTo = "bs_user_base_info", comment = "用户基本信息")
public class BsUserBaseInfo extends BaseEntity {

    private static final long serialVersionUID = 9121321671374618288L;

    @Id
    @ApiModelProperty(value = "用户名")
    @Column(length = 64)
    private String userName;

    @ApiModelProperty(value = "密码")
    @Column(length = 512)
    private String password;

    @ApiModelProperty(value = "个人签名")
    @Column(length = 512)
    private String description;

    @ApiModelProperty(value = "活跃状况")
    @Column(precision = 5)
    private Integer activeStat;

    @ApiModelProperty(value = "用户等级")
    @Column(precision = 5)
    private Integer userLevel;

}
