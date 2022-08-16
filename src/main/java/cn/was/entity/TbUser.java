package cn.was.entity;

import cn.was.enums.SexEnum;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author 王安顺
 * @since 2022-08-10
 */
@TableName("tb_user")
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别，1男2女
     */
   //@JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private SexEnum sex;

    /**
     * 创建时间
     */

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除 1是，0否
     */

    @TableLogic(value = "0",delval = "1")
    @TableField(fill = FieldFill.INSERT)
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", nickname=" + nickname +
                ", sex=" + sex +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                "}";
    }
}

