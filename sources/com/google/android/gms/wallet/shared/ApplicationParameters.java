package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxs();
    public int a;
    public Account b;
    public Bundle c;
    boolean d;
    int e;
    public WalletCustomTheme f;
    int g;
    double h;
    double i;
    int j;
    int k;

    public ApplicationParameters() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }

    public ApplicationParameters(int i2, Account account, Bundle bundle, boolean z, int i3, WalletCustomTheme walletCustomTheme, int i4, double d2, double d3, int i5, int i6) {
        this.a = i2;
        this.b = account;
        this.c = bundle;
        this.d = z;
        this.e = i3;
        this.f = walletCustomTheme;
        this.g = i4;
        this.h = d2;
        this.i = d3;
        this.j = i5;
        this.k = i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i2, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, i2, false);
        ivx.b(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.b(parcel, 12, this.k);
        ivx.b(parcel, a2);
    }
}
