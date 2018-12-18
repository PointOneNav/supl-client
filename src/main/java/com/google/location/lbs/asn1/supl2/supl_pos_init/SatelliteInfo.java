package com.google.location.lbs.asn1.supl2.supl_pos_init;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class SatelliteInfo
    extends Asn1SequenceOf<SatelliteInfoElement> {
  //

  private static final Asn1Tag TAG_SatelliteInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SatelliteInfo() {
    super();
    setMinSize(1);
setMaxSize(31);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SatelliteInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SatelliteInfo != null) {
      return ImmutableList.of(TAG_SatelliteInfo);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SatelliteInfo from encoded stream.
   */
  public static SatelliteInfo fromPerUnaligned(byte[] encodedBytes) {
    SatelliteInfo result = new SatelliteInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SatelliteInfo from encoded stream.
   */
  public static SatelliteInfo fromPerAligned(byte[] encodedBytes) {
    SatelliteInfo result = new SatelliteInfo();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SatelliteInfoElement createAndAddValue() {
    SatelliteInfoElement value = new SatelliteInfoElement();
    add(value);
    return value;
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
    StringBuilder builder = new StringBuilder();
    builder.append("SatelliteInfo = [\n");
    final String internalIndent = indent + "  ";
    for (SatelliteInfoElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}