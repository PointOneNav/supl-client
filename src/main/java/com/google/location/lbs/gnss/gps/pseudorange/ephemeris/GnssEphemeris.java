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

package com.google.location.lbs.gnss.gps.pseudorange.ephemeris;

import com.google.location.lbs.common.gnss.GnssTime;

/** A class representing the ephemeris of any GNSS satellite */
public abstract class GnssEphemeris {

  /** The satellite (or space vehicle, SV) ID associated with this ephemeris */
  public final int svid;

  protected GnssEphemeris(Builder<?> builder) {
    svid = builder.svid;
  }

  /**
   * Compares the freshness of this instance of {@link GnssEphemeris} versus the input {@code
   * other}.
   *
   * @param other another ephemeris to be compared with this instance
   * @return positive value if the input ephemeris is older, negative value if newer, or zero if
   *     they belong to the same time
   */
  public abstract int newerThan(GnssEphemeris other);

  /** Returns {@code true} if the time of interest is outside of the ephemeris valid period. */
  public abstract boolean isExpired(GnssTime gnssTimeOfInterest);

  /** Returns the number of seconds elapsed from the time of ephemeris to the time of interest. */
  public abstract double computeElapsedSecondsFromToe(GnssTime gnssTimeOfInterest);

  /** Builder for {@link GnssEphemeris} */
  public abstract static class Builder<T extends Builder<T>> {

    private int svid;

    public Builder() {}

    public abstract T getThis();

    /** Sets the {@link #svid}. */
    public T setSvid(int svid) {
      this.svid = svid;
      return getThis();
    }
  }
}
