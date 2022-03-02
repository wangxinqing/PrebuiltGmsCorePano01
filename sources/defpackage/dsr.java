package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;

/* renamed from: dsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Account account = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                z = ivw.c(parcel, readInt);
            } else if (a == 3) {
                z2 = ivw.c(parcel, readInt);
            } else if (a == 4) {
                z3 = ivw.c(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetRecentContextCall$Request(account, z, z2, z3, str);
    }
}
