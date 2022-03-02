package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HarmfulAppsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zzj();
    public final long a;
    public final HarmfulAppsData[] b;
    public final int c;
    public final boolean d;

    public HarmfulAppsInfo(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.a = j;
        this.b = harmfulAppsDataArr;
        this.d = z;
        if (!z) {
            this.c = -1;
        } else {
            this.c = i;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, (Parcelable[]) this.b, i);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
