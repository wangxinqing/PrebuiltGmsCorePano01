package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: rvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                f = ivw.l(parcel, readInt);
            } else if (a == 3) {
                f2 = ivw.l(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                f3 = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }
}
