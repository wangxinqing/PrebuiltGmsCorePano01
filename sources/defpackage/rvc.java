package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import org.chromium.net.UrlRequest;

/* renamed from: rvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 3:
                    latLng = (LatLng) ivw.a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 5:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) ivw.a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    f4 = ivw.l(parcel2, readInt);
                    break;
                case 9:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    f5 = ivw.l(parcel2, readInt);
                    break;
                case 11:
                    f6 = ivw.l(parcel2, readInt);
                    break;
                case 12:
                    f7 = ivw.l(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }
}
