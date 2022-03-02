package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: rcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        float[] fArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        byte b2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    fArr = ivw.y(parcel2, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 5:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    b2 = ivw.e(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new DeviceOrientation(fArr, i, i2, f, f2, j, b2);
    }
}
