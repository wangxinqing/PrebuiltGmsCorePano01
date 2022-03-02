package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwk();
    public final int a;
    String b;
    CommonWalletObject c;

    OfferWalletObject() {
        this.a = 3;
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = new adxv(new CommonWalletObject()).a;
            commonWalletObject2.a = str;
            this.c = commonWalletObject2;
            return;
        }
        this.c = commonWalletObject;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, (String) null, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
