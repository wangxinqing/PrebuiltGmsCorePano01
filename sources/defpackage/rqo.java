package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import org.chromium.net.UrlRequest;

/* renamed from: rqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    b2 = ivw.e(parcel2, readInt);
                    break;
                case 3:
                    b3 = ivw.e(parcel2, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) ivw.a(parcel2, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = ivw.e(parcel2, readInt);
                    break;
                case 7:
                    b5 = ivw.e(parcel2, readInt);
                    break;
                case 8:
                    b6 = ivw.e(parcel2, readInt);
                    break;
                case 9:
                    b7 = ivw.e(parcel2, readInt);
                    break;
                case 10:
                    b8 = ivw.e(parcel2, readInt);
                    break;
                case 11:
                    b9 = ivw.e(parcel2, readInt);
                    break;
                case 12:
                    b10 = ivw.e(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    b11 = ivw.e(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    b12 = ivw.e(parcel2, readInt);
                    break;
                case 16:
                    f = ivw.m(parcel2, readInt);
                    break;
                case 17:
                    f2 = ivw.m(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) ivw.a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b13 = ivw.e(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds, b13);
    }
}
