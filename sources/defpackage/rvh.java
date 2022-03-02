package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import org.chromium.net.UrlRequest;

/* renamed from: rvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    latLng = (LatLng) ivw.a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 6:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 7:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    f3 = ivw.l(parcel2, readInt);
                    break;
                case 12:
                    f4 = ivw.l(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    f5 = ivw.l(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    f6 = ivw.l(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    f7 = ivw.l(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }
}
