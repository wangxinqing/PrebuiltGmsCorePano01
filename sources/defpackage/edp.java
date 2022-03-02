package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.DsssEncoding;
import org.chromium.net.UrlRequest;

/* renamed from: edp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DsssEncoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        float f2 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 10:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    i6 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    i7 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i8 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new DsssEncoding(i, z, z2, i2, i3, f, i4, f2, i5, i6, i7, i8);
    }
}
