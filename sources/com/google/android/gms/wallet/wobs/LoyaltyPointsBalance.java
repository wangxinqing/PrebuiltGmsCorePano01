package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxz();
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }

    public LoyaltyPointsBalance(int i, String str, double d2, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d2;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }
}
