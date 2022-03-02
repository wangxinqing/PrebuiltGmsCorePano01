package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aagk();
    public Status a;
    public GetStorageStatsCall$PackageStats[] b;
    public long c;
    public long d;
    public long e;

    public GetStorageStatsCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.a = status;
        this.b = getStorageStatsCall$PackageStatsArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
