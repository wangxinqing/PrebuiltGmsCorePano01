package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: ncc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ncc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignResponseData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        String str = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                bArr2 = ivw.t(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                bArr3 = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SignResponseData(bArr, str, bArr2, bArr3);
    }
}
