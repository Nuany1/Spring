package com.lucky.extension.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * 编辑器
 * @author: Loki
 * @data: 2021-10-13 15:17
 **/
public class AddressPropertyEditor extends PropertyEditorSupport {
    /**
     *
     * @param text
     * @throws IllegalArgumentException
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        final String[] split = text.split("_");
        Address address = new Address();
        final int length = split.length;
        address.setProvince(length>0?split[0]:"");
        address.setCity(length>1?split[1]:"");
        address.setTown(length>2?split[2]:"");
        setValue(address);
    }
}
