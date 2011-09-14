package com.googlecode.tapestry5cayenne.model.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _StringPKEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _StringPKEntity extends CayenneDataObject {

    private static final long serialVersionUID = 8979076388912754948L;
    public static final String ID_PROPERTY = "id";
    public static final String INT_PROP1_PROPERTY = "intProp1";
    public static final String STRING_PROP1_PROPERTY = "stringProp1";
    public static final String STRING_PROP2_PROPERTY = "stringProp2";

    public static final String ID_PK_COLUMN = "id";

    public void setId(String id) {
        writeProperty("id", id);
    }
    public String getId() {
        return (String)readProperty("id");
    }

    public void setIntProp1(Integer intProp1) {
        writeProperty("intProp1", intProp1);
    }
    public Integer getIntProp1() {
        return (Integer)readProperty("intProp1");
    }

    public void setStringProp1(String stringProp1) {
        writeProperty("stringProp1", stringProp1);
    }
    public String getStringProp1() {
        return (String)readProperty("stringProp1");
    }

    public void setStringProp2(String stringProp2) {
        writeProperty("stringProp2", stringProp2);
    }
    public String getStringProp2() {
        return (String)readProperty("stringProp2");
    }

}
