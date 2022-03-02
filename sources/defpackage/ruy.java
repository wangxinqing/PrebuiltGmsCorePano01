package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: ruy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                latLng = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 3) {
                f = ivw.l(parcel, readInt);
            } else if (a == 4) {
                f2 = ivw.l(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                f3 = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CameraPosition(latLng, f, f2, f3);
    }
}
