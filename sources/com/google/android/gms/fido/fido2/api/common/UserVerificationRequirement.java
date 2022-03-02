package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String d;

    static {
        CREATOR = new nad();
    }

    private UserVerificationRequirement(String str) {
        this.d = str;
    }

    public static UserVerificationRequirement a(String str) {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.d)) {
                return userVerificationRequirement;
            }
        }
        throw new nae(str);
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
