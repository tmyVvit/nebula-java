/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum HostRole implements com.facebook.thrift.TEnum {
  GRAPH(0),
  META(1),
  STORAGE(2),
  LISTENER(3),
  UNKNOWN(4);

  private final int value;

  private HostRole(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static HostRole findByValue(int value) { 
    switch (value) {
      case 0:
        return GRAPH;
      case 1:
        return META;
      case 2:
        return STORAGE;
      case 3:
        return LISTENER;
      case 4:
        return UNKNOWN;
      default:
        return null;
    }
  }
}