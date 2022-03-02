package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int g;

    static {
        ErrorCode.class.getSimpleName();
        CREATOR = new nbs();
    }

    private ErrorCode(int i) {
        this.g = i;
    }

    public static ErrorCode a(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.g) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(i);
        return OTHER_ERROR;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
    }
}
