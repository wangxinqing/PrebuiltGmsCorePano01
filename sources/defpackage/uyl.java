package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: uyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Strategy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        i2 = ivw.g(parcel, readInt);
                        break;
                    case 2:
                        i3 = ivw.g(parcel, readInt);
                        break;
                    case 3:
                        i4 = ivw.g(parcel, readInt);
                        break;
                    case 4:
                        z = ivw.c(parcel, readInt);
                        break;
                    case 5:
                        i5 = ivw.g(parcel, readInt);
                        break;
                    case 6:
                        i6 = ivw.g(parcel, readInt);
                        break;
                    case 7:
                        i7 = ivw.g(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Strategy(i, i2, i3, i4, z, i5, i6, i7);
    }
}
