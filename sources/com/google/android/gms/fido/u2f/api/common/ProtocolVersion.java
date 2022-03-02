package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String d;

    static {
        CREATOR = new nbv();
    }

    private ProtocolVersion(String str) {
        this.d = str;
    }

    public static ProtocolVersion a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.d)) {
                return protocolVersion;
            }
        }
        throw new nbw(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
    }
}
