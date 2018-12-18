package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Integer;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class ARFCN_ValueEUTRA_v9a0 extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ARFCN_ValueEUTRA_v9a0
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ARFCN_ValueEUTRA_v9a0() {
    super();
    setValueRange(maxEARFCN_Plus1.VALUE, maxEARFCN2.VALUE);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ARFCN_ValueEUTRA_v9a0;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ARFCN_ValueEUTRA_v9a0 != null) {
      return ImmutableList.of(TAG_ARFCN_ValueEUTRA_v9a0);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ARFCN_ValueEUTRA_v9a0 from encoded stream.
   */
  public static ARFCN_ValueEUTRA_v9a0 fromPerUnaligned(byte[] encodedBytes) {
    ARFCN_ValueEUTRA_v9a0 result = new ARFCN_ValueEUTRA_v9a0();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ARFCN_ValueEUTRA_v9a0 from encoded stream.
   */
  public static ARFCN_ValueEUTRA_v9a0 fromPerAligned(byte[] encodedBytes) {
    ARFCN_ValueEUTRA_v9a0 result = new ARFCN_ValueEUTRA_v9a0();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "ARFCN_ValueEUTRA_v9a0 = " + getInteger() + ";\n";
  }
}