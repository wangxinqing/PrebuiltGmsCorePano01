package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: adwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adwv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 3) {
                bArr2 = ivw.t(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                walletCustomTheme = (WalletCustomTheme) ivw.a(parcel, readInt, WalletCustomTheme.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ExecuteBuyFlowRequest(bArr, bArr2, walletCustomTheme);
    }
}
