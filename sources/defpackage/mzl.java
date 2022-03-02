package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;

/* renamed from: mzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAttestationResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 3) {
                bArr2 = ivw.t(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                bArr3 = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AuthenticatorAttestationResponse(bArr, bArr2, bArr3);
    }
}
