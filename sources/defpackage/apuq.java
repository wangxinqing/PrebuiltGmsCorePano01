package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.MfaInfo;

/* renamed from: apuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MfaInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str3 = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MfaInfo(str, str2, str3, j);
    }
}
