package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdsrParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ece();
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;

    public AdsrParams(long j, long j2, long j3, long j4, float f) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = f;
    }

    public final long a() {
        return this.a + this.b + this.c + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdsrParams) {
            AdsrParams adsrParams = (AdsrParams) obj;
            return this.a == adsrParams.a && this.b == adsrParams.b && this.c == adsrParams.c && this.d == adsrParams.d && this.e == adsrParams.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Float.valueOf(this.e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
