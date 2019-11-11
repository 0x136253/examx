package com.tew.util;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {


    public MyJavaTypeResolver(){
        super();
        super.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        super.typeMap.put(-6, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }

//    @Override
//    protected FullyQualifiedJavaType calculateBigDecimalReplacement(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
//        FullyQualifiedJavaType answer;
//        if (column.getScale() > 0 || column.getLength() > 18 || forceBigDecimals) {
//            answer = defaultType;
//        } else if (column.getLength() > 9) {
//            answer = new FullyQualifiedJavaType(Long.class.getName());
//        } else {
//            answer = new FullyQualifiedJavaType(Integer.class.getName());
//        }
//        return answer;
//    }
}