/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBExternalBond {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBExternalBond(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBExternalBond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBExternalBond(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBExternalBond() {
    this(openbabelJNI.new_OBExternalBond__SWIG_0(), true);
  }

  public OBExternalBond(OBAtom arg0, OBBond arg1, int arg2) {
    this(openbabelJNI.new_OBExternalBond__SWIG_1(OBAtom.getCPtr(arg0), arg0, OBBond.getCPtr(arg1), arg1, arg2), true);
  }

  public OBExternalBond(OBExternalBond arg0) {
    this(openbabelJNI.new_OBExternalBond__SWIG_2(OBExternalBond.getCPtr(arg0), arg0), true);
  }

  public int GetIdx() {
    return openbabelJNI.OBExternalBond_GetIdx(swigCPtr, this);
  }

  public OBAtom GetAtom() {
    long cPtr = openbabelJNI.OBExternalBond_GetAtom(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBBond GetBond() {
    long cPtr = openbabelJNI.OBExternalBond_GetBond(swigCPtr, this);
    return (cPtr == 0) ? null : new OBBond(cPtr, false);
  }

  public void SetIdx(int idx) {
    openbabelJNI.OBExternalBond_SetIdx(swigCPtr, this, idx);
  }

  public void SetAtom(OBAtom atom) {
    openbabelJNI.OBExternalBond_SetAtom(swigCPtr, this, OBAtom.getCPtr(atom), atom);
  }

  public void SetBond(OBBond bond) {
    openbabelJNI.OBExternalBond_SetBond(swigCPtr, this, OBBond.getCPtr(bond), bond);
  }

}
