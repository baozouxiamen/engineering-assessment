package com.company.interview.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
@Component
public class BeanCopyUtil {
    public static <T> T singleCopy(Object source, Class<T> target) {
        if (source == null) {
            return null;
        }

        try{
            T t = target.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public static <T> List<T> batchCopy(List<?> sources, Class<T> target) {
        if (CollectionUtils.isEmpty(sources) ) {
            return null;
        }

        List<T> ts = new ArrayList<>();
        for (Object source : sources) {
            ts.add(singleCopy(source, target));
        }
        return ts;
    }
}
