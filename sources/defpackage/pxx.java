package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: pxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AccountData(str, str2);
    }
}
