package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;

/* renamed from: nbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nbx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RegisterRequest(i, str, bArr, str2);
    }
}
