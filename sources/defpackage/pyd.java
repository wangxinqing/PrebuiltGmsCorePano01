package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: pyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EncryptedAccountData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 2) {
                bArr2 = ivw.t(parcel, readInt);
            } else if (a == 3) {
                bArr3 = ivw.t(parcel, readInt);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new EncryptedAccountData(i, bArr, bArr2, bArr3);
    }
}
