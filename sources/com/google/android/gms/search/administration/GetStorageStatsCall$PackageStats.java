package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetStorageStatsCall$PackageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aagi();
    public String a;
    public long b;
    public boolean c;
    public long d;

    public GetStorageStatsCall$PackageStats() {
    }

    public GetStorageStatsCall$PackageStats(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
