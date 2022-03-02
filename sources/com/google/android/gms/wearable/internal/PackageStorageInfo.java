package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aebi();
    public final String a;
    public final String b;
    public final long c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
