package com.google.android.gms.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppUsageResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ebv();
    public final String a;
    public final int b;
    public final long c;

    public AppUsageResult(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
