package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adye();
    String a;
    String b;
    TimeInterval c;
    @Deprecated
    UriData d;
    @Deprecated
    UriData e;

    WalletObjectMessage() {
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.a = str;
        this.b = str2;
        this.c = timeInterval;
        this.d = uriData;
        this.e = uriData2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.b(parcel, a2);
    }
}
