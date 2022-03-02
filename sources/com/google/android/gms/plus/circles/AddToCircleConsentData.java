package com.google.android.gms.plus.circles;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddToCircleConsentData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ysi();
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public AddToCircleConsentData(Parcel parcel) {
        this.a = parcel.readInt() != 0;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AddToCircleConsentData) {
            AddToCircleConsentData addToCircleConsentData = (AddToCircleConsentData) obj;
            if (this.a != addToCircleConsentData.a || !ius.a(this.b, addToCircleConsentData.b) || !ius.a(this.c, addToCircleConsentData.c) || !ius.a(this.d, addToCircleConsentData.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public AddToCircleConsentData(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
