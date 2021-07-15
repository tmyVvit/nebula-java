/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

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
public class SpaceBackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<SpaceBackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("SpaceBackupInfo");
  private static final TField SPACE_FIELD_DESC = new TField("space", TType.STRUCT, (short)1);
  private static final TField INFO_FIELD_DESC = new TField("info", TType.LIST, (short)2);

  public SpaceDesc space;
  public List<BackupInfo> info;
  public static final int SPACE = 1;
  public static final int INFO = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE, new FieldMetaData("space", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, SpaceDesc.class)));
    tmpMetaDataMap.put(INFO, new FieldMetaData("info", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, BackupInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(SpaceBackupInfo.class, metaDataMap);
  }

  public SpaceBackupInfo() {
  }

  public SpaceBackupInfo(
      SpaceDesc space,
      List<BackupInfo> info) {
    this();
    this.space = space;
    this.info = info;
  }

  public static class Builder {
    private SpaceDesc space;
    private List<BackupInfo> info;

    public Builder() {
    }

    public Builder setSpace(final SpaceDesc space) {
      this.space = space;
      return this;
    }

    public Builder setInfo(final List<BackupInfo> info) {
      this.info = info;
      return this;
    }

    public SpaceBackupInfo build() {
      SpaceBackupInfo result = new SpaceBackupInfo();
      result.setSpace(this.space);
      result.setInfo(this.info);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpaceBackupInfo(SpaceBackupInfo other) {
    if (other.isSetSpace()) {
      this.space = TBaseHelper.deepCopy(other.space);
    }
    if (other.isSetInfo()) {
      this.info = TBaseHelper.deepCopy(other.info);
    }
  }

  public SpaceBackupInfo deepCopy() {
    return new SpaceBackupInfo(this);
  }

  public SpaceDesc getSpace() {
    return this.space;
  }

  public SpaceBackupInfo setSpace(SpaceDesc space) {
    this.space = space;
    return this;
  }

  public void unsetSpace() {
    this.space = null;
  }

  // Returns true if field space is set (has been assigned a value) and false otherwise
  public boolean isSetSpace() {
    return this.space != null;
  }

  public void setSpaceIsSet(boolean __value) {
    if (!__value) {
      this.space = null;
    }
  }

  public List<BackupInfo> getInfo() {
    return this.info;
  }

  public SpaceBackupInfo setInfo(List<BackupInfo> info) {
    this.info = info;
    return this;
  }

  public void unsetInfo() {
    this.info = null;
  }

  // Returns true if field info is set (has been assigned a value) and false otherwise
  public boolean isSetInfo() {
    return this.info != null;
  }

  public void setInfoIsSet(boolean __value) {
    if (!__value) {
      this.info = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE:
      if (__value == null) {
        unsetSpace();
      } else {
        setSpace((SpaceDesc)__value);
      }
      break;

    case INFO:
      if (__value == null) {
        unsetInfo();
      } else {
        setInfo((List<BackupInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE:
      return getSpace();

    case INFO:
      return getInfo();

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
    if (!(_that instanceof SpaceBackupInfo))
      return false;
    SpaceBackupInfo that = (SpaceBackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetSpace(), that.isSetSpace(), this.space, that.space)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetInfo(), that.isSetInfo(), this.info, that.info)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space, info});
  }

  @Override
  public int compareTo(SpaceBackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace()).compareTo(other.isSetSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space, other.space);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInfo()).compareTo(other.isSetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(info, other.info);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
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
        case SPACE:
          if (__field.type == TType.STRUCT) {
            this.space = new SpaceDesc();
            this.space.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case INFO:
          if (__field.type == TType.LIST) {
            {
              TList _list246 = iprot.readListBegin();
              this.info = new ArrayList<BackupInfo>(Math.max(0, _list246.size));
              for (int _i247 = 0; 
                   (_list246.size < 0) ? iprot.peekList() : (_i247 < _list246.size); 
                   ++_i247)
              {
                BackupInfo _elem248;
                _elem248 = new BackupInfo();
                _elem248.read(iprot);
                this.info.add(_elem248);
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
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.space != null) {
      oprot.writeFieldBegin(SPACE_FIELD_DESC);
      this.space.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.info != null) {
      oprot.writeFieldBegin(INFO_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.info.size()));
        for (BackupInfo _iter249 : this.info)        {
          _iter249.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("SpaceBackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getSpace() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getSpace(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("info");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getInfo() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getInfo(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
