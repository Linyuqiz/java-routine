package main;

import java.beans.PropertyEditorSupport;

public class AddressBOPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] properties = text.split("_");
        AddressBO address = new AddressBO();
        address.setProvince(properties[0]);
        address.setCity(properties[1]);
        this.setValue(address);
    }
}
