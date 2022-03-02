package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: rqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) ivw.a(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = ivw.h(parcel, readInt);
                    break;
                case 6:
                    b2 = ivw.e(parcel, readInt);
                    break;
                case 7:
                    b3 = ivw.e(parcel, readInt);
                    break;
                case 8:
                    b4 = ivw.e(parcel, readInt);
                    break;
                case 9:
                    b5 = ivw.e(parcel, readInt);
                    break;
                case 10:
                    b6 = ivw.e(parcel, readInt);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) ivw.a(parcel, readInt, StreetViewSource.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
    }
}
