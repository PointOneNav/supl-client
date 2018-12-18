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

package com.google.location.lbs.asn1.supl2.supl_triggered_start;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class AreaIdList extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AreaIdList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AreaIdList() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AreaIdList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AreaIdList != null) {
      return ImmutableList.of(TAG_AreaIdList);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AreaIdList from encoded stream.
   */
  public static AreaIdList fromPerUnaligned(byte[] encodedBytes) {
    AreaIdList result = new AreaIdList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AreaIdList from encoded stream.
   */
  public static AreaIdList fromPerAligned(byte[] encodedBytes) {
    AreaIdList result = new AreaIdList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private AreaIdSet areaIdSet_;
  public AreaIdSet getAreaIdSet() {
    return areaIdSet_;
  }
  /**
   * @throws ClassCastException if value is not a AreaIdSet
   */
  public void setAreaIdSet(Asn1Object value) {
    this.areaIdSet_ = (AreaIdSet) value;
  }
  public AreaIdSet setAreaIdSetToNewInstance() {
    areaIdSet_ = new AreaIdSet();
    return areaIdSet_;
  }
  
  private AreaIdSetType areaIdSetType_;
  public AreaIdSetType getAreaIdSetType() {
    return areaIdSetType_;
  }
  /**
   * @throws ClassCastException if value is not a AreaIdSetType
   */
  public void setAreaIdSetType(Asn1Object value) {
    this.areaIdSetType_ = (AreaIdSetType) value;
  }
  public AreaIdSetType setAreaIdSetTypeToNewInstance() {
    areaIdSetType_ = new AreaIdSetType();
    return areaIdSetType_;
  }
  
  private GeoAreaMappingList geoAreaMappingList_;
  public GeoAreaMappingList getGeoAreaMappingList() {
    return geoAreaMappingList_;
  }
  /**
   * @throws ClassCastException if value is not a GeoAreaMappingList
   */
  public void setGeoAreaMappingList(Asn1Object value) {
    this.geoAreaMappingList_ = (GeoAreaMappingList) value;
  }
  public GeoAreaMappingList setGeoAreaMappingListToNewInstance() {
    geoAreaMappingList_ = new GeoAreaMappingList();
    return geoAreaMappingList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAreaIdSet() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAreaIdSet();
          }

          @Override public void setToNewInstance() {
            setAreaIdSetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaIdSet.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "areaIdSet : "
                    + getAreaIdSet().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAreaIdSetType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAreaIdSetType();
          }

          @Override public void setToNewInstance() {
            setAreaIdSetTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaIdSetType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "areaIdSetType : "
                    + getAreaIdSetType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGeoAreaMappingList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGeoAreaMappingList();
          }

          @Override public void setToNewInstance() {
            setGeoAreaMappingListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GeoAreaMappingList.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "geoAreaMappingList : "
                    + getGeoAreaMappingList().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("AreaIdList = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
