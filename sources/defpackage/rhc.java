package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: rhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddPlaceRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        LatLng latLng = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) ivw.a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    arrayList = ivw.B(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AddPlaceRequest(str, latLng, str2, arrayList, str3, uri);
    }
}
