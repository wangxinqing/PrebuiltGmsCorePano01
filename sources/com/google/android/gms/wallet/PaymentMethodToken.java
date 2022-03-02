package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwm();
    int a;
    String b;

    private PaymentMethodToken() {
    }

    public PaymentMethodToken(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
