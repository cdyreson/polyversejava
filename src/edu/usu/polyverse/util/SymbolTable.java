/*
 * The util package contains helpful code.
 */
package edu.usu.polyverse.util;

import java.lang.*;
import java.util.*;

/**
 * The SymbolTable manages the data nodes and their schemas.
 *
 * @author Curt
 */
public class SymbolTable {

    Map<String, Fields> table;
    Map<String, String> newNames;
    String currentNode = null;
    int currentField = 1;
    boolean foo;

    /*
     * Build a new SymbolTable
     */
    public SymbolTable() {
        table = new HashMap();
        newNames = new HashMap();
    }

        
    /* 
     * Describe the schema for the current node
     * @param string - name of entry
     * @returns - created string
     */
    public String describe() {
        return describe(currentNode);
    }
    
    /* 
     * Describe the schema for a node
     * @param string - name of entry
     * @returns - created string
     */
    public String describe(String name) {
        if (!table.containsKey(name)) {
           System.err.println("SymbolTable: Warning trying to describe *no* schema for " + name);
        }
        Fields current = table.get(name);
        String s = "Schema for " + name + ":";
        for (Field f : current) {
          s += f.fieldName + "." + f.ordinal;
          if (current.isId(f)) s += "(id)";
          if (current.isRef(f)) s += "(ref)";
          s += " ";
        }
        return s;
    }
    
    /* 
     * Add a field to the current node in the SymbolTable
     * @param fieldName - name of field to add
     * @param fieldType - type of the field
     * @returns - created field
     */
    public Field addField(String fieldName, String fieldType) {
        //System.out.println("System Table AddField " + fieldName + " " + fieldType);
        if (currentNode == null) {
            System.err.println("SymbolTable error: No current node set.");
            System.exit(-1);
        }
        if (!table.containsKey(currentNode)) {
            table.put(currentNode, new Fields());
        }
        Fields current = table.get(currentNode);
        return current.add(new Field(fieldName, fieldType, currentField++));
    }

    /* 
     * Add a data field to the current node in the SymbolTable
     * @param fieldName - name of field to add
     * @param fieldType - type of the field
     */
    public void addDataField(String fieldName, String fieldType) {
        //System.out.println("System Table AddField " + fieldName + " " + fieldType);
        if (currentNode == null) {
            System.err.println("SymbolTable error: No current node set.");
            System.exit(-1);
        }
        if (!table.containsKey(currentNode)) {
            table.put(currentNode, new Fields());
        }
        Fields current = table.get(currentNode);
        current.add(new Field(fieldName, fieldType, currentField++));
        setData();
    }

    /*
     * Append to the current schema all the nodes in the other
     */
    public void extendSchema(String node) {
        //System.out.println("Extending schema for " + currentNode + " with " + node);
        Fields fields = getFields(node);
        Fields myFields = table.get(currentNode);
        myFields.appendFields(fields);
        //for (Field field : fields) {
        //    myFields.add(new Field(field.getFieldName(), field.getFieldType(), currentField++));
        //}
    }

    /*
     * Append all of the hidden fields in the given schema to the current schema
     * @returns comma separated list of fields
     */
    public String extendWithHidden(String node) {
        //System.out.println("extending hidden fields for " + currentNode + " from " + node);
        Fields fields = getFields(node);
        Fields myFields = table.get(currentNode);
        return myFields.extendWithHidden(fields);
        //for (Field field : fields) {
        //    myFields.add(new Field(field.getFieldName(), field.getFieldType(), currentField++));
        //}
    }

    /*
     * Add a data node to the SymbolTable
     */
    public void addNode(String node) {
        //System.out.println("System Table AddNode " + node);
        table.put(node, new Fields());
        currentNode = node;
        currentField = 0;
    }

    /*
     * Set the id for this node
     */
    public void setId(int id) {
        //System.out.println("SettingID " + currentNode + "z");
        Fields f = getFields(currentNode);
        f.setIdField(id);
    }

    /*
     * Get a string of data fields for this node
     */
    public String getData(String node) {
        //System.out.println("gettingData " + node + "z");
        Fields f = getFields(node);
        return f.getDataFields();
    }

    /*
     * Lookup the id fields for this node
     */
    public String getId(String node) {
        //System.out.println("gettingID " + node + "z");
        Fields f = getFields(node);
        return f.getIdFields();
    }

    /*
     * Lookup the ref fields for this node
     */
    public String getRef(String node) {
        Fields f = getFields(node);
        return f.getRefFields();
    }

    /*
     * Set the ref for this node
     */
    public void setRef(int ref) {
        Fields f = getFields(currentNode);
        f.setRefField(ref);
    }

    /*
     * Set the data for this node
     */
    public void setData() {
        Fields f = getFields(currentNode);
        f.setDataField(f.fields.size() - 1);
    }

    /*
     * Lookup the field
     */
    private Fields getFields(String node) {
        if (!table.containsKey(node)) {
            System.err.println("System Table no known nodes " + node);
            System.exit(-1);
        }
        return table.get(node);
    }

    /* 
     * Map the old relation name to the new relation's name, usually
     * changing the name of the relation to the joined version.
     */
    public void mapName(String oldName, String newName) {
        newNames.put(oldName, newName);
    }

    /* Lookup the mappedName for a relation. If the name is not mapped,
     return the existing name.
     */
    public String lookupMappedName(String name) {
        if (newNames.containsKey(name)) {
            return newNames.get(name);
        }
        return name;
    }
}
