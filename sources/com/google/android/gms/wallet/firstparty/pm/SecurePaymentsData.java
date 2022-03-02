package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecurePaymentsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxj();
    int a;
    String b;

    public SecurePaymentsData(int i, String str) {
        boolean z;
        this.a = i;
        this.b = str;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "SecurePaymentsData.key must be > 0");
        iva.b(str == null ? false : z2, "SecurePaymentsData.value must not be null");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
