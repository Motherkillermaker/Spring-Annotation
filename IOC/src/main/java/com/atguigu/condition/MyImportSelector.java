package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**自定义逻辑返回需要导入的组件
 * @author CJYong
 * @create 2021-10-26 20:00
 */

public class MyImportSelector implements ImportSelector {
    @Override
    //返回值为要导入组件的全类名
    //AnnotationMetadata：当前标注@Import注解的类的所有注解信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }
}
