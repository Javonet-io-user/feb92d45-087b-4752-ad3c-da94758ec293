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

public class Characters {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.Character getCARRET() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("CARRET");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCARRET(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("CARRET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getLEFT_CURLY_BRACES() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("LEFT_CURLY_BRACES");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLEFT_CURLY_BRACES(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("LEFT_CURLY_BRACES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getLEFT_CURLY_BRACES_STR() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("LEFT_CURLY_BRACES_STR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setLEFT_CURLY_BRACES_STR(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("LEFT_CURLY_BRACES_STR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getRIGHT_CURLY_BRACES() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("RIGHT_CURLY_BRACES");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRIGHT_CURLY_BRACES(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("RIGHT_CURLY_BRACES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getRIGHT_CURLY_BRACES_STR() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("RIGHT_CURLY_BRACES_STR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setRIGHT_CURLY_BRACES_STR(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("RIGHT_CURLY_BRACES_STR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getLEFT_BRACKET() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("LEFT_BRACKET");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLEFT_BRACKET(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("LEFT_BRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getRIGHT_BRACKET() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("RIGHT_BRACKET");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRIGHT_BRACKET(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("RIGHT_BRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getSEMICOLON() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("SEMICOLON");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSEMICOLON(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("SEMICOLON", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getASTERISK() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("ASTERISK");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setASTERISK(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("ASTERISK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getASTERISK_STR() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("ASTERISK_STR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setASTERISK_STR(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("ASTERISK_STR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getCOMMA() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("COMMA");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCOMMA(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("COMMA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getEQUAL() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("EQUAL");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEQUAL(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("EQUAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getTILDA() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("TILDA");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setTILDA(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("TILDA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getDOT() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("DOT");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setDOT(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("DOT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getATSIGN() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("ATSIGN");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setATSIGN(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("ATSIGN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getNUMBER_SIGN() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("NUMBER_SIGN");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNUMBER_SIGN(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("NUMBER_SIGN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getREQUIREMENT_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("REQUIREMENT_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setREQUIREMENT_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("REQUIREMENT_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getPAIR_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("PAIR_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setPAIR_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("PAIR_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getCONDITIONAL_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("CONDITIONAL_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCONDITIONAL_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("CONDITIONAL_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getLIST_CONDITIONAL_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("LIST_CONDITIONAL_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLIST_CONDITIONAL_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("LIST_CONDITIONAL_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getEXCLUSION_CONDITIONAL_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("EXCLUSION_CONDITIONAL_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEXCLUSION_CONDITIONAL_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("EXCLUSION_CONDITIONAL_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getEXCLAMATION_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("EXCLAMATION_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEXCLAMATION_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("EXCLAMATION_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getSPACE_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("SPACE_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSPACE_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("SPACE_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getSPACE_STR() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("SPACE_STR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setSPACE_STR(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("SPACE_STR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getRETURN_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("RETURN_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRETURN_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("RETURN_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getCARRIAGE_RETURN() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("CARRIAGE_RETURN");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCARRIAGE_RETURN(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("CARRIAGE_RETURN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getCOMPOSITE_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("COMPOSITE_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCOMPOSITE_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("COMPOSITE_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getEDIFACT_SERVICE_CHAR() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("EDIFACT_SERVICE_CHAR");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEDIFACT_SERVICE_CHAR(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("EDIFACT_SERVICE_CHAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getPLUS() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("PLUS");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setPLUS(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("PLUS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getFORWARD_SLASH() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("FORWARD_SLASH");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFORWARD_SLASH(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("FORWARD_SLASH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getDASH() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("DASH");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setDASH(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("DASH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getDASH_STR() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("DASH_STR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDASH_STR(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("DASH_STR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getAPOSTROPHE() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("APOSTROPHE");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setAPOSTROPHE(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("APOSTROPHE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getMANDATORY() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("MANDATORY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setMANDATORY(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("MANDATORY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getOPTIONAL() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("OPTIONAL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setOPTIONAL(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("OPTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getNOTUSED() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("NOTUSED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setNOTUSED(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("NOTUSED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getDEPENDENT() {
    try {
      java.lang.String res = Javonet.getType("Characters").get("DEPENDENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDEPENDENT(java.lang.String param) {
    try {
      Javonet.getType("Characters").set("DEPENDENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getUSAGE_MANDATORY() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("USAGE_MANDATORY");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setUSAGE_MANDATORY(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("USAGE_MANDATORY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getUSAGE_OPTIONAL() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("USAGE_OPTIONAL");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setUSAGE_OPTIONAL(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("USAGE_OPTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Character getUSAGE_NOTUSED() {
    try {
      java.lang.Character res = Javonet.getType("Characters").get("USAGE_NOTUSED");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setUSAGE_NOTUSED(java.lang.Character param) {
    try {
      Javonet.getType("Characters").set("USAGE_NOTUSED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Characters() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Characters");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Characters(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
