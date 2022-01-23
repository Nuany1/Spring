package com.lucky.extension.selfConverter;

import com.lucky.extension.selfEditor.Address;
import org.springframework.core.convert.converter.Converter;

/**
 * 转换器 三种实现方式, Converter<String, Address>,GenericConverter
 * ConverterFactory<String, Address>
 * 自定义转换器创建好后需要注入到 ConversionServiceFactoryBean的Set<?> converters;
 * 注解通过@Bean使用
 * @author: Loki
 * @data: 2021-11-01 10:07
 **/
public class StudentConverter implements Converter<String, Address> {


    @Override
    public Address convert(String source) {
        Address address = new Address();
        address.setCity("123");
        System.out.println("source"+source);
        return address;
    }
}
