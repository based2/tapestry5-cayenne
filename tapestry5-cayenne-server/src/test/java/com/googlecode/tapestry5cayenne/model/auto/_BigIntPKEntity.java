package com.googlecode.tapestry5cayenne.model.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _BigIntPKEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BigIntPKEntity extends CayenneDataObject {

    private static final long serialVersionUID = 2528984369723773554L;

    public static final String NAME_PROPERTY = "name";

    public static final String ID_PK_COLUMN = "id";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

}
