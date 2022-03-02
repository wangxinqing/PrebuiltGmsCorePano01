package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: rkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        String str5 = null;
        Uri uri = null;
        PlaceOpeningHoursEntity placeOpeningHoursEntity = null;
        PlaceExtendedDetailsEntity placeExtendedDetailsEntity = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    latLng = (LatLng) ivw.a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) ivw.a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 9:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 11:
                    i = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    arrayList2 = ivw.C(parcel2, readInt);
                    break;
                case 19:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 20:
                    arrayList = ivw.B(parcel2, readInt);
                    break;
                case 21:
                    placeOpeningHoursEntity = (PlaceOpeningHoursEntity) ivw.a(parcel2, readInt, PlaceOpeningHoursEntity.CREATOR);
                    break;
                case 22:
                    placeExtendedDetailsEntity = (PlaceExtendedDetailsEntity) ivw.a(parcel2, readInt, PlaceExtendedDetailsEntity.CREATOR);
                    break;
                case 23:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f, latLngBounds, str5, uri, z, f2, i, placeOpeningHoursEntity, placeExtendedDetailsEntity, str6);
    }
}
