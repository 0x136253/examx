package com.tew.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * <br>类 名: 集合，数组工具
 * <br>描 述: 描述类完成的主要功能
 * <br>作 者: shizhenwei
 * <br>创 建: 2017年5月15日
 * <br>版 本: v0.0.2
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class ArrayUtils {

    /**
     * 判断是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection){
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map){
        return map == null || map.isEmpty();
    }

    /**
     * 判断是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array){
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(List<Object> array){
        return array == null || array.size() == 0;
    }

    public static boolean isArray(Object object) {
        if(object == null){
            return false;
        }
        return object.getClass().isArray();
    }

    public static boolean isCollection(Object object) {
        return object instanceof Collection;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] objectToArray(Object obj) {
        if(obj == null){
            return (T[])new Object[0];
        }
        if(isArray(obj)){
            return (T[])obj;
        }else if(isCollection(obj)){
            return (T[]) ((Collection<T>)obj).toArray();
        }
        return (T[]) new Object[]{obj};
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> objectToList(Object obj){
        if(obj == null){
            return Collections.emptyList();
        }
        if(isArray(obj)){
            return Arrays.asList((T[])obj);
        }else if(isCollection(obj)){
            return new ArrayList<T>((Collection<T>)obj);
        }
        List<T> list = new ArrayList<T>();
        list.add((T) obj);
        return list;
    }

    public static int size(Object obj){
        if(obj == null){
            return 0;
        }
        if(isArray(obj)){
            return ((Object[])obj).length;
        }
        if(isCollection(obj)){
            return ((Collection<?>)obj).size();
        }
        return -1;
    }

    public static <T> boolean contains(T[] array, Object obj){
        return Arrays.asList(array).contains(obj);
    }
}
