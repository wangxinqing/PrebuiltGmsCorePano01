package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adyc();
    long a;
    long b;

    TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
