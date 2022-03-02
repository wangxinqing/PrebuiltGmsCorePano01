package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;

/* renamed from: dtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisteredPackageInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                j2 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RegisteredPackageInfo(str, j, z, j2);
    }
}
