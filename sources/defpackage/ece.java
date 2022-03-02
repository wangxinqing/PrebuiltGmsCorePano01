package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.AdsrParams;

/* renamed from: ece  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ece implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdsrParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a == 3) {
                j2 = ivw.i(parcel, readInt);
            } else if (a == 4) {
                j3 = ivw.i(parcel, readInt);
            } else if (a == 5) {
                j4 = ivw.i(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                f = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AdsrParams(j, j2, j3, j4, f);
    }
}
