package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aebf();
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public MessageEventParcelable(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        byte[] bArr = this.c;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length());
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(", size=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, a2);
    }
}
