package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxc();
    WalletCustomTheme a;
    boolean b;

    GetClientTokenRequest() {
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme) {
        this(walletCustomTheme, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z) {
        this.a = walletCustomTheme;
        this.b = z;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
