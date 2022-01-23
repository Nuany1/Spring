package com.lucky.config;

import com.lucky.extension.selfEditor.Address;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * ClassName:    MyConfig
 * Package:    com.SpringConfig
 * Description:
 * Datetime:    2020/12/31   20:51
 * Author:
 *
 * @author Nuany
 */

@Configuration  //标记类为配置类
@ComponentScan(value = "com.lucky.entity", excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, classes = Controller.class)
}/*,includeFilters = {
        @Filter(type = FilterType.ANNOTATION,classes = Service.class)
},useDefaultFilters = false*/)
@PropertySource(value = {"classpath:/db.properties"})
@Component
public class ContextConfig {


}
