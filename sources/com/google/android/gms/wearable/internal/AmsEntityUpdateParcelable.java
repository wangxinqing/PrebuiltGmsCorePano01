package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AmsEntityUpdateParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adzh();
    public byte a;
    public final byte b;
    public final String c;

    public AmsEntityUpdateParcelable(byte b2, byte b3, String str) {
        this.a = b2;
        this.b = b3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
            return this.a == amsEntityUpdateParcelable.a && this.b == amsEntityUpdateParcelable.b && this.c.equals(amsEntityUpdateParcelable.c);
        }
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        byte b2 = this.a;
        byte b3 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append(b2);
        sb.append(", mAttributeId=");
        sb.append(b3);
        sb.append(", mValue='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
