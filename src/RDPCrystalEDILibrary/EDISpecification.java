package RDPCrystalEDILibrary;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import RDPCrystalEDILibrary.*;
import jio.System.Text.*;

public class EDISpecification {
  protected NObject javonetHandle;
  /** GetProperty */
  public FileType getEDIFileType() {
    try {
      Object res = javonetHandle.<NEnum>get("EDIFileType");
      if (res == null) return null;
      return FileType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getX12VersionCode() {
    try {
      java.lang.String res = javonetHandle.get("X12VersionCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getX12Version() {
    try {
      java.lang.String res = javonetHandle.get("X12Version");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getX12TransactionSetCode() {
    try {
      java.lang.String res = javonetHandle.get("X12TransactionSetCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTMessageType() {
    try {
      java.lang.String res = javonetHandle.get("EDIFACTMessageType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTMessageVersion() {
    try {
      java.lang.String res = javonetHandle.get("EDIFACTMessageVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTReleaseVersion() {
    try {
      java.lang.String res = javonetHandle.get("EDIFACTReleaseVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTControllingAgency() {
    try {
      java.lang.String res = javonetHandle.get("EDIFACTControllingAgency");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeSenderIDQualifier() {
    try {
      java.lang.String res = javonetHandle.get("InterchangeSenderIDQualifier");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeSenderID() {
    try {
      java.lang.String res = javonetHandle.get("InterchangeSenderID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeReceiverIDQualifier() {
    try {
      java.lang.String res = javonetHandle.get("InterchangeReceiverIDQualifier");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeReceiverID() {
    try {
      java.lang.String res = javonetHandle.get("InterchangeReceiverID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Delimiters getDelimiters() {
    try {
      Object res = javonetHandle.<NObject>get("Delimiters");
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public static java.lang.String getTrimString() {
    try {
      java.lang.String res = Javonet.getType("EDISpecification").get("TrimString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setTrimString(java.lang.String param) {
    try {
      Javonet.getType("EDISpecification").set("TrimString", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDISpecification() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDISpecification");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDISpecification(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static EDISpecification FindSpecificationFromFile(java.lang.String path) {
    try {
      Object res = Javonet.getType("EDISpecification").invoke("FindSpecificationFromFile", path);
      if (res == null) return null;
      return new EDISpecification((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static EDISpecification FindSpecificationFromFile(
      java.lang.String path, Encoding encoding) {
    try {
      Object res =
          Javonet.getType("EDISpecification").invoke("FindSpecificationFromFile", path, encoding);
      if (res == null) return null;
      return new EDISpecification((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FileType FindFileTypeFromFile(java.lang.String path, Encoding encoding) {
    try {
      Object res =
          Javonet.getType("EDISpecification").invoke("FindFileTypeFromFile", path, encoding);
      if (res == null) return null;
      return FileType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FileType FindFileTypeFromString(java.lang.String fileData) {
    try {
      Object res = Javonet.getType("EDISpecification").invoke("FindFileTypeFromString", fileData);
      if (res == null) return null;
      return FileType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static EDISpecification FindSpecificationFromString(java.lang.String fileData) {
    try {
      Object res =
          Javonet.getType("EDISpecification").invoke("FindSpecificationFromString", fileData);
      if (res == null) return null;
      return new EDISpecification((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
