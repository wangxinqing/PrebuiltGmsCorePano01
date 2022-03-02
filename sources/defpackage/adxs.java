package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: adxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        Account account = null;
        Bundle bundle = null;
        WalletCustomTheme walletCustomTheme = null;
        int i = 1;
        boolean z = false;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 5:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) ivw.a(parcel2, readInt, WalletCustomTheme.CREATOR);
                    break;
                case 8:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 10:
                    d2 = ivw.n(parcel2, readInt);
                    break;
                case 11:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ApplicationParameters(i, account, bundle, z, i2, walletCustomTheme, i3, d, d2, i4, i5);
    }
}
