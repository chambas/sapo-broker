/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class Fault implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Fault");
  private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short)1);
  private static final TField FAULT_CODE_FIELD_DESC = new TField("fault_code", TType.STRING, (short)2);
  private static final TField FAULT_MESSAGE_FIELD_DESC = new TField("fault_message", TType.STRING, (short)3);
  private static final TField FAULT_DETAIL_FIELD_DESC = new TField("fault_detail", TType.STRING, (short)4);

  public String action_id;
  public static final int ACTION_ID = 1;
  public String fault_code;
  public static final int FAULT_CODE = 2;
  public String fault_message;
  public static final int FAULT_MESSAGE = 3;
  public String fault_detail;
  public static final int FAULT_DETAIL = 4;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(ACTION_ID, new FieldMetaData("action_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(FAULT_CODE, new FieldMetaData("fault_code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(FAULT_MESSAGE, new FieldMetaData("fault_message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(FAULT_DETAIL, new FieldMetaData("fault_detail", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Fault.class, metaDataMap);
  }

  public Fault() {
  }

  public Fault(
    String action_id,
    String fault_code,
    String fault_message,
    String fault_detail)
  {
    this();
    this.action_id = action_id;
    this.fault_code = fault_code;
    this.fault_message = fault_message;
    this.fault_detail = fault_detail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Fault(Fault other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetFault_code()) {
      this.fault_code = other.fault_code;
    }
    if (other.isSetFault_message()) {
      this.fault_message = other.fault_message;
    }
    if (other.isSetFault_detail()) {
      this.fault_detail = other.fault_detail;
    }
  }

  @Override
  public Fault clone() {
    return new Fault(this);
  }

  public String getAction_id() {
    return this.action_id;
  }

  public void setAction_id(String action_id) {
    this.action_id = action_id;
  }

  public void unsetAction_id() {
    this.action_id = null;
  }

  // Returns true if field action_id is set (has been asigned a value) and false otherwise
  public boolean isSetAction_id() {
    return this.action_id != null;
  }

  public void setAction_idIsSet(boolean value) {
    if (!value) {
      this.action_id = null;
    }
  }

  public String getFault_code() {
    return this.fault_code;
  }

  public void setFault_code(String fault_code) {
    this.fault_code = fault_code;
  }

  public void unsetFault_code() {
    this.fault_code = null;
  }

  // Returns true if field fault_code is set (has been asigned a value) and false otherwise
  public boolean isSetFault_code() {
    return this.fault_code != null;
  }

  public void setFault_codeIsSet(boolean value) {
    if (!value) {
      this.fault_code = null;
    }
  }

  public String getFault_message() {
    return this.fault_message;
  }

  public void setFault_message(String fault_message) {
    this.fault_message = fault_message;
  }

  public void unsetFault_message() {
    this.fault_message = null;
  }

  // Returns true if field fault_message is set (has been asigned a value) and false otherwise
  public boolean isSetFault_message() {
    return this.fault_message != null;
  }

  public void setFault_messageIsSet(boolean value) {
    if (!value) {
      this.fault_message = null;
    }
  }

  public String getFault_detail() {
    return this.fault_detail;
  }

  public void setFault_detail(String fault_detail) {
    this.fault_detail = fault_detail;
  }

  public void unsetFault_detail() {
    this.fault_detail = null;
  }

  // Returns true if field fault_detail is set (has been asigned a value) and false otherwise
  public boolean isSetFault_detail() {
    return this.fault_detail != null;
  }

  public void setFault_detailIsSet(boolean value) {
    if (!value) {
      this.fault_detail = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ACTION_ID:
      setAction_id((String)value);
      break;

    case FAULT_CODE:
      setFault_code((String)value);
      break;

    case FAULT_MESSAGE:
      setFault_message((String)value);
      break;

    case FAULT_DETAIL:
      setFault_detail((String)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ACTION_ID:
      return getAction_id();

    case FAULT_CODE:
      return getFault_code();

    case FAULT_MESSAGE:
      return getFault_message();

    case FAULT_DETAIL:
      return getFault_detail();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ACTION_ID:
      return isSetAction_id();
    case FAULT_CODE:
      return isSetFault_code();
    case FAULT_MESSAGE:
      return isSetFault_message();
    case FAULT_DETAIL:
      return isSetFault_detail();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Fault)
      return this.equals((Fault)that);
    return false;
  }

  public boolean equals(Fault that) {
    if (that == null)
      return false;

    boolean this_present_action_id = true && this.isSetAction_id();
    boolean that_present_action_id = true && that.isSetAction_id();
    if (this_present_action_id || that_present_action_id) {
      if (!(this_present_action_id && that_present_action_id))
        return false;
      if (!this.action_id.equals(that.action_id))
        return false;
    }

    boolean this_present_fault_code = true && this.isSetFault_code();
    boolean that_present_fault_code = true && that.isSetFault_code();
    if (this_present_fault_code || that_present_fault_code) {
      if (!(this_present_fault_code && that_present_fault_code))
        return false;
      if (!this.fault_code.equals(that.fault_code))
        return false;
    }

    boolean this_present_fault_message = true && this.isSetFault_message();
    boolean that_present_fault_message = true && that.isSetFault_message();
    if (this_present_fault_message || that_present_fault_message) {
      if (!(this_present_fault_message && that_present_fault_message))
        return false;
      if (!this.fault_message.equals(that.fault_message))
        return false;
    }

    boolean this_present_fault_detail = true && this.isSetFault_detail();
    boolean that_present_fault_detail = true && that.isSetFault_detail();
    if (this_present_fault_detail || that_present_fault_detail) {
      if (!(this_present_fault_detail && that_present_fault_detail))
        return false;
      if (!this.fault_detail.equals(that.fault_detail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ACTION_ID:
          if (field.type == TType.STRING) {
            this.action_id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAULT_CODE:
          if (field.type == TType.STRING) {
            this.fault_code = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAULT_MESSAGE:
          if (field.type == TType.STRING) {
            this.fault_message = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAULT_DETAIL:
          if (field.type == TType.STRING) {
            this.fault_detail = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
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
    if (this.action_id != null) {
      oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
      oprot.writeString(this.action_id);
      oprot.writeFieldEnd();
    }
    if (this.fault_code != null) {
      oprot.writeFieldBegin(FAULT_CODE_FIELD_DESC);
      oprot.writeString(this.fault_code);
      oprot.writeFieldEnd();
    }
    if (this.fault_message != null) {
      oprot.writeFieldBegin(FAULT_MESSAGE_FIELD_DESC);
      oprot.writeString(this.fault_message);
      oprot.writeFieldEnd();
    }
    if (this.fault_detail != null) {
      oprot.writeFieldBegin(FAULT_DETAIL_FIELD_DESC);
      oprot.writeString(this.fault_detail);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Fault(");
    boolean first = true;

    if (isSetAction_id()) {
      sb.append("action_id:");
      if (this.action_id == null) {
        sb.append("null");
      } else {
        sb.append(this.action_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("fault_code:");
    if (this.fault_code == null) {
      sb.append("null");
    } else {
      sb.append(this.fault_code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fault_message:");
    if (this.fault_message == null) {
      sb.append("null");
    } else {
      sb.append(this.fault_message);
    }
    first = false;
    if (isSetFault_detail()) {
      if (!first) sb.append(", ");
      sb.append("fault_detail:");
      if (this.fault_detail == null) {
        sb.append("null");
      } else {
        sb.append(this.fault_detail);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
