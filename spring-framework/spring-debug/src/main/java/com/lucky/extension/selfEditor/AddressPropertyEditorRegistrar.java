package com.lucky.extension.selfEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * 注入 new AddressPropertyEditor()
 * @author: Loki
 * @data: 2021-10-13 15:21
 **/
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {
    /**
     * invokeBeanFactoryPostProcessors()
     * CustomEditorConfigurer -> postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
     * 添加到propertyEditorRegistrars Set 集合
     *
     * @param registry the {@code PropertyEditorRegistry} to register the
     */

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Address.class,new AddressPropertyEditor());
    }
}
