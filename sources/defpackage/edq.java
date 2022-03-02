package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DtmfEncoding;

/* renamed from: edq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DtmfEncoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        AdsrParams adsrParams = null;
        float[] fArr = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    f = ivw.l(parcel, readInt);
                    break;
                case 5:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    i4 = ivw.g(parcel, readInt);
                    break;
                case 8:
                    i5 = ivw.g(parcel, readInt);
                    break;
                case 9:
                    adsrParams = (AdsrParams) ivw.a(parcel, readInt, AdsrParams.CREATOR);
                    break;
                case 10:
                    fArr = ivw.y(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new DtmfEncoding(i, z, f, i2, i3, i4, i5, adsrParams, fArr);
    }
}
