package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adya();
    String a;
    LoyaltyPointsBalance b;
    @Deprecated
    TimeInterval c;

    LoyaltyPoints() {
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = timeInterval;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 5, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
