package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;

/* renamed from: qfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DiagnosticInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Account account = null;
        Account[] accountArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a == 4) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 5) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                accountArr = (Account[]) ivw.b(parcel, readInt, Account.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new DiagnosticInfo(i, j, i2, account, accountArr);
    }
}
