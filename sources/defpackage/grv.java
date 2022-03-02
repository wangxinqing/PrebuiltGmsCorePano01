package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;

/* renamed from: grv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class grv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WeatherImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int[] iArr = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                f = ivw.l(parcel, readInt);
            } else if (a == 3) {
                f2 = ivw.l(parcel, readInt);
            } else if (a == 4) {
                f3 = ivw.l(parcel, readInt);
            } else if (a == 5) {
                i = ivw.g(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                iArr = ivw.w(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new WeatherImpl(f, f2, f3, i, iArr);
    }
}
