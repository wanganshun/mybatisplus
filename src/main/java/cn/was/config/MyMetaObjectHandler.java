package cn.was.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {

        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
       this.strictInsertFill(metaObject, "isDelete", Integer.class, 0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "gmtModified", Date.class, new Date());
    }


//    public MybatisPlusPropertiesCustomizer mybatisPlusPropertiesCustomizer() {
//        // 序列化枚举值为数据库存储值
//        FastJsonConfig config = new FastJsonConfig();
//        config.setSerializerFeatures(SerializerFeature.WriteEnumUsingToString);
//
//        return properties -> {
//            GlobalConfig globalConfig = properties.getGlobalConfig();
//            globalConfig.setBanner(false);
//            MybatisConfiguration configuration = new MybatisConfiguration();
//            configuration.setDefaultEnumTypeHandler(MybatisEnumTypeHandler.class);
//            properties.setConfiguration(configuration);
//        };
//    }







}
