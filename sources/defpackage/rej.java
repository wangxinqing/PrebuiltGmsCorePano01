package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: rej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rej implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    j4 = ivw.i(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }
}
