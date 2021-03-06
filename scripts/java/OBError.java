/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBError {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBError(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBError obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBError(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBError(String method, String errorMsg, String explanation, String possibleCause, String suggestedRemedy, obMessageLevel arg5) {
    this(openbabelJNI.new_OBError__SWIG_0(method, errorMsg, explanation, possibleCause, suggestedRemedy, arg5.swigValue()), true);
  }

  public OBError(String method, String errorMsg, String explanation, String possibleCause, String suggestedRemedy) {
    this(openbabelJNI.new_OBError__SWIG_1(method, errorMsg, explanation, possibleCause, suggestedRemedy), true);
  }

  public OBError(String method, String errorMsg, String explanation, String possibleCause) {
    this(openbabelJNI.new_OBError__SWIG_2(method, errorMsg, explanation, possibleCause), true);
  }

  public OBError(String method, String errorMsg, String explanation) {
    this(openbabelJNI.new_OBError__SWIG_3(method, errorMsg, explanation), true);
  }

  public OBError(String method, String errorMsg) {
    this(openbabelJNI.new_OBError__SWIG_4(method, errorMsg), true);
  }

  public OBError(String method) {
    this(openbabelJNI.new_OBError__SWIG_5(method), true);
  }

  public OBError() {
    this(openbabelJNI.new_OBError__SWIG_6(), true);
  }

  public String message() {
    return openbabelJNI.OBError_message(swigCPtr, this);
  }

  public String GetMethod() {
    return openbabelJNI.OBError_GetMethod(swigCPtr, this);
  }

  public String GetError() {
    return openbabelJNI.OBError_GetError(swigCPtr, this);
  }

  public String GetExplanation() {
    return openbabelJNI.OBError_GetExplanation(swigCPtr, this);
  }

  public String GetPossibleCause() {
    return openbabelJNI.OBError_GetPossibleCause(swigCPtr, this);
  }

  public String GetSuggestedRemedy() {
    return openbabelJNI.OBError_GetSuggestedRemedy(swigCPtr, this);
  }

  public obMessageLevel GetLevel() {
    return obMessageLevel.swigToEnum(openbabelJNI.OBError_GetLevel(swigCPtr, this));
  }

}
