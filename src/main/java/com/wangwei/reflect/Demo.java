package com.wangwei.reflect;

import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import java.beans.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wangwei
 * @date 2021-06-24 14:24
 * @since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        CuxGlCommonImportLineAll cuxGlCommonImportLineAll = new CuxGlCommonImportLineAll();
        Set<Method> allSetMethods = null;
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(CuxGlCommonImportLineAll.class, Object.class);
            allSetMethods = Arrays.stream(beanInfo.getPropertyDescriptors())
                    .map(PropertyDescriptor::getWriteMethod)
                    .collect(Collectors.toSet());
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        if (CollectionUtils.isEmpty(allSetMethods)) return;
        allSetMethods.forEach(s -> {
            String name = s.getName().toLowerCase();
            if (name.endsWith("headerAttribute4".toLowerCase())){
                ReflectionUtils.invokeMethod(s, cuxGlCommonImportLineAll, "wangwei");
            }
        });
        System.out.println(cuxGlCommonImportLineAll.getHeaderAttribute4());
    }
}
