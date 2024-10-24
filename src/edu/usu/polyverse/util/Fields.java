/*
 * Represents a data structure to contain the fields in a schema for a
 * data node.  This implementation is as a List.
 */
package edu.usu.polyverse.util;

import java.util.*;

/**
 * A List of Field objects
 *
 * @author Curt
 */
public class Fields implements Iterable<Field> {

    List<Field> fields;
    List<Integer> idFields;
    List<Integer> refFields;
    List<Integer> dataFields;

    public Fields() {
        fields = new LinkedList();
        idFields = new LinkedList();
        refFields = new LinkedList();
        dataFields = new LinkedList();
    }

    public String toString() {

        String s = "";
        s += "FIELDS size " + fields.size() + " fieldsList: ";
        for (Field i : fields) {
            s += i + ",";
        }
        s += " idList: ";
        for (Integer i : idFields) {
            s += i + ",";
        }
        s += " refList: ";
        for (Integer i : refFields) {
            s += i + ",";
        }
        s += " dataList: ";
        for (Integer i : dataFields) {
            s += i + ",";
        }
        return s;
    }

    /*
     * Append a Field to the List
     */
    public Field add(Field f) {
        f.setOrdinal(fields.size());  // Starts at zero
        fields.add(f);
        return f;
    }

    /*
     * Is this field an ID field?
     */
    public boolean isId(Field f) {
        int i = f.getOrdinal();
        for (Integer j : idFields) {
            if (j.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    /*
     * Is this field a ref field?
     */
    public boolean isRef(Field f) {
        int i = f.getOrdinal();
        for (Integer j : refFields) {
            if (j.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    /*
     * Iterate over the fields
     */
    @Override
    public Iterator<Field> iterator() {
        return fields.iterator();
    }

    /*
     * Append fields from another Fields object to this one
     */
    public void appendFields(Fields other) {
        //System.out.println("Append " + this);
        //System.out.println("other " + other);

        int size = fields.size();
        for (Field f : other) {
            //System.out.println("adding field " + f + " " + size);
            add(f);
        }
        for (Integer i : other.idFields) {
            setIdField(i + size);
        }
        for (Integer i : other.refFields) {
            setRefField(i + size);
        }
        // Set the data fields
        for (Integer i : other.dataFields) {
            setDataField(i + size);
        }
        //System.out.println("This " + this);
    }

    /*
     * Append hidden fields from another Fields object to this one
     * The hidden fields are the advice and cuts
     * @returns comma separated string of fields
     */
    public String extendWithHidden(Fields other) {
        //System.out.println("Hidden " + this);
        //System.out.println("other " + other);
        String s = " ";
        boolean first = true;
        for (Integer i : other.idFields) {
            if (!first) {
                s += ", ";
            }
            first = false;
            //System.out.println("extending id " + i);
            setIdField(fields.size());
            fields.add(other.getFieldAtPosition(i.intValue()));

            s += "$" + fields.size();
        }
        for (Integer i : other.refFields) {
            if (!first) {
                s += ", ";
            }
            first = false;
            //System.out.println("extending ref " + i);
            setRefField(fields.size());
            fields.add(other.getFieldAtPosition(i.intValue()));

            s += "$" + fields.size();

        }
        // Set the data fields
        /*
         for (Integer i : other.dataFields) {
         //System.out.println("adding ref " + i);
         dataFields.add(i);
         }
         */
        //System.out.println("This " + this);
        return "," + s;
    }

    /*
     * Lookup the Field at the ordinal position for the given ordinal
     */
    public Field getFieldAtPosition(int i) {
        return fields.get(i);
        /*
         int current = i;
         //System.out.println("GetFieldAtPosition " + i + " " + fields.size());
         for (Field f : fields) {
         if (current == 0) {
         return f;
         }
         current--;
         }
         System.err.println("SymbolTable: No field for ordinal " + i);
         System.exit(-1);
         return null;
         */
    }

    /*
     * Lookup the ordinal position for the given field name
     */
    public int getOrdinal(String key) {
        int current = 1;
        for (Field f : fields) {
            if (f.getFieldName().equals(key)) {
                return current;
            }
            current++;
        }
        return 0;
    }

    /*
     * Lookup the datatype for the given field name
     */
    public String getDataType(String key) {
        for (Field f : fields) {
            if (f.getFieldName().equals(key)) {
                return f.getFieldType();
            }
        }
        return null;
    }

    /*
     * Lookup the data Fields
     */
    public String getDataFields() {
        String s = "(";
        //System.out.println("getting data fields");
        boolean first = true;
        for (Integer i : dataFields) {
            //System.out.println("data field " + i);
            if (!first) {
                s += ", ";
                first = false;
            }
            s += "$" + i;
        }
        return s + ")";

    }

    /*
     * Lookup the id Field
     */
    public String getIdFields() {
        String s = "(";
        //System.out.println("getting id fields");
        boolean first = true;
        for (Integer i : idFields) {
            //System.out.println("id field " + i);
            if (!first) {
                s += ", ";
                first = false;
            }
            s += "$" + i;
        }
        return s + ")";

    }

    /*
     * Lookup the ref Field
     */
    public String getRefFields() {
        String s = "(";
        boolean first = true;
        for (Integer i : refFields) {
            if (!first) {
                s += ", ";
                first = false;
            }
            s += "$" + i;
        }
        return s + ")";
    }

    /*
     * Set the ref Field
     */
    public void setRefField(int field) {
        refFields.add(field);
    }

    /*
     * Set a data Field
     */
    public void setDataField(int field) {
        dataFields.add(field);
    }

    /*
     * Set the id Field
     */
    public void setIdField(int field) {
        //System.out.println("Seting id field" + field);
        idFields.add(field);
    }
}
