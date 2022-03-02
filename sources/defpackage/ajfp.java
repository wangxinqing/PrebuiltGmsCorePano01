package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.quake.ShakeVettingHints;

/* renamed from: ajfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShakeVettingHints[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 5:
                    d2 = ivw.n(parcel2, readInt);
                    break;
                case 6:
                    d3 = ivw.n(parcel2, readInt);
                    break;
                case 7:
                    d4 = ivw.n(parcel2, readInt);
                    break;
                case 8:
                    d5 = ivw.n(parcel2, readInt);
                    break;
                case 9:
                    d6 = ivw.n(parcel2, readInt);
                    break;
                case 10:
                    i = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ShakeVettingHints(j, z, z2, d, d2, d3, d4, d5, d6, i);
    }
}
