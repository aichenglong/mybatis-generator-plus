package org.mybatis.generator.plus.api;

import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.codegen.AbstractJavaClientGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3SimpleImpl;
import org.mybatis.generator.codegen.mybatis3.javamapper.SimpleAnnotatedClientGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.SimpleJavaClientGenerator;
import org.mybatis.generator.internal.ObjectFactory;

import java.util.List;

public class InsoIntrospectedTable extends IntrospectedTableMyBatis3SimpleImpl {

    /**
     * XML的生成方法
     * @param javaClientGenerator
     * @param warnings
     * @param progressCallback
     */
    @Override
    protected void calculateXmlMapperGenerator(AbstractJavaClientGenerator javaClientGenerator, List<String> warnings, ProgressCallback progressCallback) {
        this.xmlMapperGenerator = new MySimpleXMLMapperGenerator();
        this.initializeAbstractGenerator(this.xmlMapperGenerator, warnings, progressCallback);
    }

    /**
     * Mapper类的生成方法
     * @return
     */
    @Override
    protected AbstractJavaClientGenerator createJavaClientGenerator() {
        if (this.context.getJavaClientGeneratorConfiguration() == null) {
            return null;
        } else {
            String type = this.context.getJavaClientGeneratorConfiguration().getConfigurationType();
            Object javaGenerator;
            if ("XMLMAPPER".equalsIgnoreCase(type)) {
                javaGenerator = new MySimpleJavaClientGenerator("");
            } else if ("ANNOTATEDMAPPER".equalsIgnoreCase(type)) {
                javaGenerator = new MySimpleJavaClientGenerator("");
            } else if ("MAPPER".equalsIgnoreCase(type)) {
                javaGenerator = new MySimpleJavaClientGenerator("");
            } else {
                javaGenerator = (AbstractJavaClientGenerator) ObjectFactory.createInternalObject(type);
            }
            return (AbstractJavaClientGenerator)javaGenerator;

        }


//        if (context.getJavaClientGeneratorConfiguration() == null) {
//            return null;
//        }
//
//        String type = context.getJavaClientGeneratorConfiguration()
//                .getConfigurationType();
//
//        AbstractJavaClientGenerator javaGenerator;
//        if ("XMLMAPPER".equalsIgnoreCase(type)) { //$NON-NLS-1$
//            javaGenerator = new SimpleJavaClientGenerator(getClientProject());
//        } else if ("ANNOTATEDMAPPER".equalsIgnoreCase(type)) { //$NON-NLS-1$
//            javaGenerator = new SimpleAnnotatedClientGenerator(getClientProject());
//        } else if ("MAPPER".equalsIgnoreCase(type)) { //$NON-NLS-1$
//            javaGenerator = new SimpleJavaClientGenerator(getClientProject());
//        } else {
//            javaGenerator = (AbstractJavaClientGenerator) ObjectFactory
//                    .createInternalObject(type);
//        }
//
//        return javaGenerator;
    }

    /**
     * model类的生成方法
     * @param warnings
     * @param progressCallback
     */
    @Override
    protected void calculateJavaModelGenerators(List<String> warnings, ProgressCallback progressCallback) {
        super.calculateJavaModelGenerators(warnings, progressCallback);
    }
}
