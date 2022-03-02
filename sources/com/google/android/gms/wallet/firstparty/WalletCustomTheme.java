package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxg();
    public int a;
    Bundle b;
    String c;

    public WalletCustomTheme() {
        this.a = 0;
        this.b = new Bundle();
        this.c = "";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }

    public WalletCustomTheme(int i, Bundle bundle, String str) {
        this.b = bundle;
        this.a = i;
        this.c = str;
    }
}
