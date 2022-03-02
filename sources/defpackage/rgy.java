package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: rgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgy implements Parcelable.Creator {
    public static void a(ParcelableGeofence parcelableGeofence, Parcel parcel) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 1, parcelableGeofence.a, false);
        ivx.a(parcel, 2, parcelableGeofence.b);
        ivx.a(parcel, 3, parcelableGeofence.c);
        ivx.a(parcel, 4, parcelableGeofence.d);
        ivx.a(parcel, 5, parcelableGeofence.e);
        ivx.a(parcel, 6, parcelableGeofence.f);
        ivx.b(parcel, 7, parcelableGeofence.g);
        ivx.b(parcel, 8, parcelableGeofence.h);
        ivx.b(parcel, 9, parcelableGeofence.i);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    s = ivw.f(parcel2, readInt);
                    break;
                case 4:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 5:
                    d2 = ivw.n(parcel2, readInt);
                    break;
                case 6:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 7:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ParcelableGeofence(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
