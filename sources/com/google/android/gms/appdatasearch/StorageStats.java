package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new duf();
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.a = registeredPackageInfoArr;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, (Parcelable[]) this.a, i);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
