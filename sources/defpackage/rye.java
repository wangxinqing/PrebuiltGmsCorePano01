package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;

/* renamed from: rye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rye implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdhBroadcastListenerKey[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Account account = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                bArr = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MdhBroadcastListenerKey(str, account, bArr);
    }
}
