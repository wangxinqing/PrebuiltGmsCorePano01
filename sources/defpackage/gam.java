package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;

/* renamed from: gam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gam implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExportedSymmetricKey[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ExportedSymmetricKey(i, bArr, j);
    }
}
