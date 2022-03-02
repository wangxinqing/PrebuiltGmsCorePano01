package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: rvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                latLng = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 3) {
                latLng2 = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 4) {
                latLng3 = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 5) {
                latLng4 = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) ivw.a(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
