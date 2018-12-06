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
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;

public class EDIFileSplitter extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setEDIFileType(FileType value) {
    try {
      javonetHandle.set("EDIFileType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
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
  /** SetProperty */

  public void setOutputFilename(java.lang.String value) {
    try {
      javonetHandle.set("OutputFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOutputFilename() {
    try {
      java.lang.String res = javonetHandle.get("OutputFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setGeneratePseudoRandomNumberInFilename(java.lang.Boolean value) {
    try {
      javonetHandle.set("GeneratePseudoRandomNumberInFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getGeneratePseudoRandomNumberInFilename() {
    try {
      java.lang.Boolean res = javonetHandle.get("GeneratePseudoRandomNumberInFilename");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOutputFilenameFormat(java.lang.String value) {
    try {
      javonetHandle.set("OutputFilenameFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOutputFilenameFormat() {
    try {
      java.lang.String res = javonetHandle.get("OutputFilenameFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNumberOfItemsPerFile(java.lang.Integer value) {
    try {
      javonetHandle.set("NumberOfItemsPerFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getNumberOfItemsPerFile() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfItemsPerFile");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSplitFileExtension(java.lang.String value) {
    try {
      javonetHandle.set("SplitFileExtension", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSplitFileExtension() {
    try {
      java.lang.String res = javonetHandle.get("SplitFileExtension");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setTrimString(java.lang.String value) {
    try {
      javonetHandle.set("TrimString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTrimString() {
    try {
      java.lang.String res = javonetHandle.get("TrimString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFileSplitLevel(FileSplitLevel value) {
    try {
      javonetHandle.set("FileSplitLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileSplitLevel getFileSplitLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("FileSplitLevel");
      if (res == null) return null;
      return FileSplitLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setReadBlockSize(java.lang.Integer value) {
    try {
      javonetHandle.set("ReadBlockSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getReadBlockSize() {
    try {
      java.lang.Integer res = javonetHandle.get("ReadBlockSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setWriteBlockBuffer(java.lang.Integer value) {
    try {
      javonetHandle.set("WriteBlockBuffer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getWriteBlockBuffer() {
    try {
      java.lang.Integer res = javonetHandle.get("WriteBlockBuffer");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public EDIFileSplitter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileSplitter");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnFileOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<FileOperationCompletedEventArgs> handler :
                  _OnFileOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FileOperationCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileSplitter(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileSplitter", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnFileOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<FileOperationCompletedEventArgs> handler :
                  _OnFileOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FileOperationCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileSplitter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Split(java.lang.String file, java.lang.String outputDirectory) {
    try {
      javonetHandle.invoke("Split", file, outputDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Split(java.lang.String file, java.lang.String outputDirectory, Object state) {
    try {
      javonetHandle.invoke("Split", file, outputDirectory, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SplitAsync(java.lang.String file, java.lang.String outputDirectory, Object state) {
    try {
      javonetHandle.invoke("SplitAsync", file, outputDirectory, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<FileOperationCompletedEventArgs>>
      _OnFileOperationCompletedListeners =
          new java.util.ArrayList<EventHandler<FileOperationCompletedEventArgs>>();

  public void addOnFileOperationCompleted(EventHandler<FileOperationCompletedEventArgs> toAdd) {
    _OnFileOperationCompletedListeners.add(toAdd);
  }

  public void removeOnFileOperationCompleted(
      EventHandler<FileOperationCompletedEventArgs> toRemove) {
    _OnFileOperationCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
