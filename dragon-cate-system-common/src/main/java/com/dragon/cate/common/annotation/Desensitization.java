package com.dragon.cate.common.annotation;

import com.dragon.cate.common.enums.DesensitizationTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Desensitization {

    /**
     * 脱敏规则类型
     */
    DesensitizationTypeEnum type();

    /**
     * 附加值, 自定义正则表达式等
     */
    String[] attach() default "";
}