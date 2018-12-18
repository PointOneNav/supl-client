package com.google.location.lbs.asn1.supl2.lpp;

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
public  class GNSS_ID_GLONASS
    extends Asn1SequenceOf<GNSS_ID_GLONASS_SatElement> {
  //

  private static final Asn1Tag TAG_GNSS_ID_GLONASS
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_ID_GLONASS() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ID_GLONASS;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ID_GLONASS != null) {
      return ImmutableList.of(TAG_GNSS_ID_GLONASS);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_ID_GLONASS from encoded stream.
   */
  public static GNSS_ID_GLONASS fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ID_GLONASS result = new GNSS_ID_GLONASS();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ID_GLONASS from encoded stream.
   */
  public static GNSS_ID_GLONASS fromPerAligned(byte[] encodedBytes) {
    GNSS_ID_GLONASS result = new GNSS_ID_GLONASS();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_ID_GLONASS_SatElement createAndAddValue() {
    GNSS_ID_GLONASS_SatElement value = new GNSS_ID_GLONASS_SatElement();
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
    builder.append("GNSS_ID_GLONASS = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_ID_GLONASS_SatElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}