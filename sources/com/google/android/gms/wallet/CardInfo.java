package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwe();
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    private CardInfo() {
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.b(parcel, a2);
    }
}
