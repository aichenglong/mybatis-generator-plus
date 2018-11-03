package org.mybatis.generator.plus.api;

import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.codegen.AbstractJavaClientGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3SimpleImpl;

import java.util.List;

/**
 * Author: ICL
 * Date:2018/11/3
 * Description:
 * Created by ICL on 2018/11/3.
 */
public class MyIntrospectedTableMyBatis3SimpleImpl extends IntrospectedTableMyBatis3SimpleImpl {
    @Override
    protected void calculateXmlMapperGenerator(AbstractJavaClientGenerator javaClientGenerator, List<String> warnings, ProgressCallback progressCallback) {
        //这个添加自定模板生成方法
        this.xmlMapperGenerator = new MySimpleXMLMapperGenerator();
        this.initializeAbstractGenerator(this.xmlMapperGenerator, warnings, progressCallback);
    }



}
