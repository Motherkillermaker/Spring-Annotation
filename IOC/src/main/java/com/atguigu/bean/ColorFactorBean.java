package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/** 创建spring定义的工厂Bean
 * @author CJYong
 * @create 2021-10-26 20:24
 */
public class ColorFactorBean implements FactoryBean<Color>{

    @Override
    //返回一个Color对象并添加到容器中
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
