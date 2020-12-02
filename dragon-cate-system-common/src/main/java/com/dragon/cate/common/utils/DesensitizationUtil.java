package com.dragon.cate.common.utils;


import com.dragon.cate.common.annotation.Desensitization;
import com.dragon.cate.common.enums.DesensitizationTypeEnum;
import lombok.Data;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.springframework.util.Assert;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


@Data
public class DesensitizationUtil implements Interceptor {


    private boolean desensitization = false;//脱敏

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object result = invocation.proceed();

        //如果需要对结果脱敏，则执行
        if (desensitization) {
            if (result instanceof ArrayList<?>) {
                List<?> list = (ArrayList<?>) result;
                return this.desensitization(list);
            } else {
                return this.desensitization(result);
            }
        }
        return result;
    }

    @Override
    public Object plugin(Object o) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }

    /*private List desensitization(List list) {
        Class cls = null;
        Field[] objFields = null;
        if (list != null && list.size() > 0) {
            for (Object o : list) {
                if (cls == null) {
                    cls = o.getClass();
                    objFields = cls.getDeclaredFields();
                }
                if (objFields != null) {
                    for (Field field : objFields) {
                        Desensitization desensitization;
                        if ("serialVersionUID".equals(field.getName()))
                            continue;
                        if (String.class != field.getType() || (desensitization = field.getAnnotation(Desensitization.class)) == null)
                            continue;
                        field.setAccessible(true);
                        String value = null;
                        try {
                            value = field.get(o) != null ? field.get(o).toString() : null;
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        if (value == null)
                            continue;
                        List<String> regular;
                        DesensitizationTypeEnum type = desensitization.type();
                        switch (type) {
//                            case CUSTOM:
//                                regular = Arrays.asList(desensitization.attach());
//                                break;
//                            case TRUNCATE:
//                                regular = truncateRender(desensitization.attach());
//                                break;
                            default:
                                regular = Arrays.asList(type.getRegular());
                        }
                        if (regular.size() > 1) {
                            String match = regular.get(0);
                            String result = regular.get(1);
                            if (null != match && result != null && match.length() > 0) {
                                value = ((String) value).replaceAll(match, result);
                                try {
                                    field.set(o, value);
                                } catch (IllegalArgumentException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }*/

    private <T> T desensitization(T obj) {
        Assert.notNull(obj, "desensitization param can not be null");
        Class cls = obj.getClass();
        Field[] objFields = cls.getDeclaredFields();
        Assert.notNull(objFields, "objFields can not be null");

        Arrays.stream(objFields).filter(ele -> "serialVersionUID".equals(ele.getName()))
                .filter(ele -> String.class != ele.getType() || (desensitization = ele.getAnnotation(Desensitization.class) == null))
                .forEach(field -> {
                    Desensitization desensitization = null;
                    field.setAccessible(true);
                    String value = null;
                    try {
                        value = field.get(obj).toString();
                    } catch (Exception e) {
                    }

                    String[] regular;
                    DesensitizationTypeEnum type = desensitization.type();
                    switch (type) {
//                            case CUSTOM:
//                                regular = Arrays.asList(desensitization.attach());
//                                break;
//                            case TRUNCATE:
//                                regular = truncateRender(desensitization.attach());
//                                break;
                        default:
                            regular = type.getRegular();
                    }
                    Assert.notEmpty(regular, "regular can not be empty!");

                    String match = regular[0];
                    String result = regular[1];
                    Assert.notNull(match, "match param can not be null");
                    value = ((String) value).replaceAll(match, result);
                    try {
                        field.set(obj, value);
                    } catch (Exception e) {
//                        log.error("field set error", e);

                    }
                });
        return obj;
    }

    private List<String> truncateRender(String[] attachs) {
        List<String> regular = new ArrayList<>();
        if (null != attachs && attachs.length > 1) {
            String rule = attachs[0];
            String size = attachs[1];
            String template, result;
            if ("0".equals(rule)) {
                template = "^(\\S{%s})(\\S+)$";
                result = "$1";
            } else if ("1".equals(rule)) {
                template = "^(\\S+)(\\S{%s})$";
                result = "$2";
            } else {
                return regular;
            }
            try {
                if (Integer.parseInt(size) > 0) {
                    regular.add(0, String.format(template, size));
                    regular.add(1, result);
                }
            } catch (Exception e) {
            }
        }
        return regular;
    }

    public boolean isDesensitization() {
        return desensitization;
    }
}
