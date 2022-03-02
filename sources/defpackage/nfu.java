package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: nfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FontMatchSpec[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    f = ivw.l(parcel, readInt);
                    break;
                case 4:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    f2 = ivw.l(parcel, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FontMatchSpec(i, str, f, i2, f2, z);
    }
}
