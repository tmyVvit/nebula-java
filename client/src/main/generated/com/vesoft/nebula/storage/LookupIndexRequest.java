/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class LookupIndexRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LookupIndexRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField INDICES_FIELD_DESC = new TField("indices", TType.STRUCT, (short)3);
  private static final TField RETURN_COLUMNS_FIELD_DESC = new TField("return_columns", TType.LIST, (short)4);

  public int space_id;
  public List<Integer> parts;
  public IndexSpec indices;
  public List<byte[]> return_columns;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int INDICES = 3;
  public static final int RETURN_COLUMNS = 4;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(INDICES, new FieldMetaData("indices", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, IndexSpec.class)));
    tmpMetaDataMap.put(RETURN_COLUMNS, new FieldMetaData("return_columns", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(LookupIndexRequest.class, metaDataMap);
  }

  public LookupIndexRequest() {
  }

  public LookupIndexRequest(
      int space_id,
      List<Integer> parts) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  public LookupIndexRequest(
      int space_id,
      List<Integer> parts,
      IndexSpec indices) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.indices = indices;
  }

  public LookupIndexRequest(
      int space_id,
      List<Integer> parts,
      IndexSpec indices,
      List<byte[]> return_columns) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.indices = indices;
    this.return_columns = return_columns;
  }

  public static class Builder {
    private int space_id;
    private List<Integer> parts;
    private IndexSpec indices;
    private List<byte[]> return_columns;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final List<Integer> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setIndices(final IndexSpec indices) {
      this.indices = indices;
      return this;
    }

    public Builder setReturn_columns(final List<byte[]> return_columns) {
      this.return_columns = return_columns;
      return this;
    }

    public LookupIndexRequest build() {
      LookupIndexRequest result = new LookupIndexRequest();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setIndices(this.indices);
      result.setReturn_columns(this.return_columns);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LookupIndexRequest(LookupIndexRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetIndices()) {
      this.indices = TBaseHelper.deepCopy(other.indices);
    }
    if (other.isSetReturn_columns()) {
      this.return_columns = TBaseHelper.deepCopy(other.return_columns);
    }
  }

  public LookupIndexRequest deepCopy() {
    return new LookupIndexRequest(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public LookupIndexRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public List<Integer> getParts() {
    return this.parts;
  }

  public LookupIndexRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public IndexSpec getIndices() {
    return this.indices;
  }

  public LookupIndexRequest setIndices(IndexSpec indices) {
    this.indices = indices;
    return this;
  }

  public void unsetIndices() {
    this.indices = null;
  }

  // Returns true if field indices is set (has been assigned a value) and false otherwise
  public boolean isSetIndices() {
    return this.indices != null;
  }

  public void setIndicesIsSet(boolean __value) {
    if (!__value) {
      this.indices = null;
    }
  }

  public List<byte[]> getReturn_columns() {
    return this.return_columns;
  }

  public LookupIndexRequest setReturn_columns(List<byte[]> return_columns) {
    this.return_columns = return_columns;
    return this;
  }

  public void unsetReturn_columns() {
    this.return_columns = null;
  }

  // Returns true if field return_columns is set (has been assigned a value) and false otherwise
  public boolean isSetReturn_columns() {
    return this.return_columns != null;
  }

  public void setReturn_columnsIsSet(boolean __value) {
    if (!__value) {
      this.return_columns = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)__value);
      }
      break;

    case INDICES:
      if (__value == null) {
        unsetIndices();
      } else {
        setIndices((IndexSpec)__value);
      }
      break;

    case RETURN_COLUMNS:
      if (__value == null) {
        unsetReturn_columns();
      } else {
        setReturn_columns((List<byte[]>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case INDICES:
      return getIndices();

    case RETURN_COLUMNS:
      return getReturn_columns();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof LookupIndexRequest))
      return false;
    LookupIndexRequest that = (LookupIndexRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetIndices(), that.isSetIndices(), this.indices, that.indices)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetReturn_columns(), that.isSetReturn_columns(), this.return_columns, that.return_columns)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, indices, return_columns});
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.LIST) {
            {
              TList _list159 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list159.size));
              for (int _i160 = 0; 
                   (_list159.size < 0) ? iprot.peekList() : (_i160 < _list159.size); 
                   ++_i160)
              {
                int _elem161;
                _elem161 = iprot.readI32();
                this.parts.add(_elem161);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case INDICES:
          if (__field.type == TType.STRUCT) {
            this.indices = new IndexSpec();
            this.indices.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case RETURN_COLUMNS:
          if (__field.type == TType.LIST) {
            {
              TList _list162 = iprot.readListBegin();
              this.return_columns = new ArrayList<byte[]>(Math.max(0, _list162.size));
              for (int _i163 = 0; 
                   (_list162.size < 0) ? iprot.peekList() : (_i163 < _list162.size); 
                   ++_i163)
              {
                byte[] _elem164;
                _elem164 = iprot.readBinary();
                this.return_columns.add(_elem164);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetSpace_id()) {
      throw new TProtocolException("Required field 'space_id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
        for (int _iter165 : this.parts)        {
          oprot.writeI32(_iter165);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.indices != null) {
      oprot.writeFieldBegin(INDICES_FIELD_DESC);
      this.indices.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.return_columns != null) {
      if (isSetReturn_columns()) {
        oprot.writeFieldBegin(RETURN_COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.return_columns.size()));
          for (byte[] _iter166 : this.return_columns)          {
            oprot.writeBinary(_iter166);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("LookupIndexRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("indices");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getIndices() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getIndices(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetReturn_columns())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("return_columns");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getReturn_columns() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getReturn_columns(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'space_id' because it's a primitive and you chose the non-beans generator.
    if (parts == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'parts' was not present! Struct: " + toString());
    }
  }

}
