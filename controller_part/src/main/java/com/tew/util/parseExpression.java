package com.tew.util;

import com.alibaba.dubbo.common.utils.StringUtils;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Method;

public class parseExpression {
    public static <T> T parse(String expression, Method method, Object[] args, Class<T> classType) {
        if (StringUtils.isBlank(expression)) {
            return null;
        }
        else if (!expression.trim().startsWith("#") && !expression.trim().startsWith("$")) {
            return null;
        } else {
            LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();
            String[] paramNames = discoverer.getParameterNames(method);
            if (ArrayUtils.isEmpty(paramNames)) {
                return null;
            } else {
                StandardEvaluationContext context = new StandardEvaluationContext();

                for (int i = 0; i < paramNames.length; ++i) {
                    context.setVariable(paramNames[i], args[i]);
                }
                return (new SpelExpressionParser()).parseExpression(expression).getValue(context, classType);
            }
        }
    }
}
