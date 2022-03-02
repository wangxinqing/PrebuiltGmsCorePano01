package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwv();
    byte[] a;
    byte[] b;
    WalletCustomTheme c;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
