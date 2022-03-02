package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.Deletion;

/* renamed from: rlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Deletion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a == 4) {
                j2 = ivw.i(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                j3 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Deletion(account, j, j2, j3);
    }
}
