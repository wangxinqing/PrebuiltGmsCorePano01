package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.FloorChangeEvent;

/* renamed from: rcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FloorChangeEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 5:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    j4 = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    f = ivw.l(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new FloorChangeEvent(i, i2, j, j2, j3, j4, f);
    }
}
