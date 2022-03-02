package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new f();
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VersionInfoParcel(int r9, int r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 37
            r0.<init>(r1)
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ".0"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r6 = 1
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.VersionInfoParcel.<init>(int, int):void");
    }

    public static VersionInfoParcel a() {
        return new VersionInfoParcel(201216073, 201216073);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
