/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBBond extends OBBase {
  private long swigCPtr;

  protected OBBond(long cPtr, boolean cMemoryOwn) {
    super(openbabelJNI.SWIGOBBondUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBBond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBBond(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public void setVisit(boolean value) {
    openbabelJNI.OBBond_Visit_set(swigCPtr, this, value);
  }

  public boolean getVisit() {
    return openbabelJNI.OBBond_Visit_get(swigCPtr, this);
  }

  public OBBond() {
    this(openbabelJNI.new_OBBond(), true);
  }

  public void SetIdx(int idx) {
    openbabelJNI.OBBond_SetIdx(swigCPtr, this, idx);
  }

  public void SetBO(int order) {
    openbabelJNI.OBBond_SetBO(swigCPtr, this, order);
  }

  public void SetBondOrder(int order) {
    openbabelJNI.OBBond_SetBondOrder(swigCPtr, this, order);
  }

  public void SetBegin(OBAtom begin) {
    openbabelJNI.OBBond_SetBegin(swigCPtr, this, OBAtom.getCPtr(begin), begin);
  }

  public void SetEnd(OBAtom end) {
    openbabelJNI.OBBond_SetEnd(swigCPtr, this, OBAtom.getCPtr(end), end);
  }

  public void SetParent(OBMol ptr) {
    openbabelJNI.OBBond_SetParent(swigCPtr, this, OBMol.getCPtr(ptr), ptr);
  }

  public void SetLength(OBAtom fixed, double length) {
    openbabelJNI.OBBond_SetLength(swigCPtr, this, OBAtom.getCPtr(fixed), fixed, length);
  }

  public void Set(int index, OBAtom begin, OBAtom end, int order, int flags) {
    openbabelJNI.OBBond_Set(swigCPtr, this, index, OBAtom.getCPtr(begin), begin, OBAtom.getCPtr(end), end, order, flags);
  }

  public void SetKSingle() {
    openbabelJNI.OBBond_SetKSingle(swigCPtr, this);
  }

  public void SetKDouble() {
    openbabelJNI.OBBond_SetKDouble(swigCPtr, this);
  }

  public void SetKTriple() {
    openbabelJNI.OBBond_SetKTriple(swigCPtr, this);
  }

  public void SetAromatic() {
    openbabelJNI.OBBond_SetAromatic(swigCPtr, this);
  }

  public void SetHash() {
    openbabelJNI.OBBond_SetHash(swigCPtr, this);
  }

  public void SetWedge() {
    openbabelJNI.OBBond_SetWedge(swigCPtr, this);
  }

  public void SetUp() {
    openbabelJNI.OBBond_SetUp(swigCPtr, this);
  }

  public void SetDown() {
    openbabelJNI.OBBond_SetDown(swigCPtr, this);
  }

  public void SetInRing() {
    openbabelJNI.OBBond_SetInRing(swigCPtr, this);
  }

  public void SetClosure() {
    openbabelJNI.OBBond_SetClosure(swigCPtr, this);
  }

  public void UnsetHash() {
    openbabelJNI.OBBond_UnsetHash(swigCPtr, this);
  }

  public void UnsetWedge() {
    openbabelJNI.OBBond_UnsetWedge(swigCPtr, this);
  }

  public void UnsetUp() {
    openbabelJNI.OBBond_UnsetUp(swigCPtr, this);
  }

  public void UnsetDown() {
    openbabelJNI.OBBond_UnsetDown(swigCPtr, this);
  }

  public void UnsetAromatic() {
    openbabelJNI.OBBond_UnsetAromatic(swigCPtr, this);
  }

  public void UnsetKekule() {
    openbabelJNI.OBBond_UnsetKekule(swigCPtr, this);
  }

  public long GetIdx() {
    return openbabelJNI.OBBond_GetIdx(swigCPtr, this);
  }

  public long GetBO() {
    return openbabelJNI.OBBond_GetBO(swigCPtr, this);
  }

  public long GetBondOrder() {
    return openbabelJNI.OBBond_GetBondOrder(swigCPtr, this);
  }

  public long GetFlags() {
    return openbabelJNI.OBBond_GetFlags(swigCPtr, this);
  }

  public long GetBeginAtomIdx() {
    return openbabelJNI.OBBond_GetBeginAtomIdx(swigCPtr, this);
  }

  public long GetEndAtomIdx() {
    return openbabelJNI.OBBond_GetEndAtomIdx(swigCPtr, this);
  }

  public OBAtom GetBeginAtom() {
    long cPtr = openbabelJNI.OBBond_GetBeginAtom__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetEndAtom() {
    long cPtr = openbabelJNI.OBBond_GetEndAtom__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetNbrAtom(OBAtom ptr) {
    long cPtr = openbabelJNI.OBBond_GetNbrAtom(swigCPtr, this, OBAtom.getCPtr(ptr), ptr);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBMol GetParent() {
    long cPtr = openbabelJNI.OBBond_GetParent(swigCPtr, this);
    return (cPtr == 0) ? null : new OBMol(cPtr, false);
  }

  public double GetEquibLength() {
    return openbabelJNI.OBBond_GetEquibLength(swigCPtr, this);
  }

  public double GetLength() {
    return openbabelJNI.OBBond_GetLength(swigCPtr, this);
  }

  public long GetNbrAtomIdx(OBAtom ptr) {
    return openbabelJNI.OBBond_GetNbrAtomIdx(swigCPtr, this, OBAtom.getCPtr(ptr), ptr);
  }

  public boolean IsAromatic() {
    return openbabelJNI.OBBond_IsAromatic(swigCPtr, this);
  }

  public boolean IsInRing() {
    return openbabelJNI.OBBond_IsInRing(swigCPtr, this);
  }

  public boolean IsRotor() {
    return openbabelJNI.OBBond_IsRotor(swigCPtr, this);
  }

  public boolean IsAmide() {
    return openbabelJNI.OBBond_IsAmide(swigCPtr, this);
  }

  public boolean IsPrimaryAmide() {
    return openbabelJNI.OBBond_IsPrimaryAmide(swigCPtr, this);
  }

  public boolean IsSecondaryAmide() {
    return openbabelJNI.OBBond_IsSecondaryAmide(swigCPtr, this);
  }

  public boolean IsEster() {
    return openbabelJNI.OBBond_IsEster(swigCPtr, this);
  }

  public boolean IsCarbonyl() {
    return openbabelJNI.OBBond_IsCarbonyl(swigCPtr, this);
  }

  public boolean IsSingle() {
    return openbabelJNI.OBBond_IsSingle(swigCPtr, this);
  }

  public boolean IsDouble() {
    return openbabelJNI.OBBond_IsDouble(swigCPtr, this);
  }

  public boolean IsTriple() {
    return openbabelJNI.OBBond_IsTriple(swigCPtr, this);
  }

  public boolean IsKSingle() {
    return openbabelJNI.OBBond_IsKSingle(swigCPtr, this);
  }

  public boolean IsKDouble() {
    return openbabelJNI.OBBond_IsKDouble(swigCPtr, this);
  }

  public boolean IsKTriple() {
    return openbabelJNI.OBBond_IsKTriple(swigCPtr, this);
  }

  public boolean IsClosure() {
    return openbabelJNI.OBBond_IsClosure(swigCPtr, this);
  }

  public boolean IsUp() {
    return openbabelJNI.OBBond_IsUp(swigCPtr, this);
  }

  public boolean IsDown() {
    return openbabelJNI.OBBond_IsDown(swigCPtr, this);
  }

  public boolean IsWedge() {
    return openbabelJNI.OBBond_IsWedge(swigCPtr, this);
  }

  public boolean IsHash() {
    return openbabelJNI.OBBond_IsHash(swigCPtr, this);
  }

  public boolean IsDoubleBondGeometry() {
    return openbabelJNI.OBBond_IsDoubleBondGeometry(swigCPtr, this);
  }

}
