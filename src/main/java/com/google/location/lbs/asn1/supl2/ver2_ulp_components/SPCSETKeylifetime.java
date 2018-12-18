package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

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
public  class SPCSETKeylifetime extends Asn1Integer {
  //

  private static final Asn1Tag TAG_SPCSETKeylifetime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SPCSETKeylifetime() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("24"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SPCSETKeylifetime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SPCSETKeylifetime != null) {
      return ImmutableList.of(TAG_SPCSETKeylifetime);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SPCSETKeylifetime from encoded stream.
   */
  public static SPCSETKeylifetime fromPerUnaligned(byte[] encodedBytes) {
    SPCSETKeylifetime result = new SPCSETKeylifetime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SPCSETKeylifetime from encoded stream.
   */
  public static SPCSETKeylifetime fromPerAligned(byte[] encodedBytes) {
    SPCSETKeylifetime result = new SPCSETKeylifetime();
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
    return "SPCSETKeylifetime = " + getInteger() + ";\n";
  }
}