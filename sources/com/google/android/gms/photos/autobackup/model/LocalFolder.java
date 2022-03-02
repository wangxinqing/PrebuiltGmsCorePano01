package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocalFolder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yjx();
    public final int a;
    public String b;
    public String c;
    public boolean d;

    public LocalFolder(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final String toString() {
        String str = this.b;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append(str);
        sb.append(" (enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
