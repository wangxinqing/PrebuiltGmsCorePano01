package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new duc();
    public final String a;
    public final boolean b;
    public final int c;

    public Section(String str) {
        this(str, false, 0);
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(str2).length());
        sb.append("semantic#");
        sb.append(str);
        sb.append(';');
        sb.append(str2);
        return sb.toString();
    }

    public Section(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
