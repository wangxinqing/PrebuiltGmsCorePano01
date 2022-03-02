package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                latLng = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                latLng2 = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }
}
