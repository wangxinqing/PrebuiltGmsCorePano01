package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String b;

    static {
        CREATOR = new mzx();
    }

    private PublicKeyCredentialType() {
        this.b = r3;
    }

    public static PublicKeyCredentialType a(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.b)) {
                return publicKeyCredentialType;
            }
        }
        throw new mzy(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
