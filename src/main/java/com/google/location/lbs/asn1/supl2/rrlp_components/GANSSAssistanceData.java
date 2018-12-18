// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GANSSAssistanceData extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_GANSSAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSAssistanceData() {
    super();
    setMinSize(1);
setMaxSize(40);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAssistanceData != null) {
      return ImmutableList.of(TAG_GANSSAssistanceData);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSAssistanceData from encoded stream.
   */
  public static GANSSAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    GANSSAssistanceData result = new GANSSAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAssistanceData from encoded stream.
   */
  public static GANSSAssistanceData fromPerAligned(byte[] encodedBytes) {
    GANSSAssistanceData result = new GANSSAssistanceData();
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

  @Override protected String getTypeName() {
    return "GANSSAssistanceData";
  }
}
