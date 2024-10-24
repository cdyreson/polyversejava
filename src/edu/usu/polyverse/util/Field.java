/*
 * A Field represents a field for the schema of a data node, which
 * consists of a field name and a field type
 */
package edu.usu.polyverse.util;

/**
 *
 * @author Curt
 */
public class Field {

    String fieldName;
    String fakeFieldName;
    String fieldType;
    int ordinal;
    
    // The prefix is the prefix of the artifical name
    static int suffixFixed = 200;
    static String prefixFixed = "z";

    /* 
     * Build a new field by passing in a name and a type
     * @param fieldName - field name
     * @param fieldType - field type
     */
    public Field(String fieldName, String fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.fakeFieldName = prefixFixed + suffixFixed++;
        this.ordinal = 0;
    }

    /* 
     * Build a new field by passing in a name and a type
     * @param fieldName - field name
     * @param fieldType - field type
     * @param int - ordinal
     */
    public Field(String fieldName, String fieldType, int ordinal) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.ordinal = ordinal;
        this.fakeFieldName = prefixFixed + suffixFixed++;
    }

    public String toString() {
        return fieldName + ":" + ordinal + ":" + fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFakeFieldName() {
        return fakeFieldName;
    }
    
    public String getFieldType() {
        return fieldType;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int i) {
        this.ordinal = i;
    }
}
