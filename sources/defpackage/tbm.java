package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: tbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserKey[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Long l = null;
        AuthType authType = null;
        String str = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                l = ivw.j(parcel, readInt);
            } else if (a == 2) {
                authType = (AuthType) ivw.a(parcel, readInt, AuthType.CREATOR);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                l2 = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new UserKey(l, authType, str, l2);
    }
}
