package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;

/* renamed from: eek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eek implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenBroadcaster$Params[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        Encoding[] encodingArr = null;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
            } else if (a == 4) {
                encodingArr = (Encoding[]) ivw.b(parcel, readInt, Encoding.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new TokenBroadcaster$Params(bArr, i, encodingArr, i2);
    }
}
